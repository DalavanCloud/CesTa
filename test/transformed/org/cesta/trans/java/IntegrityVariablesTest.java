package transformed.org.cesta.trans.java;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Test for IntegrityVariables transformation. This test class will
 * be automatically transformed during compilation.
 *
 * @author David Formanek
 */
public class IntegrityVariablesTest {

    private short _getShort(DualShort var) {
        if ((var.masked ^ 0x55) == var.original) {
            return var.original;
        } else {
            throw new RuntimeException("Error induction");
        }
    }

    private DualShort _setShort(short var) {
        DualShort dual = new DualShort();
        dual.original = var;
        dual.masked = (short) (0x55 ^ var);
        return dual;
    }

    public class DualShort {
        public short original;
        public short masked;
    }

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
        assertEquals(3, _getByte(d));
        d = _setByte((byte) (_getByte(d) - (1)));
        d = _setByte((byte) (_getByte(d) - (1)));
        assertEquals(1, _getByte(d));
        
        /*byte*/short c;
        c = _setByte((byte) (5));
        c = _setByte((byte) (_getByte(c) * (_getByte(c) % 3 + 1)));
        assertEquals(15, _getByte(c));
        
        globalByte = _setByte((byte) (1));
        globalByte = _setByte((byte) (_getByte(globalByte) - (1 + 1)));
        assertEquals(-1, _getByte(globalByte));
        globalByte = _setByte((byte) (1));
        
        /*short*/DualShort j = _setShort((short) (1));
        assertEquals(1, _getShort(j));
        j = _setShort((short) (_getShort(j) + (4)));
        j = _setShort((short) (_getShort(j) / (5)));
        assertEquals(1, _getShort(j));
        
        for (/*short*/DualShort i = _setShort((short) (0)); _getShort(i) < 10; i = _setShort((short) (_getShort(i) + (1)))) {
            j = _setShort((short) (_getShort(j) + (_getShort(i))));
        }
        assertEquals(46, _getShort(j));
    }
    
    @Test
    public void scopes() {
        assertEquals(1, _getByte(globalByte));
        /*byte*/short globalByte = _setByte((byte) (2));
        assertEquals(2, _getByte(globalByte));
        assertEquals(1, _getByte(IntegrityVariablesTest.globalByte));
        globalByte = _setByte((byte) (3));
        assertEquals(1, getGlobalByte());
        assertEquals(3, _getByte(globalByte));
        
        {
            /*byte*/short x = _setByte((byte) (1));
            assertEquals(1, _getByte(x));
        }
        {
            /*byte*/short x = _setByte((byte) (2));
            assertEquals(2, _getByte(x));
        }
        {
            /*byte*/short x = _setByte((byte) (3));
            assertEquals(3, _getByte(x));
        }
        this.globalBoolean = _setBoolean(true);
        assertEquals(true, _getBoolean(globalBoolean));
    }
    
    private byte getGlobalByte() {
        return _getByte(globalByte);
    }
}
