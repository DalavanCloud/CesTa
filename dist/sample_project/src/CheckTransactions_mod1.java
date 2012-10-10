package org.cesta.sample_project;

import javacard.framework.*;
import javacard.*;
import javacard.framework.JCSystem;

/**
 * Test class with insecure transactions
 * 
 * @author Tobias Smolka
 */
public class CheckTransactions extends Applet {

    private byte a[], b[], c[];

    public CheckTransactions(byte[] bArray, short bOffset, byte bLength) {
        register();
    }

    public static void install(byte[] bArray, short bOffset, byte bLength) {
        new CheckTransactions(bArray, bOffset, bLength);
    }
	
	// this method doesn't contain explicit start of transaction, 
	// start of method is used
	

	/***** WARNING *****
		Transaction may contain dangerous operations,		
		some variables are used in both assignments and 
		non atomic operations: a
	***** WARNING *****/ /* detected start of transaction */public void transactionWithoutStart(){
		Util.arrayFillNonAtomic(a, 0, 1, 2);
		a[0] = 1;
		JCSystem.abortTransaction()/* detected end of transaction */;
		a[0] = 1;        
	}

	// this method doesn't contain explicit end of transaction, 
	// end of method is used
	public void transactionWithoutEnd(){
		a[0] = 1;
		/* detected start of transaction */JCSystem.beginTransaction();
		a[0] = 1;
		Util.arrayFillNonAtomic(a, 0, 1, 2);
	}/* detected end of transaction */
	
	public void simple(){
		byte a[] = new byte[1];
		

	/***** WARNING *****
		Transaction may contain dangerous operations,		
		some variables are used in both assignments and 
		non atomic operations: a
	***** WARNING *****/ /* detected start of transaction */JCSystem.beginTransaction();
		a[0] = 1;
        Util.arrayFillNonAtomic(a, 0, 1, 2); // a[0] = 2;
		JCSystem.abortTransaction()/* detected end of transaction */;
	}

    public void process(APDU apdu) {
        byte buffer[] = apdu.getBuffer();
        short len = apdu.setIncomingAndReceive();

        // both a and b are insecure
        // + tested different method names
        

	/***** WARNING *****
		Transaction may contain dangerous operations,		
		some variables are used in both assignments and 
		non atomic operations: a, b
	***** WARNING *****/ /* detected start of transaction */JCSystem.beginTransaction();
        a[0] = 1;
        b[0] = 2;
        Util.arrayFillNonAtomic(a, (short) 0, (short) 1, (byte) 2); // a[0] = 2;
        javacard.framework.Util.arrayFillNonAtomic(b, (short) 0, (short) 1, (byte) 2);
        JCSystem.abortTransaction()/* detected end of transaction */;

        // only a and b are insecure
        // + tested strange transaction start (only first call is considered)
        if (a[0] == 2) {
            

	/***** WARNING *****
		Transaction may contain dangerous operations,		
		some variables are used in both assignments and 
		non atomic operations: a, b
	***** WARNING *****/ /* detected start of transaction */JCSystem.beginTransaction();
        } else {
            JCSystem.beginTransaction();
        }
        JCSystem.beginTransaction();
        a[0] = 1;
        b[0] = 2;
        c[0]++;
        Util.arrayFillNonAtomic(a, (short) 0, (short) 1, (byte) 2); // a[0] = 2;
        Util.arrayCopyNonAtomic(c, (short) 0, b, (short) 0, (byte) 1);
        JCSystem.abortTransaction()/* detected end of transaction */;

        // this transaction is not secure, both a and b should be detected
        

	/***** WARNING *****
		Transaction may contain dangerous operations,		
		some variables are used in both assignments and 
		non atomic operations: a, b
	***** WARNING *****/ /* detected start of transaction */JCSystem.beginTransaction();
        a[0] = 1;
        Util.arrayFillNonAtomic(b, (short) 0, (short) 1, (byte) 2);
        if (a[0] == 2) {
            JCSystem.commitTransaction();
        } else if (a[0] == 2) {
            Util.arrayFillNonAtomic(a, (short) 0, (short) 1, (byte) 2);
            JCSystem.commitTransaction();
        } else if (b[0] == 2) {
            b[0] = 2;
            JCSystem.commitTransaction();
        } else {
            JCSystem.abortTransaction()/* detected end of transaction */;
        }

        // this transaction should be ok, no warning is expected
        /* detected start of transaction */JCSystem.beginTransaction();
        a[0] = 1;
        Util.arrayFillNonAtomic(b, (short) 0, (short) 1, (byte) 2);
        JCSystem.commitTransaction()/* detected end of transaction */;
    }
}
