package transformed.org.cesta.trans.java;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import org.junit.Test;

/**
 * Test for IntegrityVariables transformation. This test class will
 * be automatically transformed during compilation.
 *
 * @author David Formanek
 */
public class IntegrityVariablesTest {

    private static byte _getByte(short var) {
        if (((byte) (var >>> 8) ^ 0x55) == (byte) var) {
            return (byte) var;
        } else {
            throw new RuntimeException("Error induction");
        }
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

 
    private /*boolean*/byte globalBoolean = _setBoolean(false);
    private static /*byte*/short globalByte = _setByte((byte) (1));

    @Test
    public void simple(){
        /*boolean*/byte a;
        a = _setBoolean(true);
        a = _setBoolean(!_getBoolean(a));
        assertFalse(_getBoolean(a));
        
        /*byte*/short b = _setByte((byte) (16)), d = _setByte((byte) (1));
        b = _setByte((byte) (30 + 2));
        b = _setByte((byte) (_getByte(b) + (8)));
        assertEquals(40, _getByte(b));
        d = _setByte((byte) (_getByte(d) + (1)));
        d = _setByte((byte) (_getByte(d) + (1)));
        assertEquals(_getByte(d), 3);
        d = _setByte((byte) (_getByte(d) - (1)));
        d = _setByte((byte) (_getByte(d) - (1)));
        assertEquals(_getByte(d), 1);
        
        /*byte*/short c;
        c = _setByte((byte) (5));
        c = _setByte((byte) (_getByte(c) * (_getByte(c) % 3 + 1)));
        assertEquals(_getByte(c), 15);
        
        globalByte = _setByte((byte) (1));
        globalByte = _setByte((byte) (_getByte(globalByte) - (1 + 1)));
        assertEquals(_getByte(globalByte), -1);
        globalByte = _setByte((byte) (1));
        
        /*short j = 1;
        assertEquals(1, j);
        
        for (short i = 0; i < 10; i++) {
            j+=i;
        }
        assertEquals(46, j);*/
    }
    
    @Test
    public void scopes() {
        assertEquals(_getByte(globalByte), 1);
        /*byte*/short globalByte = _setByte((byte) (2));
        assertEquals(_getByte(globalByte), 2);
        //assertEquals(IntegrityVariablesTest.globalByte, 1); // not working yet
        globalByte = _setByte((byte) (3));
        assertEquals(getGlobalByte(), 1);
        assertEquals(_getByte(globalByte), 3);
        
        {
            /*byte*/short x = _setByte((byte) (1));
            assertEquals(_getByte(x), 1);
        }
        {
            /*byte*/short x = _setByte((byte) (2));
            assertEquals(_getByte(x), 2);
        }
        {
            /*byte*/short x = _setByte((byte) (3));
            assertEquals(_getByte(x), 3);
        }
    }
    
    private byte getGlobalByte() {
        return _getByte(globalByte);
    }
}
