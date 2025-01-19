package roshan.nestedloop.patternPrint;

public class PrintPatternAss1 {
	static void print() {
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}

	public static void main(String[] args) {
		PrintPatternAss1.print();
	}
}

/*
 * Assignment - 38 : 8th Dec [15 mins] write a logic to print below pattern.
 */

//*
//**
//***
//****