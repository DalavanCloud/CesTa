/*
 * Copyright © 2002 Sun Microsystems, Inc. All rights reserved.
 * SUN PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

// /*
// Workfile:@(#)Record.java	1.6
// Version:1.6
// Date:02/01/02
// 
// Archive:  /Products/Europa/samples/com/sun/javacard/samples/JavaPurse/Record.java 
// Modified:02/01/02 16:39:05
// Original author: Zhiqun Chen
// */

package	com.sun.javacard.samples.JavaPurse;

/**
 * A Record.
 * <p>The main reason for this class is that Java Card doesn't support multidimensional
 * arrays, but supports array of objects
 */

class Record
{

	byte[] record;

	Record(byte[] data) {
      this.record = data;
    }

    Record(short size) {
      record = new byte[size];
    }

}

