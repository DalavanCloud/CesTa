package org.cesta.trans.java;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Test for combination of transformations.
 *
 * @author Tobias Smolka
 */
public class MultipleTest {
    public final static short STATE_UPLOADED = 1;
    public final static short STATE_INSTALLED = 2;
    private short currentState = STATE_UPLOADED;

    @Test
    public void install() {
        short i = 2;
        assertEquals(2, i);
        for (short j = 0; j < 20; j++){
            if (i % 2 == 0) {
                i += j;
            }
            else {
                i = (short) (j * 2);
            }
        }
        assertEquals(55, i);
        setState(STATE_INSTALLED);
        assertEquals("STATE_INSTALLED is expected", STATE_INSTALLED, getState());
    }
    private short getState(){
        return currentState;
    }
    private void setState(short newState){
        currentState = newState;
    }
}
