package transformed.org.cesta.trans.java;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import org.junit.Before;
import org.junit.Test;

/**
 * Test for FaultResistant transformation. This test class will
 * be automatically transformed during compilation.
 *
 * @author Tobias Smolka
 */
public class ShadowVariablesTest { 
	private short fault_resistant_short[] = new short[10];	/* help array to store negations of local short variables*/ 
	private boolean fault_resistant_boolean[] = new boolean[2];	/* help array to store negations of local boolean variables*/ 
	private short fault_resistant_short_g[] = new short[1];	/* help array to store negations of global short variables*/ 
	private static byte fault_resistant_byte_gs[] = new byte[1];	/* help array to store negations of global byte variables*/ 
	private byte fault_resistant_byte_g[] = new byte[2];	/* help array to store negations of global byte variables*/
    private short globalI = __set_short_g((short)(4),(short)0);
    private static byte globalStatic=__set_byte_gs((byte)(0),(short)0);
    byte x=__set_byte_g((byte)(0),(short)0),y=__set_byte_g((byte)(0),(short)1);   // test variables without initializer

    @Before
    public void setUp() {
        globalStatic=__set_byte_gs((byte)(1),(short)0);
        globalStatic=__set_byte_gs((byte)(__get_byte_gs(globalStatic,(short)0)+1),(short)0);
    }

    @Test
    public void basic() {
        assertEquals(2,__get_byte_gs(globalStatic,(short)0));
        short j=__set_short((short)(0),(short)0), k=__set_short((short)(4),(short)1);
        for (short i=__set_short((short)(0),(short)2);__get_short(i,(short)2)<100;i=__set_short((short)(__get_short(i,(short)2)+1),(short)2)){
            j=__set_short((short)(__get_short(j,(short)0)+(2)),(short)0);j=__set_short((short)(__get_short(j,(short)0)+1),(short)0);j=__set_short((short)(__get_short(j,(short)0)-1),(short)0);j=__set_short((short)(__get_short(j,(short)0)-1),(short)0);j=__set_short((short)(__get_short(j,(short)0)+1),(short)0);
            if (__get_short(i,(short)2)==5 || __get_short(i,(short)2)>20) j=__set_short((short)(__get_short(j,(short)0)+(5)),(short)0);
            else if (__get_short(i,(short)2)==__get_short(k,(short)1)) j=__set_short((short)(__get_short(j,(short)0)+(3)),(short)0);

            switch (__get_short(i,(short)2)){
                case 1:
                    j=__set_short((short)(__get_short(j,(short)0)+(30)),(short)0);
                case 2:
                    for (short l=__set_short((short)(0),(short)3);__get_short(l,(short)3)<10;l=__set_short((short)(__get_short(l,(short)3)+1),(short)3)){
                        if (__get_short(l,(short)3)==4) break;
                        j=__set_short((short)(__get_short(j,(short)0)+(7)),(short)0);
                    }
                    break;
                case 4:
                    k=__set_short((short)(__get_short(k,(short)1)+1),(short)1);
                    break;
                default:
                    j=__set_short((short)(__get_short(j,(short)0)+(4)),(short)0);
            }

            if ((short)((i=__set_short((short)(__get_short(i,(short)2)+1),(short)2))-1) == 40 || (short)(i=__set_short((short)(__get_short(i,(short)2)+1),(short)2)) == 41) break;
        }
        assertEquals(119, __get_short(j,(short)0));
    }
    @Test
    public void assignments(){
        short i=__set_short((short)(0),(short)4), j=__set_short((short)(0),(short)5);
        boolean a=__set_boolean((boolean)(true),(short)0),b=__set_boolean((boolean)(true),(short)1);
        if ((byte)(x=__set_byte_g((byte)(__get_byte_g(x,(short)0)+1),(short)0)) == __get_byte_g(y,(short)1)) x=__set_byte_g((byte)(0),(short)0);
        i=__set_short((short)((short)(j=__set_short((short)(__get_short(j,(short)5)+1),(short)5))),(short)4);
        assertEquals(1, __get_short(i,(short)4));
        assertEquals(1, __get_short(j,(short)5));
        i=__set_short((short)((short)((j=__set_short((short)(__get_short(j,(short)5)+1),(short)5))-1)),(short)4);
        assertEquals(1, __get_short(i,(short)4));
        assertEquals(2, __get_short(j,(short)5));
        i=__set_short((short)(__get_short(i,(short)4)+((short)(j=__set_short((short)(__get_short(j,(short)5)+1),(short)5)))),(short)4);
        i=__set_short((short)(__get_short(i,(short)4)+((short)(j=__set_short((short)(__get_short(j,(short)5)+(2)),(short)5)))),(short)4);
        i=__set_short((short)(__get_short(i,(short)4)+((short)((j=__set_short((short)(__get_short(j,(short)5)+1),(short)5))-1))),(short)4);
        i=__set_short((short)(__get_short(i,(short)4)+((short)((j=__set_short((short)(__get_short(j,(short)5)-1),(short)5))+1))),(short)4);
        i=__set_short((short)(__get_short(i,(short)4)+((short)(j=__set_short((short)(__get_short(j,(short)5)-1),(short)5)))),(short)4);
        i=__set_short((short)(__get_short(i,(short)4)-(-__get_short(j,(short)5))),(short)4);
        i=__set_short((short)(__get_short(i,(short)4)+(+((short)(j=__set_short((short)(__get_short(j,(short)5)+(2)),(short)5))))),(short)4);
        i=__set_short((short)(__get_short(i,(short)4)-((short)(j=__set_short((short)(__get_short(j,(short)5)+(2)),(short)5)))),(short)4);
        i=__set_short((short)(__get_short(i,(short)4)-(__get_short(j,(short)5)>>2)),(short)4);
        i=__set_short((short)(__get_short(i,(short)4)+(__get_short(j,(short)5)<<((short)(j=__set_short((short)(__get_short(j,(short)5)*2),(short)5))))),(short)4);
        i=__set_short((short)(__get_short(i,(short)4)-((short)((j=__set_short((short)(__get_short(j,(short)5)+1),(short)5))-1))),(short)4);
        i=__set_short((short)(__get_short(i,(short)4)-((short)((j=__set_short((short)(__get_short(j,(short)5)-1),(short)5))+1))),(short)4);
        i=__set_short((short)(__get_short(i,(short)4)-((short)(j=__set_short((short)(__get_short(j,(short)5)-1),(short)5)))),(short)4);
        assertEquals(-24, __get_short(i,(short)4));
        assertEquals(15, __get_short(j,(short)5));
        i=__set_short((short)((short)(__get_short(j,(short)5)-1)),(short)4);
        if ((short)(i=__set_short((short)(__get_short(i,(short)4)+1),(short)4)) == __get_short(j,(short)5)) {}
        else throw new AssertionError("IF statement should return true");
        assertEquals(15, __get_short(i,(short)4));
        a=__set_boolean((boolean)(!__get_boolean(b,(short)1)),(short)0);
        assertFalse(__get_boolean(a,(short)0));
    }
    
