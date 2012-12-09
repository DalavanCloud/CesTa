package transformed.org.cesta.trans.java;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import org.junit.Test;

/**
 * Test for IntegrityVariables transformation. This test class will
 * be automatically transformed during compilation.
 *
 * @author David Formanek, Tobias Smolka
 */
public class IntegrityVariablesTest {

    private byte _getByte(short var) {
        if (((var >> 8) ^ 0x55) == (var ^ 0xFFFF)) {
            return (byte) var;
        } else {
            throw new RuntimeException("Error induction");
        }
    }

    private short _setByte(byte var) {
        return (short) ((short) ((0x55 ^ var) << 8) ^ var);
    }

    private boolean _getBoolean(byte var) {
        switch (var) {
            case (byte) 0x55: return true;
            case (byte) 0xAA: return false;
            default: throw new RuntimeException("Error induction");
        }
    }

    private byte _setBoolean(boolean var) {
        return var ? (byte) 0x55 : (byte) 0xAA;
    }

 
    private short globalI = 4;
    private static byte globalStatic = 0;
    byte x,y;   // test variables without initializer

    @Test
    public void basic() {
        short j = 0, k=4;
        for (short i=0; i<100; i++) {
            j += 2;
            j++;
            j--;
            --j;
            ++j;
            if (i == 5 || i>20) {
                j += 5;
            }
            else if (i == k) {
                j += 3;
            }

            switch (i){
                case 1:
                    j+=30;
                case 2:
                    for (short l=0; l<10; l++) {
                        if (l == 4) break;
                        j += 7;
                    }
                    break;
                case 4:
                    k++;
                    break;
                default:
                    j += 4;
            }

            if (i++ == 40 || ++i == 41) break;
        }
        assertEquals(119, j);
    }
    
    @Test
    public void assignments(){
        short i=0, j=0;
        boolean a=true,b=true;
        if (++x == y) x=0;
        i = ++j;
        assertEquals(1, i);
        assertEquals(1, j);
        i = j++;
        assertEquals(1, i);
        assertEquals(2, j);
        i += ++j;
        i += j+=2;
        i += j++;
        i += j--;
        i += --j;
        i -= -j;
        i += +(j+=2);
        i -= j+=2;
        i -= j>>2;
        i += j<<(j*=2);
        i -= j++;
        i -= j--;
        i -= --j;
        assertEquals(-24, i);
        assertEquals(15, j);
        i=(short)(j-1);
        if (++i != j) {
            throw new AssertionError("IF statement should return true");
        }
        assertEquals(15, i);
        a = !b;
        assertFalse(a);
    }
    
    protected short exprTest(short number){
        globalI = (short)(number+10);
        number+=20;
        return (number++);
    }

    /**
     * Some aritmetic expressions and calculations. 
     */
    @Test
    public void expressions() {
        globalStatic = 3;
        globalStatic=(byte)(globalStatic+globalStatic*2);
        assertEquals(9,globalStatic);
        short testArray[]=new short[2];
        assertEquals(globalI, 4);
        short i=4,j; assertEquals(4, i);
        j=i++; assertEquals(5, i); assertEquals(4, j);
        i+=56*globalI+i; assertEquals(234, i);
        i-=3*globalI; assertEquals(222, i);
        i*=4; assertEquals(888, i);
        i/=2; assertEquals(444, i);
        assertEquals(444, i++);
        assertEquals(446, ++i);
        assertEquals(445, --i);
        assertEquals(445, i--);
        assertEquals(444, i);
        i++; assertEquals(445, i);
        i=0;
        testArray[i++]=i--;
        assertEquals(testArray[0], 1);
        i=exprTest(i++);
        assertEquals(10, globalI);
        assertEquals(20, i);
        i=exprTest(++i);
        assertEquals(31, globalI);
        assertEquals(41, i);
    }

    @Test
    public void simple(){
        boolean a;
        a = true;
        a = !a;
        assertFalse(a);
        
        byte b = 16;
        b = 30 + 2;
        b += 8;
        assertEquals(40, b);
        
        short j = 1;
        assertEquals(1, j);
        
        for (short i = 0; i < 10; i++) {
            j+=i;
        }
        assertEquals(46, j);
    }
}
