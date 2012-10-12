package org.cesta.sample_project;

/**
 * Test class with if constructions.
 * 
 * @author Tobias Smolka
 */

public class IfSwitchReplacement {
	public IfSwitchReplacement() {
		short i=1,j;
		if (i==1) j=10;
		else j=20;
	}
	public void test(){
		short i = 10, j=20;
		for (i=1;i<10;i++){
			if (i==2) break;
			else continue;
		}
		
		if (i==20){
			if (j==10) j=20;
			else j=30;
		} else if (i==30) {			
			if (j==20) j=40;
			else j=50;
		} else {
			j=80;
		}
	}
}
