package transformed.org.cesta.trans.java;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Test for combination of transformations.
 *
 * @author Tobias Smolka
 */
import java.util.Random;
public class MultipleTest {

    private static byte _getByte(short var) {
	/***** BEGIN ORIGINAL [IF_SWITCH_1] *****
	        if (((byte) (var >>> 8) ^ 0x55) == (byte) var) {
	            return (byte) var;
	        } else {
	            throw new RuntimeException("Error induction");
	        } 
	***** END ORIGINAL [IF_SWITCH_1] *****/ 
	/***** BEGIN REPLACE [IF_SWITCH_1] *****/ 
	IF_SWITCH_1: {
		switch (__getRandomBit()){
			case -1: 
				throw new RuntimeException("__getRandomBit() returned invalid value");
			case 0:
				if ((((byte) (var >>> 8) ^ 0x55) == (byte) var)) {
					{
					            return (byte) var;
					        }
				} else {
					{
					            throw new RuntimeException("Error induction");
					        }
				}
			case 1:
				if (!(((byte) (var >>> 8) ^ 0x55) == (byte) var)) {
					{
					            throw new RuntimeException("Error induction");
					        }
				} else {
					{
					            return (byte) var;
					        }
				}
			default:
				throw new RuntimeException("__getRandomBit() returned invalid value");
		}
	}
	/***** END REPLACE [IF_SWITCH_1] *****/ 
    }

    private static short _setByte(byte var) {
        return (short) ((short) ((0x55 ^ var) << 8) ^ (var & 0xFF));
    }

    private static boolean _getBoolean(byte var) {
        switch (var) {
            case (byte) 0x55: return true;
            case (byte) 0xAA: return false;
            default: throw new RuntimeException("Error induction");
        }
    }

    private static byte _setBoolean(boolean var) {
        return var ? (byte) 0x55 : (byte) 0xAA;
    }

  
	private short fault_resistant_short[] = new short[2];	/* help array to store negations of local short variables*/ 
	private short fault_resistant_short_g[] = new short[1];	/* help array to store negations of global short variables*/

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
	public final static short STATE_UPLOADED = 1; 
	***** END ORIGINAL [removeVariableDeclaratorList_1] *****/ 

    	/***** BEGIN ORIGINAL [removeVariableDeclaratorList_2] *****
	public final static short STATE_INSTALLED = 2; 
	***** END ORIGINAL [removeVariableDeclaratorList_2] *****/ 

    private short currentState = __set_short_g((short)(STATE_UPLOADED),(short)0);

    @Test
    public void install() {

	_VerifyAllowedFunction(FUNC_install, getState());
        short i = __set_short((short)(2),(short)0);
        assertEquals(2, __get_short(i,(short)0));
        for (short j = __set_short((short)(0),(short)1); __get_short(j,(short)1) < 20; j=__set_short((short)(__get_short(j,(short)1)+1),(short)1)){
	/***** BEGIN ORIGINAL [IF_SWITCH_2] *****
	            if (__get_short(i,(short)0) % 2 == 0) {
	                i=__set_short((short)(__get_short(i,(short)0)+(__get_short(j,(short)1))),(short)0);
	            }
	            else {
	                i=__set_short((short)((short) (__get_short(j,(short)1) * 2)),(short)0);
	            } 
	***** END ORIGINAL [IF_SWITCH_2] *****/ 
	/***** BEGIN REPLACE [IF_SWITCH_2] *****/ 
	IF_SWITCH_2: {
		switch (__getRandomBit()){
			case -1: 
				throw new RuntimeException("__getRandomBit() returned invalid value");
			case 0:
				if ((__get_short(i,(short)0) % 2 == 0)) {
					{
					                i=__set_short((short)(__get_short(i,(short)0)+(__get_short(j,(short)1))),(short)0);
					            }
				} else {
					{
					                i=__set_short((short)((short) (__get_short(j,(short)1) * 2)),(short)0);
					            }
				}
	break IF_SWITCH_2;
			case 1:
				if (!(__get_short(i,(short)0) % 2 == 0)) {
					{
					                i=__set_short((short)((short) (__get_short(j,(short)1) * 2)),(short)0);
					            }
				} else {
					{
					                i=__set_short((short)(__get_short(i,(short)0)+(__get_short(j,(short)1))),(short)0);
					            }
				}
	break IF_SWITCH_2;
			default:
				throw new RuntimeException("__getRandomBit() returned invalid value");
		}
	}
	/***** END REPLACE [IF_SWITCH_2] *****/ 
        }
        assertEquals(55, __get_short(i,(short)0));
        setState(STATE_INSTALLED);
        assertEquals("STATE_INSTALLED is expected", STATE_INSTALLED, getState());
    }
    private short getState(){
        return __get_short_g(currentState,(short)0);
    }
    private void setState(short newState){

	_VerifyAllowedTransition(getState(), newState);
        currentState=__set_short_g((short)(newState),(short)0);
    }


