/*write a method to print all the characters having ascii value from 65 to 100. */
package pankaj.asciiAssignment;

public class Assignment28 {

	int asciiPrint(char ch) {
		int ascii = (char) ch;

		return ascii;

	}

	int asciiToChar(int ascii) {
		char ch = (char) ascii;
		System.out.println(ch + " " + "is the char of the ascii code" + " " + ascii);
		return ascii;
	}

	public static void main(String[] args) {

		Assignment28 A28 = new Assignment28();
		Assignment28 A2 = new Assignment28();
		for (char ascii = 65; ascii <= 100; ascii++) {
			int num = A28.asciiPrint(ascii);
			System.out.println(num + " " + "is represented by the ascii value" + " " + ascii);
		}
		System.out.println("===============================================");
		for (char ascii = 'A'; ascii <= 'Z'; ascii++) {
			 A2.asciiToChar(ascii);
			// System.out.println(num);
		}

	}

}
