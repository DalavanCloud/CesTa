package org.cesta.sample_project;

/**
 * Test class with sample computations. 
 * 
 * @author Tobias Smolka
 */
public class ShadowVariables {
	private short globalVar = 2, overriden = 3;
	public ShadowVariables(short overriden){
		short i=1,j=2,excluded=10;
		if (i==j){
			i+=j;
			i+=excluded;
			excluded=i+j;
		}
		globalVar = 3;
		this.globalVar = 4;
		this.overriden = overriden;
		
		this.globalVar = this.overriden;
	}
}