	/**
	 *	Checks whether given transition is allowed or not. 
	 *@param oldState old state
	 *@param newState new state
	 *@throws RuntimeException in case that transition is not allowed
	 */
	private static void _VerifyAllowedTransition(short oldState, short newState){
	/***** BEGIN ORIGINAL [IDENTIFY_BLOCKS_3] *****
			switch (oldState){
				case STATE_INSTALLED: {
					if (newState == STATE_SELECTED) {break;}
					if (newState == STATE_BLOCKED) {break;}

					throw new RuntimeException("State transition is not allowed");
				}
				case STATE_SELECTED: {
					if (newState == STATE_BLOCKED) {break;}

					throw new RuntimeException("State transition is not allowed");
				}
				case STATE_UPLOADED: {
					if (newState == STATE_INSTALLED) {break;}

					throw new RuntimeException("State transition is not allowed");
				}

				default:
					throw new RuntimeException("State transition is not allowed");
			} 
	***** END ORIGINAL [IDENTIFY_BLOCKS_3] *****/ 
	/***** BEGIN REPLACE [IDENTIFY_BLOCKS_3] *****/ 
	BLOCK_3: { switch (oldState){
				case STATE_INSTALLED: {
					if (newState == STATE_SELECTED) {break BLOCK_3;}
					if (newState == STATE_BLOCKED) {break BLOCK_3;}

					throw new RuntimeException("State transition is not allowed");
				}
				case STATE_SELECTED: {
					if (newState == STATE_BLOCKED) {break BLOCK_3;}

					throw new RuntimeException("State transition is not allowed");
				}
				case STATE_UPLOADED: {
					if (newState == STATE_INSTALLED) {break BLOCK_3;}

					throw new RuntimeException("State transition is not allowed");
				}

				default:
					throw new RuntimeException("State transition is not allowed");
			} }
	/***** END REPLACE [IDENTIFY_BLOCKS_3] *****/ 
	}

	/**
	 *	Checks whether given function is allowed in given state or not. 
	 *@param function function to check 
	 *@param state state to check
	 *@throws RuntimeException in case that function is not allowed in given state
	 */
	 private static void _VerifyAllowedFunction(short function, short state){
	/***** BEGIN ORIGINAL [IDENTIFY_BLOCKS_4] *****
			switch (function){
				case FUNC_blockCard: {
					if (state == STATE_INSTALLED) break;
					if (state == STATE_SELECTED) break;

					throw new RuntimeException("Function is not allowed in current state");}
				case FUNC_install: {
					if (state == STATE_UPLOADED) break;

					throw new RuntimeException("Function is not allowed in current state");}
				case FUNC_select: {
					if (state == STATE_INSTALLED) break;

					throw new RuntimeException("Function is not allowed in current state");}

				default:
					throw new RuntimeException("Function is not allowed in current state");
			} 
	***** END ORIGINAL [IDENTIFY_BLOCKS_4] *****/ 
	/***** BEGIN REPLACE [IDENTIFY_BLOCKS_4] *****/ 
	BLOCK_4: { switch (function){
				case FUNC_blockCard: {
					if (state == STATE_INSTALLED) break BLOCK_4;
					if (state == STATE_SELECTED) break BLOCK_4;

					throw new RuntimeException("Function is not allowed in current state");}
				case FUNC_install: {
					if (state == STATE_UPLOADED) break BLOCK_4;

					throw new RuntimeException("Function is not allowed in current state");}
				case FUNC_select: {
					if (state == STATE_INSTALLED) break BLOCK_4;

					throw new RuntimeException("Function is not allowed in current state");}

				default:
					throw new RuntimeException("Function is not allowed in current state");
			} }
	/***** END REPLACE [IDENTIFY_BLOCKS_4] *****/ 
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
	}	/** Random number generator for IF_SWITCH transformation */
	private static Random __random = null;	
	/**
	 *	Returns random bit 0 or 1
	 */
	private static byte __getRandomBit(){
		if (__random == null) __random = new Random();
		return (byte)(__random.nextInt(2));
	}}
