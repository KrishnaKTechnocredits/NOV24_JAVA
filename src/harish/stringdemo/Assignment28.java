/**
 * 
 */
package harish.stringdemo;

/**
 * Assignment - 28 : 2nd Dec'2024
 * 
 * write a method to print all the characters having ASCII value from 65 to 100.
 * 
 * Time Taken - 8 minutes
 */
public class Assignment28 {

	private void printCharactersForAscii(int startRange, int endRange) {
		System.out.println("The ASCII to Character Map is as below - ");
		for (int i = startRange; i <= endRange; i++) {
			System.out.println(i + " -> " + (char) i);
		}
	}

	private void printAsciiForCharacter(String str) {
		System.out.println("\nThe Character to ASCII Map is as below - ");
		for (int i = 0; i < str.length(); i++) {
			int ascii = str.charAt(i);
			System.out.println(str.charAt(i) + " -> " + ascii);
		}
	}

	public static void main(String[] args) {
		Assignment28 assignment28 = new Assignment28();
		assignment28.printCharactersForAscii(65, 100);

		String input = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		assignment28.printAsciiForCharacter(input);
	}
}
