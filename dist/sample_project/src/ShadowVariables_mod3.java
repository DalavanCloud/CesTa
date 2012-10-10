package org.cesta.sample_project;

/**
 * Test class with sample computations. 
 * 
 * @author Tobias Smolka
 */
import javacard.framework.ISO7816;
import javacard.framework.ISOException;
public class ShadowVariables { 
	private short fault_resistant_short_g[] = new short[2];	/* help array to store negations of global short variables*/
	private short globalVar = __set_short_g((short)(2),(short)0), overriden = __set_short_g((short)(3),(short)1);
	public ShadowVariables(short overriden){
		short i=1,j=2,excluded=10;
		if (i==j){
			i+=j;
			i+=excluded;
			excluded=i+j;
		}
		globalVar=__set_short_g((short)(3),(short)0);
		this.globalVar=__set_short_g((short)(4),(short)0);
		this.overriden=__set_short_g((short)(overriden),(short)1);
		
		this.globalVar=__set_short_g((short)(__get_short_g(this.overriden,(short)1)),(short)0);
	}
 
	/**
	 *	Custom getter
	 */
	private short __get_short_g(short value, short id){
		// all checks are disabled
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
	}}
