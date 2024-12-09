//write a logic to print below pattern.
//*
//**
//***
//****

package titiksha.NestedLoop_Patternprinting;

public class PatternPrinting1 {
	void patterPrint1(char ch) {
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(ch);
			}
			System.out.println();
		}

	}
//write a logic to print below pattern.
// *
// * #
// * # * 
// * # * #
// * # * # *
	void patterPrint8(char ch ,char ch2) {
		for (int i = 1; i <=5; i++) {
			for (int j = 1; j <= i; j++) {
				if(j%2==0) {
				System.out.print(ch2 +" ");
			}
				else {
					System.out.print(ch +" ");
				}
			}
			System.out.println();
		
		}
	}
	

//write a logic to print below pattern.
// 1
// 1 2
// 1 2 3
// 1 2 3 4
	
	void patterPrint2() {
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

//write a logic to print below pattern.
// 4 3 2 1 
// 4 3 2 
// 4 3 
// 4

	void patterPrint3() {
		for (int i = 1; i <= 4; i++) {
			for (int j = 4; j >= i; j--) {
				System.out.print(j + " ");
			}
			System.out.println();

		}
	}

	public static void main(String[] arsg) {
		PatternPrinting1 patternPrinting1 = new PatternPrinting1();
		patternPrinting1.patterPrint1('*');
		System.out.print("----------------------------" + "\n");
		patternPrinting1.patterPrint2();
		System.out.print("----------------------------" + "\n");
		patternPrinting1.patterPrint3();
		System.out.print("----------------------------" + "\n");
		patternPrinting1.patterPrint8('*','#');
	}
}
