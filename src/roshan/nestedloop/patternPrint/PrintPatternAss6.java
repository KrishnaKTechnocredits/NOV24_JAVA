package roshan.nestedloop.patternPrint;

public class PrintPatternAss6 {
	
	static void printPattern () {
		char ch = 'A';
		for(int i=1 ;i<=4;i++) {
			for(int j=1;j<=i;j++ ) {
				System.out.print(ch + " " );
				ch++;
			}
			System.out.println();
		}
		
	}
	public static void main(String[] args) {
		PrintPatternAss6.printPattern();

}
}




























/*
 * Assignment - 43 : 8th Dec[10 mins]
 * 
 * write a logic to print below pattern.
 */

//A
//B C
//D E F
//G H I J