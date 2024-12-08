/*Write a method which returns character of given ascii value.*/
package pankaj.asciiAssignment;

public class Assignment27 {

	void asciiToChar(int ascii) {
		char ch = (char) ascii;
		System.out.println(ch + " " + "is the char of the ascii code" + " " + ascii);
	}

	public static void main(String[] args) {

		Assignment27 A27 = new Assignment27();
		for (int ascii = 91; ascii < 98; ascii++) {
			A27.asciiToChar(ascii);
		}

	}

}
