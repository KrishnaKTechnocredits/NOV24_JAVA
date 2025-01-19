package roshan.nestedloop.patternPrint;

public class PrintPatternAss2 {
	static void printpatternNumber () {
		for (int i=1;i<=4;i++) {
			for(int j =1;j<=i;j++) {
				System.out.print(i+ " ");
			}
			System.out.println();

		}
		
	}
public static void main(String[] args) {
	PrintPatternAss2.printpatternNumber();
}
}































/*
 * write a logic to print below pattern.
 * 
 * 1 
 * 1 2 
 * 1 2 3 
 * 1 2 3 4
 */