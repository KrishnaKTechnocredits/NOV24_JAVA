/*
 * Assignment - 29 : 2nd Dec'2024 [20 mins]
write a method to print asscii of Uppercase (A-Z), lowercase(a-z) and all digits (0-9).
 */
package amruta.AsciiCodes;

public class Assignment_29_PrintAscii {

	void getAscii(char startChar, char endChar) {
		for (char ch = startChar; ch <= endChar; ch++) {
			int asciiValue = ch;
			System.out.println("Ascii value of " + ch + " is --->  " + asciiValue);
		}
	}

	public static void main(String[] args) {
		Assignment_29_PrintAscii a29 = new Assignment_29_PrintAscii();
		a29.getAscii('A', 'Z');
		a29.getAscii('a', 'z');
		a29.getAscii('0', '9');
	}
}
