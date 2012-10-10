package transformed.org.cesta.trans.java;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Test for IfSwitch transformation. This test class will
 * be automatically transformed during compilation. 
 * 
 * @author Tobias Smolka
 */
import java.util.Random;
public class IfSwitchReplacementTest {
    @Test
    public void simpleIf() {
        int j=0;
	/***** BEGIN ORIGINAL [IDENTIFY_BLOCKS_1] *****
	        for (int i=0;i<10;i++){
	            if (i==5) break;
	            j+=i;
	        } 
	***** END ORIGINAL [IDENTIFY_BLOCKS_1] *****/ 
	/***** BEGIN REPLACE [IDENTIFY_BLOCKS_1] *****/ 
	BLOCK_1: { for (int i=0;i<10;i++){
	            if (i==5) break BLOCK_1;
	            j+=i;
	        } }
	/***** END REPLACE [IDENTIFY_BLOCKS_1] *****/ 
        assertEquals(10, j);
    }
    @Test
    public void switchFor(){
        short k=0;
	/***** BEGIN ORIGINAL [IDENTIFY_BLOCKS_2] *****
	        switch (k) {
	            case 0: 
	                    for (short i = 0; i < 6; i++) {
	                        k+=i;
	                    }
	                    if (k==15) break;
	                    k++;
	            
	        } 
	***** END ORIGINAL [IDENTIFY_BLOCKS_2] *****/ 
	/***** BEGIN REPLACE [IDENTIFY_BLOCKS_2] *****/ 
	BLOCK_2: { switch (k) {
	            case 0: 
	                    for (short i = 0; i < 6; i++) {
	                        k+=i;
	                    }
	                    if (k==15) break BLOCK_2;
	                    k++;
	            
	        } }
	/***** END REPLACE [IDENTIFY_BLOCKS_2] *****/ 
        assertEquals(15, k);
    }
    public short returnFunc(){
        int i=1, j=2;
	/***** BEGIN ORIGINAL [IF_SWITCH_4] *****
	        if (i==1) {
	            if (j==0) throw new RuntimeException("Dummy exception");
	            else return 2;
	        }
	        else return 3; 
	***** END ORIGINAL [IF_SWITCH_4] *****/ 
	/***** BEGIN REPLACE [IF_SWITCH_4] *****/ 
	IF_SWITCH_4: {
		switch (__getRandomBit()){
			case -1: 
				throw new RuntimeException("__getRandomBit() returned invalid value");
			case 0:
				if ((i==1)) {
					{
						/***** BEGIN ORIGINAL [IF_SWITCH_5] *****
						            if (j==0) throw new RuntimeException("Dummy exception");
						            else return 2; 
						***** END ORIGINAL [IF_SWITCH_5] *****/ 
						/***** BEGIN REPLACE [IF_SWITCH_5] *****/ 
						IF_SWITCH_5: {
							switch (__getRandomBit()){
								case -1: 
									throw new RuntimeException("__getRandomBit() returned invalid value");
								case 0:
									if ((j==0)) {
										throw new RuntimeException("Dummy exception");
									} else {
										return 2;
									}
								case 1:
									if (!(j==0)) {
										return 2;
									} else {
										throw new RuntimeException("Dummy exception");
									}
								default:
									throw new RuntimeException("__getRandomBit() returned invalid value");
							}
						}
						/***** END REPLACE [IF_SWITCH_5] *****/ 
					        }
				} else {
					return 3;
				}
			case 1:
				if (!(i==1)) {
					return 3;
				} else {
					{
						/***** BEGIN ORIGINAL [IF_SWITCH_5] *****
						            if (j==0) throw new RuntimeException("Dummy exception");
						            else return 2; 
						***** END ORIGINAL [IF_SWITCH_5] *****/ 
						/***** BEGIN REPLACE [IF_SWITCH_5] *****/ 
						IF_SWITCH_5: {
							switch (__getRandomBit()){
								case -1: 
									throw new RuntimeException("__getRandomBit() returned invalid value");
								case 0:
									if ((j==0)) {
										throw new RuntimeException("Dummy exception");
									} else {
										return 2;
									}
								case 1:
									if (!(j==0)) {
										return 2;
									} else {
										throw new RuntimeException("Dummy exception");
									}
								default:
									throw new RuntimeException("__getRandomBit() returned invalid value");
							}
						}
						/***** END REPLACE [IF_SWITCH_5] *****/ 
					        }
				}
			default:
				throw new RuntimeException("__getRandomBit() returned invalid value");
		}
	}
	/***** END REPLACE [IF_SWITCH_4] *****/ 
    }
    @Test
    public void returns(){
        assertEquals(2, returnFunc());
    }
	/** Random number generator for IF_SWITCH transformation */
	private static Random __random = null;	
	/**
	 *	Returns random bit 0 or 1
	 */
	private static byte __getRandomBit(){
		if (__random == null) __random = new Random();
		return (byte)(__random.nextInt(2));
	}}
