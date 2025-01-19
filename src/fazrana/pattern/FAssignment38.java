//Assignment - 38 : 8th Dec [15 mins]
//write a logic to print below pattern.
//
//*
//**
//***
//****

package fazrana.pattern;

public class FAssignment38 {
	void starPattern() {
		for (int i=1;i<=4;i++) {
			for (int j=1; j<=i;j++) {
				System.out.print("*"+" ");
			}
		System.out.println();
		}
	}
	
	public static void main(String[] args) {
		FAssignment38 fassignment38=new FAssignment38();
		fassignment38.starPattern();
	}
}