    protected short exprTest(short number){
        globalI=__set_short_g((short)((short)(number+10)),(short)0);
        number+=20;
        return (number++);
    }

    /**
     * Some aritmetic expressions and calculations. 
     */
    @Test
    public void expressions() {
        assertEquals(2,__get_byte_gs(globalStatic,(short)0));
        globalStatic=__set_byte_gs((byte)((byte)(__get_byte_gs(globalStatic,(short)0)+__get_byte_gs(globalStatic,(short)0)*2)),(short)0);
        assertEquals(6,__get_byte_gs(globalStatic,(short)0));
        short testArray[]=new short[2];
        assertEquals(__get_short_g(globalI,(short)0), 4);
        short i=__set_short((short)(4),(short)6),j=__set_short((short)(0),(short)7); assertEquals(4, __get_short(i,(short)6));
        j=__set_short((short)((short)((i=__set_short((short)(__get_short(i,(short)6)+1),(short)6))-1)),(short)7); assertEquals(5, __get_short(i,(short)6)); assertEquals(4, __get_short(j,(short)7));
        i=__set_short((short)(__get_short(i,(short)6)+(56*__get_short_g(globalI,(short)0)+__get_short(i,(short)6))),(short)6); assertEquals(234, __get_short(i,(short)6));
        i=__set_short((short)(__get_short(i,(short)6)-(3*__get_short_g(globalI,(short)0))),(short)6); assertEquals(222, __get_short(i,(short)6));
        i=__set_short((short)(__get_short(i,(short)6)*4),(short)6); assertEquals(888, __get_short(i,(short)6));
        i=__set_short((short)(__get_short(i,(short)6)/2),(short)6); assertEquals(444, __get_short(i,(short)6));
        assertEquals(444, (short)((i=__set_short((short)(__get_short(i,(short)6)+1),(short)6))-1));
        assertEquals(446, (short)(i=__set_short((short)(__get_short(i,(short)6)+1),(short)6)));
        assertEquals(445, (short)(i=__set_short((short)(__get_short(i,(short)6)-1),(short)6)));
        assertEquals(445, (short)((i=__set_short((short)(__get_short(i,(short)6)-1),(short)6))+1));
        assertEquals(444, __get_short(i,(short)6));
        i=__set_short((short)(__get_short(i,(short)6)+1),(short)6); assertEquals(445, __get_short(i,(short)6));
        i=__set_short((short)(0),(short)6);
        testArray[(short)((i=__set_short((short)(__get_short(i,(short)6)+1),(short)6))-1)]=(short)((i=__set_short((short)(__get_short(i,(short)6)-1),(short)6))+1);
        assertEquals(testArray[0], 1);
        i=__set_short((short)(exprTest((short)((i=__set_short((short)(__get_short(i,(short)6)+1),(short)6))-1))),(short)6);
        assertEquals(10, __get_short_g(globalI,(short)0));
        assertEquals(20, __get_short(i,(short)6));
        i=__set_short((short)(exprTest((short)(i=__set_short((short)(__get_short(i,(short)6)+1),(short)6)))),(short)6);
        assertEquals(31, __get_short_g(globalI,(short)0));
        assertEquals(41, __get_short(i,(short)6));
    }

