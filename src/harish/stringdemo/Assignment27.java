/**
 * 
 */
package harish.stringdemo;

/**
 * Assignment - 27 : 2nd Dec'2024
 * 
 * Write a method which returns character of given ASCII value.
 * 
 * Time Taken - 5 minutes
 */
public class Assignment27 {

	private char getCharacterFromAscii(int input) {
		return (char) input;
	}

	public static void main(String[] args) {
		Assignment27 assignment27 = new Assignment27();
		int input = 65;
		char characterFromAscii = assignment27.getCharacterFromAscii(input);
		System.out.println("The Character represented by Ascii value " + input + " is - " + characterFromAscii);

		input = 90;
		characterFromAscii = assignment27.getCharacterFromAscii(input);
		System.out.println("The Character represented by Ascii value " + input + " is - " + characterFromAscii);

		input = 55;
		characterFromAscii = assignment27.getCharacterFromAscii(input);
		System.out.println("The Character represented by Ascii value " + input + " is - " + characterFromAscii);
	}
}
