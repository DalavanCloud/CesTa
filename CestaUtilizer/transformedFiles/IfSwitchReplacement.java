package transformed.org.cesta.sample_project;

/**
 * Test class with if constructions.
 * 
 * @author Tobias Smolka
 */

import java.util.Random;
public class IfSwitchReplacement { 
	private short fault_resistant_short[] = new short[4];	/* help array to store negations of local short variables*/
	public IfSwitchReplacement() {
		short i=__set_short((short)(1),(short)0),j=__set_short((short)(0),(short)1);
	/***** BEGIN ORIGINAL [IF_SWITCH_1] *****
			if (__get_short(i,(short)0)==1) j=__set_short((short)(10),(short)1);
			else j=__set_short((short)(20),(short)1); 
	***** END ORIGINAL [IF_SWITCH_1] *****/ 
	/***** BEGIN REPLACE [IF_SWITCH_1] *****/ 
	IF_SWITCH_1: {
		switch (__getRandomBit()){
			case -1: 
				throw new RuntimeException("__getRandomBit() returned invalid value");
			case 0:
				if ((__get_short(i,(short)0)==1)) {
					j=__set_short((short)(10),(short)1);
				} else {
					j=__set_short((short)(20),(short)1);
				}
	break IF_SWITCH_1;
			case 1:
				if (!(__get_short(i,(short)0)==1)) {
					j=__set_short((short)(20),(short)1);
				} else {
					j=__set_short((short)(10),(short)1);
				}
	break IF_SWITCH_1;
			default:
				throw new RuntimeException("__getRandomBit() returned invalid value");
		}
	}
	/***** END REPLACE [IF_SWITCH_1] *****/ 
	}
	public void test(){
		short i = __set_short((short)(10),(short)2), j=__set_short((short)(20),(short)3);
	/***** BEGIN ORIGINAL [IDENTIFY_BLOCKS_1] *****
			for (i=__set_short((short)(1),(short)2);__get_short(i,(short)2)<10;i=__set_short((short)(__get_short(i,(short)2)+1),(short)2)){
				if (__get_short(i,(short)2)==2) break;
				else continue;
			} 
	***** END ORIGINAL [IDENTIFY_BLOCKS_1] *****/ 
	/***** BEGIN REPLACE [IDENTIFY_BLOCKS_1] *****/ 
	BLOCK_1: { for (i=__set_short((short)(1),(short)2);__get_short(i,(short)2)<10;i=__set_short((short)(__get_short(i,(short)2)+1),(short)2)){
	/***** BEGIN ORIGINAL [IF_SWITCH_2] *****
					if (__get_short(i,(short)2)==2) break BLOCK_1;
					else continue BLOCK_1; 
	***** END ORIGINAL [IF_SWITCH_2] *****/ 
	/***** BEGIN REPLACE [IF_SWITCH_2] *****/ 
	IF_SWITCH_2: {
		switch (__getRandomBit()){
			case -1: 
				throw new RuntimeException("__getRandomBit() returned invalid value");
			case 0:
				if ((__get_short(i,(short)2)==2)) {
					break BLOCK_1;
				} else {
					continue BLOCK_1;
				}
	break IF_SWITCH_2;
			case 1:
				if (!(__get_short(i,(short)2)==2)) {
					continue BLOCK_1;
				} else {
					break BLOCK_1;
				}
	break IF_SWITCH_2;
			default:
				throw new RuntimeException("__getRandomBit() returned invalid value");
		}
	}
	/***** END REPLACE [IF_SWITCH_2] *****/ 
			} }
	/***** END REPLACE [IDENTIFY_BLOCKS_1] *****/ 
		
	/***** BEGIN ORIGINAL [IF_SWITCH_3] *****
			if (__get_short(i,(short)2)==20){
				if (__get_short(j,(short)3)==10) j=__set_short((short)(20),(short)3);
				else j=__set_short((short)(30),(short)3);
			} else if (__get_short(i,(short)2)==30) {			
				if (__get_short(j,(short)3)==20) j=__set_short((short)(40),(short)3);
				else j=__set_short((short)(50),(short)3);
			} else {
				j=__set_short((short)(80),(short)3);
			} 
	***** END ORIGINAL [IF_SWITCH_3] *****/ 
	/***** BEGIN REPLACE [IF_SWITCH_3] *****/ 
	IF_SWITCH_3: {
		switch (__getRandomBit()){
			case -1: 
				throw new RuntimeException("__getRandomBit() returned invalid value");
			case 0:
				if ((__get_short(i,(short)2)==20)) {
					{
						/***** BEGIN ORIGINAL [IF_SWITCH_4] *****
									if (__get_short(j,(short)3)==10) j=__set_short((short)(20),(short)3);
									else j=__set_short((short)(30),(short)3); 
						***** END ORIGINAL [IF_SWITCH_4] *****/ 
						/***** BEGIN REPLACE [IF_SWITCH_4] *****/ 
						IF_SWITCH_4: {
							switch (__getRandomBit()){
								case -1: 
									throw new RuntimeException("__getRandomBit() returned invalid value");
								case 0:
									if ((__get_short(j,(short)3)==10)) {
										j=__set_short((short)(20),(short)3);
									} else {
										j=__set_short((short)(30),(short)3);
									}
						break IF_SWITCH_4;
								case 1:
									if (!(__get_short(j,(short)3)==10)) {
										j=__set_short((short)(30),(short)3);
									} else {
										j=__set_short((short)(20),(short)3);
									}
						break IF_SWITCH_4;
								default:
									throw new RuntimeException("__getRandomBit() returned invalid value");
							}
						}
						/***** END REPLACE [IF_SWITCH_4] *****/ 
							}
				} else {
						/***** BEGIN ORIGINAL [IF_SWITCH_5] *****
						 if (__get_short(i,(short)2)==30) {			
									if (__get_short(j,(short)3)==20) j=__set_short((short)(40),(short)3);
									else j=__set_short((short)(50),(short)3);
								} else {
									j=__set_short((short)(80),(short)3);
								} 
						***** END ORIGINAL [IF_SWITCH_5] *****/ 
						/***** BEGIN REPLACE [IF_SWITCH_5] *****/ 
						IF_SWITCH_5: {
							switch (__getRandomBit()){
								case -1: 
									throw new RuntimeException("__getRandomBit() returned invalid value");
								case 0:
									if ((__get_short(i,(short)2)==30)) {
										{			
											/***** BEGIN ORIGINAL [IF_SWITCH_6] *****
														if (__get_short(j,(short)3)==20) j=__set_short((short)(40),(short)3);
														else j=__set_short((short)(50),(short)3); 
											***** END ORIGINAL [IF_SWITCH_6] *****/ 
											/***** BEGIN REPLACE [IF_SWITCH_6] *****/ 
											IF_SWITCH_6: {
												switch (__getRandomBit()){
													case -1: 
														throw new RuntimeException("__getRandomBit() returned invalid value");
													case 0:
														if ((__get_short(j,(short)3)==20)) {
															j=__set_short((short)(40),(short)3);
														} else {
															j=__set_short((short)(50),(short)3);
														}
											break IF_SWITCH_6;
													case 1:
														if (!(__get_short(j,(short)3)==20)) {
															j=__set_short((short)(50),(short)3);
														} else {
															j=__set_short((short)(40),(short)3);
														}
											break IF_SWITCH_6;
													default:
														throw new RuntimeException("__getRandomBit() returned invalid value");
												}
											}
											/***** END REPLACE [IF_SWITCH_6] *****/ 
												}
									} else {
										{
													j=__set_short((short)(80),(short)3);
												}
									}
						break IF_SWITCH_5;
								case 1:
									if (!(__get_short(i,(short)2)==30)) {
										{
													j=__set_short((short)(80),(short)3);
												}
									} else {
										{			
											/***** BEGIN ORIGINAL [IF_SWITCH_6] *****
														if (__get_short(j,(short)3)==20) j=__set_short((short)(40),(short)3);
														else j=__set_short((short)(50),(short)3); 
											***** END ORIGINAL [IF_SWITCH_6] *****/ 
											/***** BEGIN REPLACE [IF_SWITCH_6] *****/ 
											IF_SWITCH_6: {
												switch (__getRandomBit()){
													case -1: 
														throw new RuntimeException("__getRandomBit() returned invalid value");
													case 0:
														if ((__get_short(j,(short)3)==20)) {
															j=__set_short((short)(40),(short)3);
														} else {
															j=__set_short((short)(50),(short)3);
														}
											break IF_SWITCH_6;
													case 1:
														if (!(__get_short(j,(short)3)==20)) {
															j=__set_short((short)(50),(short)3);
														} else {
															j=__set_short((short)(40),(short)3);
														}
											break IF_SWITCH_6;
													default:
														throw new RuntimeException("__getRandomBit() returned invalid value");
												}
											}
											/***** END REPLACE [IF_SWITCH_6] *****/ 
												}
									}
						break IF_SWITCH_5;
								default:
									throw new RuntimeException("__getRandomBit() returned invalid value");
							}
						}
						/***** END REPLACE [IF_SWITCH_5] *****/ 
				}
	break IF_SWITCH_3;
			case 1:
				if (!(__get_short(i,(short)2)==20)) {
						/***** BEGIN ORIGINAL [IF_SWITCH_5] *****
						 if (__get_short(i,(short)2)==30) {			
									if (__get_short(j,(short)3)==20) j=__set_short((short)(40),(short)3);
									else j=__set_short((short)(50),(short)3);
								} else {
									j=__set_short((short)(80),(short)3);
								} 
						***** END ORIGINAL [IF_SWITCH_5] *****/ 
						/***** BEGIN REPLACE [IF_SWITCH_5] *****/ 
						IF_SWITCH_5: {
							switch (__getRandomBit()){
								case -1: 
									throw new RuntimeException("__getRandomBit() returned invalid value");
								case 0:
									if ((__get_short(i,(short)2)==30)) {
										{			
											/***** BEGIN ORIGINAL [IF_SWITCH_6] *****
														if (__get_short(j,(short)3)==20) j=__set_short((short)(40),(short)3);
														else j=__set_short((short)(50),(short)3); 
											***** END ORIGINAL [IF_SWITCH_6] *****/ 
											/***** BEGIN REPLACE [IF_SWITCH_6] *****/ 
											IF_SWITCH_6: {
												switch (__getRandomBit()){
													case -1: 
														throw new RuntimeException("__getRandomBit() returned invalid value");
													case 0:
														if ((__get_short(j,(short)3)==20)) {
															j=__set_short((short)(40),(short)3);
														} else {
															j=__set_short((short)(50),(short)3);
														}
											break IF_SWITCH_6;
													case 1:
														if (!(__get_short(j,(short)3)==20)) {
															j=__set_short((short)(50),(short)3);
														} else {
															j=__set_short((short)(40),(short)3);
														}
											break IF_SWITCH_6;
													default:
														throw new RuntimeException("__getRandomBit() returned invalid value");
												}
											}
											/***** END REPLACE [IF_SWITCH_6] *****/ 
												}
									} else {
										{
													j=__set_short((short)(80),(short)3);
												}
									}
						break IF_SWITCH_5;
								case 1:
									if (!(__get_short(i,(short)2)==30)) {
										{
													j=__set_short((short)(80),(short)3);
												}
									} else {
										{			
											/***** BEGIN ORIGINAL [IF_SWITCH_6] *****
														if (__get_short(j,(short)3)==20) j=__set_short((short)(40),(short)3);
														else j=__set_short((short)(50),(short)3); 
											***** END ORIGINAL [IF_SWITCH_6] *****/ 
											/***** BEGIN REPLACE [IF_SWITCH_6] *****/ 
											IF_SWITCH_6: {
												switch (__getRandomBit()){
													case -1: 
														throw new RuntimeException("__getRandomBit() returned invalid value");
													case 0:
														if ((__get_short(j,(short)3)==20)) {
															j=__set_short((short)(40),(short)3);
														} else {
															j=__set_short((short)(50),(short)3);
														}
											break IF_SWITCH_6;
													case 1:
														if (!(__get_short(j,(short)3)==20)) {
															j=__set_short((short)(50),(short)3);
														} else {
															j=__set_short((short)(40),(short)3);
														}
											break IF_SWITCH_6;
													default:
														throw new RuntimeException("__getRandomBit() returned invalid value");
												}
											}
											/***** END REPLACE [IF_SWITCH_6] *****/ 
												}
									}
						break IF_SWITCH_5;
								default:
									throw new RuntimeException("__getRandomBit() returned invalid value");
							}
						}
						/***** END REPLACE [IF_SWITCH_5] *****/ 
				} else {
					{
						/***** BEGIN ORIGINAL [IF_SWITCH_4] *****
									if (__get_short(j,(short)3)==10) j=__set_short((short)(20),(short)3);
									else j=__set_short((short)(30),(short)3); 
						***** END ORIGINAL [IF_SWITCH_4] *****/ 
						/***** BEGIN REPLACE [IF_SWITCH_4] *****/ 
						IF_SWITCH_4: {
							switch (__getRandomBit()){
								case -1: 
									throw new RuntimeException("__getRandomBit() returned invalid value");
								case 0:
									if ((__get_short(j,(short)3)==10)) {
										j=__set_short((short)(20),(short)3);
									} else {
										j=__set_short((short)(30),(short)3);
									}
						break IF_SWITCH_4;
								case 1:
									if (!(__get_short(j,(short)3)==10)) {
										j=__set_short((short)(30),(short)3);
									} else {
										j=__set_short((short)(20),(short)3);
									}
						break IF_SWITCH_4;
								default:
									throw new RuntimeException("__getRandomBit() returned invalid value");
							}
						}
						/***** END REPLACE [IF_SWITCH_4] *****/ 
							}
				}
	break IF_SWITCH_3;
			default:
				throw new RuntimeException("__getRandomBit() returned invalid value");
		}
	}
	/***** END REPLACE [IF_SWITCH_3] *****/ 
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
	}	/** Random number generator for IF_SWITCH transformation */
	private static Random __random = null;	
	/**
	 *	Returns random bit 0 or 1
	 */
	private static byte __getRandomBit(){
		if (__random == null) __random = new Random();
		return (byte)(__random.nextInt(2));
	}}
