/*
 * Copyright © 2002 Sun Microsystems, Inc. All rights reserved.
 * SUN PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

//
// Workfile:@(#)Wallet.java	1.8
// Version:1.8
// Date:02/01/02
// 
// Archive:  /Products/Europa/samples/com/sun/javacard/samples/wallet/Wallet.java 
// Modified:02/01/02 16:39:06
// Original author: Zhiqun Chen
//

package com.sun.javacard.samples.wallet;

import javacard.framework.*;
//import javacardx.framework.*;
public class Wallet extends Applet { 
	private byte fault_resistant_byte[] = new byte[10];	/* help array to store negations of local byte variables*/ 
	private short fault_resistant_short[] = new short[1];	/* help array to store negations of local short variables*/ 
	private short fault_resistant_short_g[] = new short[1];	/* help array to store negations of global short variables*/

  /* constants declaration */

  // code of CLA byte in the command APDU header
  final static byte Wallet_CLA =(byte)0x80;

  // codes of INS byte in the command APDU header
  final static byte VERIFY = (byte) 0x20;
  final static byte CREDIT = (byte) 0x30;
  final static byte DEBIT = (byte) 0x40;
  final static byte GET_BALANCE = (byte) 0x50;

  // maximum balance
  final static short MAX_BALANCE = 0x7FFF;
  // maximum transaction amount
  final static byte MAX_TRANSACTION_AMOUNT = 127;

  // maximum number of incorrect tries before the
  // PIN is blocked
  final static byte PIN_TRY_LIMIT =(byte)0x03;
  // maximum size PIN
  final static byte MAX_PIN_SIZE =(byte)0x08;

  // signal that the PIN verification failed
  final static short SW_VERIFICATION_FAILED =
0x6300;
  // signal the the PIN validation is required
  // for a credit or a debit transaction
  final static short SW_PIN_VERIFICATION_REQUIRED =
                                            0x6301;
  // signal invalid transaction amount
  // amount > MAX_TRANSACTION_AMOUNT or amount < 0
  final static short SW_INVALID_TRANSACTION_AMOUNT = 0x6A83;

  // signal that the balance exceed the maximum
  final static short SW_EXCEED_MAXIMUM_BALANCE =
