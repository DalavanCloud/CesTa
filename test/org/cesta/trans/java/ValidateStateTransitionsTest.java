package org.cesta.trans.java;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Simple test class for ValidateStateTransitions
 *
 * @author Tobias Smolka
 */
public class ValidateStateTransitionsTest  {
    public final static short STATE_UPLOADED = 1;
    public final static short STATE_INSTALLED = 2;
    public final static short STATE_SELECTED = 3;
    public final static short STATE_BLOCKED = 4;

    private short currentState;
    @Before
    public void init(){
        currentState = STATE_UPLOADED;  // default state
    }
    @Test
    public void install(){
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
        throw new AssertionError("This function should not be allowed in default state!");
    }
    @Test
    public void testBlockCard(){
        currentState = STATE_INSTALLED;
        blockCard();
        assertEquals("STATE_BLOCKED is expected", STATE_BLOCKED, getState());
    }
    public void blockCard(){
        setState(STATE_BLOCKED);
    }    
    private short getState(){
        return currentState;
    }
    private void setState(short newState){
        currentState = newState;
    }
}
