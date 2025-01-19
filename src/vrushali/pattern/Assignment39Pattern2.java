package vrushali.pattern;

//
//Assignment - 39 : 8th Dec[15 mins]
//
//write a logic to print below pattern.
//
//1
//1 2
//1 2 3
//1 2 3 4
public class Assignment39Pattern2 {

	void printPattern() {
		for (int i = 1; i < 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" " + j + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Assignment39Pattern2 assignment39Pattern2 = new Assignment39Pattern2();
		assignment39Pattern2.printPattern();
	}

}
