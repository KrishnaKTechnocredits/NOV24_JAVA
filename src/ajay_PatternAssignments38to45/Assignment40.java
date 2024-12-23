/*
 Print Pattern Below
1 
2 3 
4 5 6 
7 8 9 10
 
 */
	package ajay_PatternAssignments38to45;

public class Assignment40 {
	
	void PatternPrinting() {
		int count=1;
		//char count1='A';  //Changes made to incorporate Interview Question
		for(int i=1;i<=4;i++) {
			
			for(int j=1;j<=i;j++) {
				System.out.print(count +" ");
				//System.out.print(count1 +" ");   //Changes made to incorporate Interview Question
				count++;
				//count1++;   //Changes made to incorporate Interview Question
			}System.out.println();
		}
	}

	public static void main(String[] args) {
		Assignment40 pattern3=new Assignment40();
		pattern3.PatternPrinting();
	}

}
