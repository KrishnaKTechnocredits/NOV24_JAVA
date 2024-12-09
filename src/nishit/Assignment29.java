package nishit;

public class Assignment29
{
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
