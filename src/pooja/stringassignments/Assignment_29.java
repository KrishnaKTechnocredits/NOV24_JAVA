package pooja.stringassignments;
/*
 * Assignment - 29 : 2nd Dec'2024 [20 mins]
write a method to print asscii of Uppercase (A-Z), lowercase(a-z) and all digits (0-9).
*/

public class Assignment_29 {

	void printAsciiLowerCaseLetters() {
		for (int i = 'a'; i <= 'z'; i++)
			System.out.println((char) i + " -> " + i);
	}

	void printAsciiUpperCaseLetters() {
		for (int i = 'A'; i <= 'Z'; i++) {
			System.out.println((char) i + " -> " + i);
		}
	}

	void printAsciiDigits() {
		for (int i = '0'; i <= '9'; i++) {
			System.out.println((char) i + " -> " + i);
		}
	}

	public static void main(String[] args) {
		Assignment_29 assignment_29 = new Assignment_29();
		System.out.println("-----Lower Case Letters Ascii Value-----");
		assignment_29.printAsciiLowerCaseLetters();
		System.out.println("-----Upper Case Letters Ascii Value-----");
		assignment_29.printAsciiUpperCaseLetters();
		System.out.println("-----Digits Ascii Value-----");
		assignment_29.printAsciiDigits();
	}
}