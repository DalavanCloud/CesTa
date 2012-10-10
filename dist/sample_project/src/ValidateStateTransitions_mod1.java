package org.cesta.sample_project;

import javacard.framework.*;

/**
 * Test class with state transitions.  
 * 
 * @author Tobias Smolka
 */
public class TestValidateStateTransitions extends Applet {

	/***** BEGIN declareFunctionConstants *****/
	public static final short FUNC_blockCard = 465;
	public static final short FUNC_install = 627;
	public static final short FUNC_select = 930;

	/***** END declareFunctionConstants *****/

	/***** BEGIN declareStateConstants *****/
	public static final short STATE_BLOCKED = 465;
	public static final short STATE_INSTALLED = 627;
	public static final short STATE_SELECTED = 930;
	public static final short STATE_UPLOADED = 1254;

	/***** END declareStateConstants *****/
		/***** BEGIN ORIGINAL [removeVariableDeclaratorList_1] *****
	public final static short STATE_INSTALLED = 1; 
	***** END ORIGINAL [removeVariableDeclaratorList_1] *****/ 

		/***** BEGIN ORIGINAL [removeVariableDeclaratorList_2] *****
	public final static short STATE_UPLOADED = 2; 
	***** END ORIGINAL [removeVariableDeclaratorList_2] *****/ 

	
	short currentState = STATE_UPLOADED;
	
	private TestValidateStateTransitions(byte[] bArray,short bOffset,byte bLength){
		register();
	}
	public static void install(byte[] bArray, short bOffset, byte bLength){

	_VerifyAllowedFunction(FUNC_install, getState());
		setState(STATE_INSTALLED);
	}
	private short getState(){
		return currentState;
	}
	private void setState(short newState){

	_VerifyAllowedTransition(getState(), newState);		
		currentState = newState;
	}
	public void testSomething(){
		// this function will be ignored
	}


	/**
	 *	Checks whether given transition is allowed or not. 
	 *@param oldState old state
	 *@param newState new state
	 *@throws IsoException in case that transition is not allowed
	 */
	private static void _VerifyAllowedTransition(short oldState, short newState){
		switch (oldState){
			case STATE_INSTALLED: {
				if (newState == STATE_SELECTED) {break;}
				if (newState == STATE_BLOCKED) {break;}

				ISOException.throwIt(ISO7816.SW_SECURITY_STATUS_NOT_SATISFIED);
			}
			case STATE_SELECTED: {
				if (newState == STATE_BLOCKED) {break;}

				ISOException.throwIt(ISO7816.SW_SECURITY_STATUS_NOT_SATISFIED);
			}
			case STATE_UPLOADED: {
				if (newState == STATE_INSTALLED) {break;}

				ISOException.throwIt(ISO7816.SW_SECURITY_STATUS_NOT_SATISFIED);
			}

			default:
				ISOException.throwIt(ISO7816.SW_SECURITY_STATUS_NOT_SATISFIED);
		}
	}

	/**
	 *	Checks whether given function is allowed in given state or not. 
	 *@param function function to check 
	 *@param state state to check
	 *@throws IsoException in case that function is not allowed in given state
	 */
	 private static void _VerifyAllowedFunction(short function, short state){
		switch (function){
			case FUNC_blockCard: {
				if (state == STATE_INSTALLED) break;
				if (state == STATE_SELECTED) break;

				ISOException.throwIt(ISO7816.SW_SECURITY_STATUS_NOT_SATISFIED);}
			case FUNC_install: {
				if (state == STATE_UPLOADED) break;

				ISOException.throwIt(ISO7816.SW_SECURITY_STATUS_NOT_SATISFIED);}
			case FUNC_select: {
				if (state == STATE_INSTALLED) break;

				ISOException.throwIt(ISO7816.SW_SECURITY_STATUS_NOT_SATISFIED);}

			default:
				ISOException.throwIt(ISO7816.SW_SECURITY_STATUS_NOT_SATISFIED);
		}
	}}
