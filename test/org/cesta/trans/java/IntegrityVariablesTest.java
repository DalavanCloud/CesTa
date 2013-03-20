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
        assertEquals(3, d);
        d--;
        --d;
        assertEquals(1, d);
        
        byte c;
        c = 5;
        c *= c % 3 + 1;
        assertEquals(15, c);
        
        globalByte = 1;
        globalByte -= 1 + 1;
        assertEquals(-1, globalByte);
        globalByte = 1;
        
        short j = 1;
        assertEquals(1, j);
        j += 4;
        j /= 5;
        assertEquals(1, j);
        
        for (short i = 0; i < 10; i++) {
            j+=i;
        }
        assertEquals(46, j);
    }
    
    @Test
    public void scopes() {
        assertEquals(1, globalByte);
        byte globalByte = 2;
        assertEquals(2, globalByte);
        assertEquals(1, IntegrityVariablesTest.globalByte);
        globalByte = 3;
        assertEquals(1, getGlobalByte());
        assertEquals(3, globalByte);
        
        {
            byte x = 1;
            assertEquals(1, x);
        }
        {
            byte x = 2;
            assertEquals(2, x);
        }
        {
            byte x = 3;
            assertEquals(3, x);
        }
        this.globalBoolean = true;
        assertEquals(true, globalBoolean);
    }
    
    private byte getGlobalByte() {
        return globalByte;
    }
}
