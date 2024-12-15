//Assignment - 38 : 8th Dec [15 mins]
//write a logic to print below pattern.
//*
//**
//***
//****

package komal.Patterns;

public class Assignment38 {
	void getPattern() {
		int n = 4;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void main(String args[]) {
		Assignment38 a38 = new Assignment38();
		a38.getPattern();
	}

}