    @Test
    public void simple(){
        short j=__set_short((short)(1),(short)8);
        assertEquals(1, __get_short(j,(short)8));
        for (short i=__set_short((short)(0),(short)9);__get_short(i,(short)9)<10;i=__set_short((short)(__get_short(i,(short)9)+1),(short)9)) j=__set_short((short)(__get_short(j,(short)8)+(__get_short(i,(short)9))),(short)8);
        assertEquals(46, __get_short(j,(short)8));
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
	private boolean __get_boolean(boolean value, short id){
		if (fault_resistant_boolean[id] != (boolean)(!value)) 
			throw new RuntimeException("Error induction");
		return value;
	}	/**
	 *	This method will set value in help array to negation of original value.
	 *@param value value to set
	 *@param id id of variable in array of shadow copies
	 *@return value value, which was set
	 */
	private boolean __set_boolean(boolean value, short id){
		fault_resistant_boolean[id] = (boolean)(!value);
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
	} 
	/**
	 *	This method will compare negation of input value with stored negation. 
	 * 	In case of error an exception will be thrown. 
	 *@param value value, which is expected
	 *@param id id of variable in array of shadow copies
	 *@throw Exception if value is corrupted
	 */
	private static byte __get_byte_gs(byte value, short id){
		if (fault_resistant_byte_gs[id] != (byte)(value ^ (byte)((1<<7)-1))) 
			throw new RuntimeException("Error induction");
		return value;
	}	/**
	 *	This method will set value in help array to negation of original value.
	 *@param value value to set
	 *@param id id of variable in array of shadow copies
	 *@return value value, which was set
	 */
	private static byte __set_byte_gs(byte value, short id){
		fault_resistant_byte_gs[id] = (byte)(value ^ (byte)((1<<7)-1));
		return value;
	} 
	/**
	 *	This method will compare negation of input value with stored negation. 
	 * 	In case of error an exception will be thrown. 
	 *@param value value, which is expected
	 *@param id id of variable in array of shadow copies
	 *@throw Exception if value is corrupted
	 */
	private byte __get_byte_g(byte value, short id){
		if (fault_resistant_byte_g[id] != (byte)(value ^ (byte)((1<<7)-1))) 
			throw new RuntimeException("Error induction");
		return value;
	}	/**
	 *	This method will set value in help array to negation of original value.
	 *@param value value to set
	 *@param id id of variable in array of shadow copies
	 *@return value value, which was set
	 */
	private byte __set_byte_g(byte value, short id){
		fault_resistant_byte_g[id] = (byte)(value ^ (byte)((1<<7)-1));
		return value;
	}}
