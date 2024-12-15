package roshan.nestedloop.patternPrint;

public class PrintPatternAss8 {
	static void printPattern() {
		int count=0;
		for (int i = 1; i <= 5; i++) {
			if(i%2==0) {
			count=3;
			}else {
				count=5;
			}
			for (int j = 1; j <= i; j++) {
				
				if(j%2==1) {
				System.out.print("* ");
				}else {
					System.out.print("# " );
				}	
			}
			System.out.println();	
			
		}
	}

	public static void main(String[] args) {
		PrintPatternAss8.printPattern();
	}
}
	


















//Assignment - 45 : 10th Dec 
//#*#*#
//#*#
//#*#*#
//#*#