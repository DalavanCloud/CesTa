package org.cesta.trans.java;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Test for IntegrityVariables transformation. This test class will
 * be automatically transformed during compilation.
 *
 * @author David Formanek
 */
public class IntegrityVariablesTest {
    private boolean globalBoolean = false;
    private static byte globalByte = 1;

    @Test
    public void simple(){
        boolean a;
        a = true;
        a = !a;
        assertFalse(a);
        
        byte b = 16, d = 1;
        b = 30 + 2;
        b += 8;
        assertEquals(40, b);
        d++;
        ++d;
        assertEquals(d, 3);
        d--;
        --d;
        assertEquals(d, 1);
        
        byte c;
        c = 5;
        c *= c % 3 + 1;
        assertEquals(c, 15);
        
        globalByte = 1;
        globalByte -= 1 + 1;
        assertEquals(globalByte, -1);
        globalByte = 1;
        
        /*short j = 1;
        assertEquals(1, j);
        
        for (short i = 0; i < 10; i++) {
            j+=i;
        }
        assertEquals(46, j);*/
    }
    
    @Test
    public void scopes() {
        assertEquals(globalByte, 1);
        byte globalByte = 2;
        assertEquals(globalByte, 2);
        assertEquals(IntegrityVariablesTest.globalByte, 1);
        globalByte = 3;
        assertEquals(getGlobalByte(), 1);
        assertEquals(globalByte, 3);
        
        {
            byte x = 1;
            assertEquals(x, 1);
        }
        {
            byte x = 2;
            assertEquals(x, 2);
        }
        {
            byte x = 3;
            assertEquals(x, 3);
        }
        this.globalBoolean = true;
        assertEquals(globalBoolean, true);
    }
    
    private byte getGlobalByte() {
        return globalByte;
    }
}
