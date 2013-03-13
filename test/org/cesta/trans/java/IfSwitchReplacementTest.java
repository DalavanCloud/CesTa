package org.cesta.trans.java;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * Test for IfSwitch transformation. This test class will
 * be automatically transformed during compilation. 
 * 
 * @author Tobias Smolka
 */
public class IfSwitchReplacementTest {
    
    @Test
    public void simpleIf() {
        int j = 0;
        for (int i = 0; i < 10; i++){
            if (i == 5) break;
            j += i;
        }
        assertEquals(10, j);
    }
    
    @Test
    public void switchFor(){
        short k = 0;
        switch (k) {
            case 0: 
                    for (short i = 0; i < 6; i++) {
                        k += i;
                    }
                    if (k == 15) break;
                    k++;
            
        }
        assertEquals(15, k);
    }
    
    public short returnFunc(){
        int i = 1, j = 2;
        if (i == 1) {
            if (j == 0) {
                throw new RuntimeException("Dummy exception");
            }
            else return 2;
        }
        else return 3;
    }
    
    @Test
    public void returns(){
        assertEquals(2, returnFunc());
    }
}
