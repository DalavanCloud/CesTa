package transformed.org.cesta.trans.java;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Simple test class for ValidateStateTransitions
 *
 * @author Tobias Smolka
 */
public class ValidateStateTransitionsTest  {

	/***** BEGIN declareFunctionConstants *****/
	public static final short FUNC_blockCard = 465;
	public static final short FUNC_install = 627;
	public static final short FUNC_select = 930;
	public static final short FUNC_unknown = 1254;

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

    	/***** BEGIN ORIGINAL [removeVariableDeclaratorList_3] *****
	public final static short STATE_SELECTED = 3; 
	***** END ORIGINAL [removeVariableDeclaratorList_3] *****/ 

    	/***** BEGIN ORIGINAL [removeVariableDeclaratorList_4] *****
	public final static short STATE_BLOCKED = 4; 
	***** END ORIGINAL [removeVariableDeclaratorList_4] *****/ 


    private short currentState;
    @Before
    public void init(){
        currentState = STATE_UPLOADED;  // default state
    }
    @Test
    public void install(){

	_VerifyAllowedFunction(FUNC_install, getState());
        setState(STATE_INSTALLED);
        assertEquals("STATE_INSTALLED is expected", STATE_INSTALLED, getState());
    }
    @Test
    public void testSelect(){
        currentState = STATE_INSTALLED;
        select();
        assertEquals("STATE_SELECTED is expected", STATE_SELECTED, getState());
    }
    public void select(){

	_VerifyAllowedFunction(FUNC_select, getState());
        currentState = STATE_INSTALLED;
        setState(STATE_SELECTED);
        try {
            setState(STATE_UPLOADED);
        } catch (RuntimeException ex){
            // this state should not be allowed
        }
        assertEquals("Transition STATE_SELECTED -> STATE_UPLOADED should not be allowed", STATE_SELECTED, getState());
    }
    @Test(expected=RuntimeException.class)
    public void unknown(){

	_VerifyAllowedFunction(FUNC_unknown, getState());
        throw new AssertionError("This function should not be allowed in default state!");
    }
    @Test
    public void testBlockCard(){
        currentState = STATE_INSTALLED;
        blockCard();
        assertEquals("STATE_BLOCKED is expected", STATE_BLOCKED, getState());
    }
    public void blockCard(){

	_VerifyAllowedFunction(FUNC_blockCard, getState());
        setState(STATE_BLOCKED);
    }    
    private short getState(){
        return currentState;
    }
    private void setState(short newState){

	_VerifyAllowedTransition(getState(), newState);
        currentState = newState;
    }


	/**
	 *	Checks whether given transition is allowed or not. 
	 *@param oldState old state
	 *@param newState new state
	 *@throws RuntimeException in case that transition is not allowed
	 */
	private static void _VerifyAllowedTransition(short oldState, short newState){
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
	}

	/**
	 *	Checks whether given function is allowed in given state or not. 
	 *@param function function to check 
	 *@param state state to check
	 *@throws RuntimeException in case that function is not allowed in given state
	 */
	 private static void _VerifyAllowedFunction(short function, short state){
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
			case FUNC_unknown: {
				throw new RuntimeException("Function is not allowed in current state");}

			default:
				throw new RuntimeException("Function is not allowed in current state");
		}
	}}
