package roshan.nestedloop.patternPrint;

public class PrintPatternAss7 {
	static void printPattern() {
		for (int i = 1; i <= 5; i++) {
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
		PrintPatternAss7.printPattern();
	}
}
		
	
	












/*
 * Assignment - 44 : 8th Dec[15 mins] write a logic to print below pattern.
 */
//* 
//* #
//* # * 
//* # * #
//* # * # *












//*            
//* #
//# 
//# #
//# # *