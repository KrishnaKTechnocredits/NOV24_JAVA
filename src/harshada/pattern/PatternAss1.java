//Assignment - 38 : 8th Dec [15 mins]
//write a logic to print below pattern.
//
//*
//**
//***
//****

package harshada.pattern;

public class PatternAss1 {

	void printPattern() {
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}

	public static void main(String[] args) {
		PatternAss1 patternAss1 = new PatternAss1();
		patternAss1.printPattern();
	}
}
