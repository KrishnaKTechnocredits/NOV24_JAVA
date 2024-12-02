/**
 * 
 */
package harish.stringdemo;

/**
 * Assignment - 29 : 2nd Dec'2024 [20 mins]
 * 
 * Write a method to print asscii of Uppercase (A-Z), lowercase(a-z) and all
 * digits (0-9).
 * 
 * Time Taken - 10 minutes
 */
public class Assignment29 {

	private void printAsciiForUpperCaseCharacter(String str) {
		System.out.println("The Character to ASCII Map for upper case chars is as below - ");
		for (int i = 0; i < str.length(); i++) {
			int ascii = str.charAt(i);
			System.out.println(str.charAt(i) + " -> " + ascii);
		}
	}

	private void printAsciiForLowerCaseCharacter(String str) {
		System.out.println("\nThe Character to ASCII Map for lower case chars is as below - ");
		for (int i = 0; i < str.length(); i++) {
			int ascii = str.charAt(i);
			System.out.println(str.charAt(i) + " -> " + ascii);
		}
	}

	private void printAsciiForDigits(String str) {
		System.out.println("\nThe Character to ASCII Map for digits 0-9 is as below - ");
		for (int i = 0; i < str.length(); i++) {
			int ascii = str.charAt(i);
			System.out.println(str.charAt(i) + " -> " + ascii);
		}
	}

	public static void main(String[] args) {
		Assignment29 assignment29 = new Assignment29();
		String upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		assignment29.printAsciiForUpperCaseCharacter(upperCase);
		String lowerCase = "abcdefghijklmnopqrstuvwxyz";
		assignment29.printAsciiForLowerCaseCharacter(lowerCase);
		String digits = "0123456789";
		assignment29.printAsciiForDigits(digits);
	}
}
