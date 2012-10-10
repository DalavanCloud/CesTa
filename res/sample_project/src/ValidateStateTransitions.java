package org.cesta.sample_project;

import javacard.framework.*;

/**
 * Test class with state transitions.  
 * 
 * @author Tobias Smolka
 */
public class TestValidateStateTransitions extends Applet {
	public final static short STATE_INSTALLED = 1;
	public final static short STATE_UPLOADED = 2;
	
	short currentState = STATE_UPLOADED;
	
	private TestValidateStateTransitions(byte[] bArray,short bOffset,byte bLength){
		register();
	}
	public static void install(byte[] bArray, short bOffset, byte bLength){
		setState(STATE_INSTALLED);
	}
	private short getState(){
		return currentState;
	}
	private void setState(short newState){		
		currentState = newState;
	}
	public void testSomething(){
		// this function will be ignored
	}
}
