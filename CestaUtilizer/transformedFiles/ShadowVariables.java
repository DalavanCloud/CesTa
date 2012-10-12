package transformed.org.cesta.sample_project;

/**
 * Test class with sample computations. 
 * 
 * @author Tobias Smolka
 */
public class ShadowVariables { 
	private short fault_resistant_short[] = new short[3];	/* help array to store negations of local short variables*/ 
	private short fault_resistant_short_g[] = new short[2];	/* help array to store negations of global short variables*/
	private short globalVar = __set_short_g((short)(2),(short)0), overriden = __set_short_g((short)(3),(short)1);
	public ShadowVariables(short overriden){
		short i=__set_short((short)(1),(short)0),j=__set_short((short)(2),(short)1),excluded=__set_short((short)(10),(short)2);
		if (__get_short(i,(short)0)==__get_short(j,(short)1)){
			i=__set_short((short)(__get_short(i,(short)0)+(__get_short(j,(short)1))),(short)0);
			i=__set_short((short)(__get_short(i,(short)0)+(__get_short(excluded,(short)2))),(short)0);
			excluded=__set_short((short)(__get_short(i,(short)0)+__get_short(j,(short)1)),(short)2);
		}
		globalVar=__set_short_g((short)(3),(short)0);
		this.globalVar=__set_short_g((short)(4),(short)0);
		this.overriden=__set_short_g((short)(overriden),(short)1);
		
		this.globalVar=__set_short_g((short)(__get_short_g(this.overriden,(short)1)),(short)0);
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
	}}
