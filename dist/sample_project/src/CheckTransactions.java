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
	public void transactionWithoutStart(){
		Util.arrayFillNonAtomic(a, 0, 1, 2);
		a[0] = 1;
		JCSystem.abortTransaction();
		a[0] = 1;        
	}

	// this method doesn't contain explicit end of transaction, 
	// end of method is used
	public void transactionWithoutEnd(){
		a[0] = 1;
		JCSystem.beginTransaction();
		a[0] = 1;
		Util.arrayFillNonAtomic(a, 0, 1, 2);
	}
	
	public void simple(){
		byte a[] = new byte[1];
		JCSystem.beginTransaction();
		a[0] = 1;
        Util.arrayFillNonAtomic(a, 0, 1, 2); // a[0] = 2;
		JCSystem.abortTransaction();
	}

    public void process(APDU apdu) {
        byte buffer[] = apdu.getBuffer();
        short len = apdu.setIncomingAndReceive();

        // both a and b are insecure
        // + tested different method names
        JCSystem.beginTransaction();
        a[0] = 1;
        b[0] = 2;
        Util.arrayFillNonAtomic(a, (short) 0, (short) 1, (byte) 2); // a[0] = 2;
        javacard.framework.Util.arrayFillNonAtomic(b, (short) 0, (short) 1, (byte) 2);
        JCSystem.abortTransaction();

        // only a and b are insecure
        // + tested strange transaction start (only first call is considered)
        if (a[0] == 2) {
            JCSystem.beginTransaction();
        } else {
            JCSystem.beginTransaction();
        }
        JCSystem.beginTransaction();
        a[0] = 1;
        b[0] = 2;
        c[0]++;
        Util.arrayFillNonAtomic(a, (short) 0, (short) 1, (byte) 2); // a[0] = 2;
        Util.arrayCopyNonAtomic(c, (short) 0, b, (short) 0, (byte) 1);
        JCSystem.abortTransaction();

        // this transaction is not secure, both a and b should be detected
        JCSystem.beginTransaction();
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
            JCSystem.abortTransaction();
        }

        // this transaction should be ok, no warning is expected
        JCSystem.beginTransaction();
        a[0] = 1;
        Util.arrayFillNonAtomic(b, (short) 0, (short) 1, (byte) 2);
        JCSystem.commitTransaction();
    }
}