0x6A84;
  // signal the the balance becomes negative
  final static short SW_NEGATIVE_BALANCE = 0x6A85;

  /* instance variables declaration */
  OwnerPIN pin;
  short balance=__set_short_g((short)(0),(short)0);

  private Wallet (byte[] bArray,short bOffset,byte bLength){
      
    // It is good programming practice to allocate
    // all the memory that an applet needs during
    // its lifetime inside the constructor
    pin = new OwnerPIN(PIN_TRY_LIMIT,   MAX_PIN_SIZE);

    byte iLen = __set_byte((byte)(bArray[bOffset]),(short)0); // aid length
    bOffset = (short) (bOffset+__get_byte(iLen,(short)0)+1);
    byte cLen = __set_byte((byte)(bArray[bOffset]),(short)1); // info length
    bOffset = (short) (bOffset+__get_byte(cLen,(short)1)+1);
    byte aLen = __set_byte((byte)(bArray[bOffset]),(short)2); // applet data length
    
    // The installation parameters contain the PIN
    // initialization value
    pin.update(bArray, (short)(bOffset+1), __get_byte(aLen,(short)2));
    register();

  } // end of the constructor

  public static void install(byte[] bArray, short bOffset, byte bLength){
    // create a Wallet applet instance
    new Wallet(bArray, bOffset, bLength);
  } // end of install method
  public boolean select() {

    // The applet declines to be selected
    // if the pin is blocked.
    if ( pin.getTriesRemaining() == 0 )
       return false;

    return true;

  }// end of select method
  public void deselect() {

    // reset the pin value
    pin.reset();

  }
    
  public void process(APDU apdu) {

    // APDU object carries a byte array (buffer) to
    // transfer incoming and outgoing APDU header
    // and data bytes between card and CAD

    // At this point, only the first header bytes
    // [CLA, INS, P1, P2, P3] are available in
    // the APDU buffer.
    // The interface javacard.framework.ISO7816
    // declares constants to denote the offset of
    // these bytes in the APDU buffer

    byte[] buffer = apdu.getBuffer();
    // check SELECT APDU command
    
    buffer[ISO7816.OFFSET_CLA] = (byte)(buffer[ISO7816.OFFSET_CLA] & (byte)0xFC);
    
    if ((buffer[ISO7816.OFFSET_CLA] == 0) &&
       (buffer[ISO7816.OFFSET_INS] == (byte)(0xA4)) )
      return;
    // verify the reset of commands have the
    // correct CLA byte, which specifies the
    // command structure
    if (buffer[ISO7816.OFFSET_CLA] != Wallet_CLA)
       ISOException.throwIt
(ISO7816.SW_CLA_NOT_SUPPORTED);
    switch (buffer[ISO7816.OFFSET_INS]) {
      case GET_BALANCE:   getBalance(apdu);
                          return;
      case DEBIT:         debit(apdu);
                          return;
      case CREDIT:        credit(apdu);
                          return;
      case VERIFY:        verify(apdu);
                          return;
      default:       ISOException.throwIt
                    (ISO7816.SW_INS_NOT_SUPPORTED);
    }

 }   // end of process method

 private void credit(APDU apdu) {

   // access authentication
   if ( ! pin.isValidated() )
 ISOException.throwIt(
        SW_PIN_VERIFICATION_REQUIRED);

    byte[] buffer = apdu.getBuffer();

    // Lc byte denotes the number of bytes in the
    // data field of the command APDU
    byte numBytes = __set_byte((byte)(buffer[ISO7816.OFFSET_LC]),(short)3);

    // indicate that this APDU has incoming data
    // and receive data starting from the offset
    // ISO7816.OFFSET_CDATA following the 5 header
    // bytes.
    byte byteRead =
              __set_byte((byte)((byte)(apdu.setIncomingAndReceive())),(short)4);

    // it is an error if the number of data bytes
    // read does not match the number in Lc byte
    if ( ( __get_byte(numBytes,(short)3) != 1 ) || (__get_byte(byteRead,(short)4) != 1) )
     ISOException.throwIt(ISO7816.SW_WRONG_LENGTH);

    // get the credit amount
    byte creditAmount =
                  __set_byte((byte)(buffer[ISO7816.OFFSET_CDATA]),(short)5);

    // check the credit amount
    if ( ( __get_byte(creditAmount,(short)5) > MAX_TRANSACTION_AMOUNT)
         || ( __get_byte(creditAmount,(short)5) < 0 ) )
        ISOException.throwIt
                   (SW_INVALID_TRANSACTION_AMOUNT);

    // check the new balance
    if ( (short)( __get_short_g(balance,(short)0) + __get_byte(creditAmount,(short)5))  > MAX_BALANCE )
       ISOException.throwIt
                     (SW_EXCEED_MAXIMUM_BALANCE);

    // credit the amount
    balance=__set_short_g((short)((short)(__get_short_g(balance,(short)0) + __get_byte(creditAmount,(short)5))),(short)0);

  } // end of deposit method

  private void debit(APDU apdu) {

    // access authentication
    if ( ! pin.isValidated() )
       ISOException.throwIt
(SW_PIN_VERIFICATION_REQUIRED);

    byte[] buffer = apdu.getBuffer();

    byte numBytes =
            __set_byte((byte)((byte)(buffer[ISO7816.OFFSET_LC])),(short)6);

    byte byteRead =
            __set_byte((byte)((byte)(apdu.setIncomingAndReceive())),(short)7);

    if ( ( __get_byte(numBytes,(short)6) != 1 ) || (__get_byte(byteRead,(short)7) != 1) )
       ISOException.throwIt
                        (ISO7816.SW_WRONG_LENGTH);

    // get debit amount
    byte debitAmount =
                     __set_byte((byte)(buffer[ISO7816.OFFSET_CDATA]),(short)8);

    // check debit amount
    if ( ( __get_byte(debitAmount,(short)8) > MAX_TRANSACTION_AMOUNT)
         ||  ( __get_byte(debitAmount,(short)8) < 0 ) )
       ISOException.throwIt
                   (SW_INVALID_TRANSACTION_AMOUNT);

    // check the new balance
    if ( (short)( __get_short_g(balance,(short)0) - __get_byte(debitAmount,(short)8) ) < (short)0 )
         ISOException.throwIt(SW_NEGATIVE_BALANCE);

    balance=__set_short_g((short)((short) (__get_short_g(balance,(short)0) - __get_byte(debitAmount,(short)8))),(short)0);

  } // end of debit method

  private void getBalance(APDU apdu) {

    byte[] buffer = apdu.getBuffer();

    // inform system that the applet has finished
    // processing the command and the system should
    // now prepare to construct a response APDU
    // which contains data field
    short le = __set_short((short)(apdu.setOutgoing()),(short)0);

    if ( __get_short(le,(short)0) < 2 )
       ISOException.throwIt
                       (ISO7816.SW_WRONG_LENGTH);

    //informs the CAD the actual number of bytes
    //returned
    apdu.setOutgoingLength((byte)2);

    // move the balance data into the APDU buffer
    // starting at the offset 0
    buffer[0] = (byte)(__get_short_g(balance,(short)0) >> 8);
    buffer[1] = (byte)(__get_short_g(balance,(short)0) & 0xFF);

    // send the 2-byte balance at the offset
    // 0 in the apdu buffer
    apdu.sendBytes((short)0, (short)2);

  } // end of getBalance method

  private void verify(APDU apdu) {

    byte[] buffer = apdu.getBuffer();
    // retrieve the PIN data for validation.
  byte byteRead =
            __set_byte((byte)((byte)(apdu.setIncomingAndReceive())),(short)9);

  // check pin
    // the PIN data is read into the APDU buffer
  // at the offset ISO7816.OFFSET_CDATA
  // the PIN data length = byteRead
  if ( pin.check(buffer, ISO7816.OFFSET_CDATA,
       __get_byte(byteRead,(short)9)) == false )
     ISOException.throwIt
                      (SW_VERIFICATION_FAILED);

} // end of validate method
 
	/**
	 *	This method will compare negation of input value with stored negation. 
	 * 	In case of error an exception will be thrown. 
	 *@param value value, which is expected
	 *@param id id of variable in array of shadow copies
	 *@throw Exception if value is corrupted
	 */
	private byte __get_byte(byte value, short id){
		if (fault_resistant_byte[id] != (byte)(value ^ (byte)((1<<7)-1))) 
			throw new RuntimeException("Error induction");
		return value;
	}	/**
	 *	This method will set value in help array to negation of original value.
	 *@param value value to set
	 *@param id id of variable in array of shadow copies
	 *@return value value, which was set
	 */
	private byte __set_byte(byte value, short id){
		fault_resistant_byte[id] = (byte)(value ^ (byte)((1<<7)-1));
		return value;
	} 
	/**
	 *	This method will compare negation of input value with stored negation. 
	 * 	In case of error an exception will be thrown. 
	 *@param value value, which is expected
	 *@param id id of variable in array of shadow copies
	 *@throw Exception if value is corrupted
	 */
	private short __get_short(short value, short id){
		if (fault_resistant_short[id] != (short)(value ^ (short)((1<<15)-1))) 
			throw new RuntimeException("Error induction");
		return value;
	}	/**
	 *	This method will set value in help array to negation of original value.
	 *@param value value to set
	 *@param id id of variable in array of shadow copies
	 *@return value value, which was set
	 */
	private short __set_short(short value, short id){
		fault_resistant_short[id] = (short)(value ^ (short)((1<<15)-1));
		return value;
	} 
	/**
	 *	This method will compare negation of input value with stored negation. 
	 * 	In case of error an exception will be thrown. 
	 *@param value value, which is expected
	 *@param id id of variable in array of shadow copies
	 *@throw Exception if value is corrupted
	 */
	private short __get_short_g(short value, short id){
		if (fault_resistant_short_g[id] != (short)(value ^ (short)((1<<15)-1))) 
			throw new RuntimeException("Error induction");
		return value;
	}	/**
	 *	This method will set value in help array to negation of original value.
	 *@param value value to set
	 *@param id id of variable in array of shadow copies
	 *@return value value, which was set
	 */
	private short __set_short_g(short value, short id){
		fault_resistant_short_g[id] = (short)(value ^ (short)((1<<15)-1));
		return value;
	}} // end of class Wallet

