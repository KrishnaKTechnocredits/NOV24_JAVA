/*
-----------------------------------------------
Print Below Pattern
*
**
***
****

----------------------------------------------------
*/
package ajay_PatternAssignments38to44;

public class Assignment38 {
	
	void patternprinting() {
		int i,j;
		for(i=1;i<=4;i++) {
			for(j=1;j<=i;j++) {
			System.out.print("*");
			
			}System.out.println();
		}
		
	}

	public static void main(String[] args) {
		Assignment38 pattern2=new Assignment38();
		pattern2.patternprinting();
	}

}
