/*
 Print Pattern Below
1 
2 3 
4 5 6 
7 8 9 10
 
 */
	package ajay_PatternAssignments38to44;

public class Pattern3 {
	
	void PatternPrinting() {
		int count=1;
		char count1='A';
		for(int i=1;i<=4;i++) {
			
			for(int j=1;j<=i;j++) {
				System.out.print(count);
				System.out.print(count1 +" ");
				count++;
				count1++;
			}System.out.println();
		}
	}

	public static void main(String[] args) {
		Pattern3 pattern3=new Pattern3();
		pattern3.PatternPrinting();
	}

}
