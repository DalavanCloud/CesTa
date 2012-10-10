package org.cesta.sample_project;

/**
 * Test class with if constructions.
 * 
 * @author Tobias Smolka
 */

import javacard.security.RandomData;
import javacard.framework.ISO7816;
import javacard.framework.JCSystem;
import javacard.security.CryptoException;
import javacard.framework.ISOException;
public class IfSwitchReplacement {
	public IfSwitchReplacement() {
		short i=1,j;
	/***** BEGIN ORIGINAL [IF_SWITCH_1] *****
			if (i==1) j=10;
			else j=20; 
	***** END ORIGINAL [IF_SWITCH_1] *****/ 
	/***** BEGIN REPLACE [IF_SWITCH_1] *****/ 
	IF_SWITCH_1: {
		switch (__getRandomBit()){
			case -1: 
				ISOException.throwIt(ISO7816.SW_CONDITIONS_NOT_SATISFIED);
			case 0:
				if ((i==1)) {
					j=10;
				} else {
					j=20;
				}
	break IF_SWITCH_1;
			case 1:
				if (!(i==1)) {
					j=20;
				} else {
					j=10;
				}
	break IF_SWITCH_1;
			default:
				ISOException.throwIt(ISO7816.SW_CONDITIONS_NOT_SATISFIED);
		}
	}
	/***** END REPLACE [IF_SWITCH_1] *****/ 
	}
	public void test(){
		short i = 10, j=20;
	/***** BEGIN ORIGINAL [IDENTIFY_BLOCKS_1] *****
			for (i=1;i<10;i++){
				if (i==2) break;
				else continue;
			} 
	***** END ORIGINAL [IDENTIFY_BLOCKS_1] *****/ 
	/***** BEGIN REPLACE [IDENTIFY_BLOCKS_1] *****/ 
	BLOCK_1: { for (i=1;i<10;i++){
	/***** BEGIN ORIGINAL [IF_SWITCH_2] *****
					if (i==2) break BLOCK_1;
					else continue BLOCK_1; 
	***** END ORIGINAL [IF_SWITCH_2] *****/ 
	/***** BEGIN REPLACE [IF_SWITCH_2] *****/ 
	IF_SWITCH_2: {
		switch (__getRandomBit()){
			case -1: 
				ISOException.throwIt(ISO7816.SW_CONDITIONS_NOT_SATISFIED);
			case 0:
				if ((i==2)) {
					break BLOCK_1;
				} else {
					continue BLOCK_1;
				}
	break IF_SWITCH_2;
			case 1:
				if (!(i==2)) {
					continue BLOCK_1;
				} else {
					break BLOCK_1;
				}
	break IF_SWITCH_2;
			default:
				ISOException.throwIt(ISO7816.SW_CONDITIONS_NOT_SATISFIED);
		}
	}
	/***** END REPLACE [IF_SWITCH_2] *****/ 
			} }
	/***** END REPLACE [IDENTIFY_BLOCKS_1] *****/ 
		
	/***** BEGIN ORIGINAL [IF_SWITCH_3] *****
			if (i==20){
				if (j==10) j=20;
				else j=30;
			} else if (i==30) {			
				if (j==20) j=40;
				else j=50;
			} else {
				j=80;
			} 
	***** END ORIGINAL [IF_SWITCH_3] *****/ 
	/***** BEGIN REPLACE [IF_SWITCH_3] *****/ 
	IF_SWITCH_3: {
		switch (__getRandomBit()){
			case -1: 
				ISOException.throwIt(ISO7816.SW_CONDITIONS_NOT_SATISFIED);
			case 0:
				if ((i==20)) {
					{
						/***** BEGIN ORIGINAL [IF_SWITCH_4] *****
									if (j==10) j=20;
									else j=30; 
						***** END ORIGINAL [IF_SWITCH_4] *****/ 
						/***** BEGIN REPLACE [IF_SWITCH_4] *****/ 
						IF_SWITCH_4: {
							switch (__getRandomBit()){
								case -1: 
									ISOException.throwIt(ISO7816.SW_CONDITIONS_NOT_SATISFIED);
								case 0:
									if ((j==10)) {
										j=20;
									} else {
										j=30;
									}
						break IF_SWITCH_4;
								case 1:
									if (!(j==10)) {
										j=30;
									} else {
										j=20;
									}
						break IF_SWITCH_4;
								default:
									ISOException.throwIt(ISO7816.SW_CONDITIONS_NOT_SATISFIED);
							}
						}
						/***** END REPLACE [IF_SWITCH_4] *****/ 
							}
				} else {
						/***** BEGIN ORIGINAL [IF_SWITCH_5] *****
						 if (i==30) {			
									if (j==20) j=40;
									else j=50;
								} else {
									j=80;
								} 
						***** END ORIGINAL [IF_SWITCH_5] *****/ 
						/***** BEGIN REPLACE [IF_SWITCH_5] *****/ 
						IF_SWITCH_5: {
							switch (__getRandomBit()){
								case -1: 
									ISOException.throwIt(ISO7816.SW_CONDITIONS_NOT_SATISFIED);
								case 0:
									if ((i==30)) {
										{			
											/***** BEGIN ORIGINAL [IF_SWITCH_6] *****
														if (j==20) j=40;
														else j=50; 
											***** END ORIGINAL [IF_SWITCH_6] *****/ 
											/***** BEGIN REPLACE [IF_SWITCH_6] *****/ 
											IF_SWITCH_6: {
												switch (__getRandomBit()){
													case -1: 
														ISOException.throwIt(ISO7816.SW_CONDITIONS_NOT_SATISFIED);
													case 0:
														if ((j==20)) {
															j=40;
														} else {
															j=50;
														}
											break IF_SWITCH_6;
													case 1:
														if (!(j==20)) {
															j=50;
														} else {
															j=40;
														}
											break IF_SWITCH_6;
													default:
														ISOException.throwIt(ISO7816.SW_CONDITIONS_NOT_SATISFIED);
												}
											}
											/***** END REPLACE [IF_SWITCH_6] *****/ 
												}
									} else {
										{
													j=80;
												}
									}
						break IF_SWITCH_5;
								case 1:
									if (!(i==30)) {
										{
													j=80;
												}
									} else {
										{			
											/***** BEGIN ORIGINAL [IF_SWITCH_6] *****
														if (j==20) j=40;
														else j=50; 
											***** END ORIGINAL [IF_SWITCH_6] *****/ 
											/***** BEGIN REPLACE [IF_SWITCH_6] *****/ 
											IF_SWITCH_6: {
												switch (__getRandomBit()){
													case -1: 
														ISOException.throwIt(ISO7816.SW_CONDITIONS_NOT_SATISFIED);
													case 0:
														if ((j==20)) {
															j=40;
														} else {
															j=50;
														}
											break IF_SWITCH_6;
													case 1:
														if (!(j==20)) {
															j=50;
														} else {
															j=40;
														}
											break IF_SWITCH_6;
													default:
														ISOException.throwIt(ISO7816.SW_CONDITIONS_NOT_SATISFIED);
												}
											}
											/***** END REPLACE [IF_SWITCH_6] *****/ 
												}
									}
						break IF_SWITCH_5;
								default:
									ISOException.throwIt(ISO7816.SW_CONDITIONS_NOT_SATISFIED);
							}
						}
						/***** END REPLACE [IF_SWITCH_5] *****/ 
				}
	break IF_SWITCH_3;
			case 1:
				if (!(i==20)) {
						/***** BEGIN ORIGINAL [IF_SWITCH_5] *****
						 if (i==30) {			
									if (j==20) j=40;
									else j=50;
								} else {
									j=80;
								} 
						***** END ORIGINAL [IF_SWITCH_5] *****/ 
						/***** BEGIN REPLACE [IF_SWITCH_5] *****/ 
						IF_SWITCH_5: {
							switch (__getRandomBit()){
								case -1: 
									ISOException.throwIt(ISO7816.SW_CONDITIONS_NOT_SATISFIED);
								case 0:
									if ((i==30)) {
										{			
											/***** BEGIN ORIGINAL [IF_SWITCH_6] *****
														if (j==20) j=40;
														else j=50; 
											***** END ORIGINAL [IF_SWITCH_6] *****/ 
											/***** BEGIN REPLACE [IF_SWITCH_6] *****/ 
											IF_SWITCH_6: {
												switch (__getRandomBit()){
													case -1: 
														ISOException.throwIt(ISO7816.SW_CONDITIONS_NOT_SATISFIED);
													case 0:
														if ((j==20)) {
															j=40;
														} else {
															j=50;
														}
											break IF_SWITCH_6;
													case 1:
														if (!(j==20)) {
															j=50;
														} else {
															j=40;
														}
											break IF_SWITCH_6;
													default:
														ISOException.throwIt(ISO7816.SW_CONDITIONS_NOT_SATISFIED);
												}
											}
											/***** END REPLACE [IF_SWITCH_6] *****/ 
												}
									} else {
										{
													j=80;
												}
									}
						break IF_SWITCH_5;
								case 1:
									if (!(i==30)) {
										{
													j=80;
												}
									} else {
										{			
											/***** BEGIN ORIGINAL [IF_SWITCH_6] *****
														if (j==20) j=40;
														else j=50; 
											***** END ORIGINAL [IF_SWITCH_6] *****/ 
											/***** BEGIN REPLACE [IF_SWITCH_6] *****/ 
											IF_SWITCH_6: {
												switch (__getRandomBit()){
													case -1: 
														ISOException.throwIt(ISO7816.SW_CONDITIONS_NOT_SATISFIED);
													case 0:
														if ((j==20)) {
															j=40;
														} else {
															j=50;
														}
											break IF_SWITCH_6;
													case 1:
														if (!(j==20)) {
															j=50;
														} else {
															j=40;
														}
											break IF_SWITCH_6;
													default:
														ISOException.throwIt(ISO7816.SW_CONDITIONS_NOT_SATISFIED);
												}
											}
											/***** END REPLACE [IF_SWITCH_6] *****/ 
												}
									}
						break IF_SWITCH_5;
								default:
									ISOException.throwIt(ISO7816.SW_CONDITIONS_NOT_SATISFIED);
							}
						}
						/***** END REPLACE [IF_SWITCH_5] *****/ 
				} else {
					{
						/***** BEGIN ORIGINAL [IF_SWITCH_4] *****
									if (j==10) j=20;
									else j=30; 
						***** END ORIGINAL [IF_SWITCH_4] *****/ 
						/***** BEGIN REPLACE [IF_SWITCH_4] *****/ 
						IF_SWITCH_4: {
							switch (__getRandomBit()){
								case -1: 
									ISOException.throwIt(ISO7816.SW_CONDITIONS_NOT_SATISFIED);
								case 0:
									if ((j==10)) {
										j=20;
									} else {
										j=30;
									}
						break IF_SWITCH_4;
								case 1:
									if (!(j==10)) {
										j=30;
									} else {
										j=20;
									}
						break IF_SWITCH_4;
								default:
									ISOException.throwIt(ISO7816.SW_CONDITIONS_NOT_SATISFIED);
							}
						}
						/***** END REPLACE [IF_SWITCH_4] *****/ 
							}
				}
	break IF_SWITCH_3;
			default:
				ISOException.throwIt(ISO7816.SW_CONDITIONS_NOT_SATISFIED);
		}
	}
	/***** END REPLACE [IF_SWITCH_3] *****/ 
	}
	/** Random number generator for IF_SWITCH transformation */
	private static RandomData __random = null;
	/** Helper array for random number generator */
	private static byte __randomData[] = null;
	/**
	 *	Returns random bit 0 or 1
	 */
	private static short __getRandomBit(){
		try {
			if (__random == null) __random = RandomData.getInstance(RandomData.ALG_SECURE_RANDOM);
			if (__randomData == null) __randomData = JCSystem.makeTransientByteArray((short)1, JCSystem.CLEAR_ON_DESELECT);
			__random.generateData(__randomData, (short)0, (short)1);
			return (byte)((__randomData[0] & 0xFF)%2);
		} catch (CryptoException ex) {
			// JC simulator sometimes doesn't allow to get instance of RandomData.. 
			// this fallback will return always 0 in case that random number couldn't be fetched 
			// and program will continue normally
			return (byte)0;
		}
	}}
