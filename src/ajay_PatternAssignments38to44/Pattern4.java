/*
Print Pattern Below

1 1 1 1
2 2 2 2
3 3 3 3
4 4 4 4
5 5 5 5

*/

package ajay_PatternAssignments38to44;

public class Pattern4 {
	
	void patternPrinting() {
		
		for(int i=1;i<=5;i++) {
			
			for(int j=1;j<=4;j++) {
				
				System.out.print(i +" ");
				
			}System.out.println();
		}
	}
	

	public static void main(String[] args) {
		Pattern4 pattern4=new Pattern4();
		pattern4.patternPrinting();

	}

}
