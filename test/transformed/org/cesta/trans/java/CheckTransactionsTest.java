package transformed.org.cesta.trans.java;

import org.junit.Test;

/**
 * Simple test for CheckTransactions transformation.
 * The transformation doesn't add any specific behaviour,
 * therefore the test will always run fine.
 * But transformed test can be visually inspected. 
 *
 * @author Tobias Smolka
 */
public class CheckTransactionsTest {
    
    /**
     * Dummy method, that is considered to be non-atomic
     */
    public static void NonAtomic(byte[] array){}
    
    /**
     * Dummy method, that starts transaction
     */
    public static void StartTransaction(){}
    
    /**
     * Dummy method, that ends transaction
     */
    public static void EndTransaction(){}

    @Test
    /**
     * Simple test, that should report warning for a
     */
    public void simple(){
        byte[] a = new byte[1], b = new byte[1];
        b[0] = 20;
        

	/***** WARNING *****
		Transaction may contain dangerous operations,		
		some variables are used in both assignments and 
		non atomic operations: a
	***** WARNING *****/ /* detected start of transaction */StartTransaction();
        NonAtomic(a);
        a[0] = 10;
        NonAtomic(b);
        EndTransaction()/* detected end of transaction */;
    }
}
