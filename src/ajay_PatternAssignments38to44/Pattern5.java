/*
Print pattern below 
1
2 2
3 3 3
4 4 4 4
*/
package ajay_PatternAssignments38to44;

public class Pattern5 {

	void patternPrinting() {

		for(int i=1;i<=4;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(i +" ");	

			}System.out.println();
		}
	}
	public static void main(String[] args) {
		Pattern5 pattern5=new Pattern5();
		pattern5.patternPrinting();

	}

}
