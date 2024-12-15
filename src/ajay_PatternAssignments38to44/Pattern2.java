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

public class Pattern2 {
	
	void patternprinting() {
		int i,j;
		for(i=1;i<=4;i++) {
			for(j=1;j<=i;j++) {
			System.out.print("*");
			
			}System.out.println();
		}
		
	}

	public static void main(String[] args) {
		Pattern2 pattern2=new Pattern2();
		pattern2.patternprinting();
	}

}
