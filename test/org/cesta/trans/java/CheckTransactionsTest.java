/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.cesta.trans.java;

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
        byte[] a=new byte[1], b=new byte[1];
        b[0]=20;
        StartTransaction();
        NonAtomic(a);
        a[0]=10;
        NonAtomic(b);
        EndTransaction();
    }
}
