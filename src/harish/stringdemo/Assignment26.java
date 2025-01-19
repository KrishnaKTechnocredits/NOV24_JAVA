/**
 * 
 */
package harish.stringdemo;

/**
 * Assignment - 26 : 2nd Dec'2024
 * 
 * Write a method which returns ASCII value of given character.
 * 
 * Time Taken - 5 minutes
 */
public class Assignment26 {

	private int getAsciiValue(char ch) {
		return ch;
	}

	public static void main(String[] args) {
		Assignment26 assignment26 = new Assignment26();
		char ch = 'A';
		int asciiValue = assignment26.getAsciiValue(ch);
		System.out.println("The Ascii value of char " + ch + " is - " + asciiValue);

		ch = 'x';
		asciiValue = assignment26.getAsciiValue(ch);
		System.out.println("The Ascii value of char " + ch + " is - " + asciiValue);

		ch = ' ';
		asciiValue = assignment26.getAsciiValue(ch);
		System.out.println("The Ascii value of char " + ch + " is - " + asciiValue);

		ch = '.';
		asciiValue = assignment26.getAsciiValue(ch);
		System.out.println("The Ascii value of char " + ch + " is - " + asciiValue);
	}
}
