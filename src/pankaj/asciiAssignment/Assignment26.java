package pankaj.asciiAssignment;

public class Assignment26 {

	int charToAscii(char ch) {
		int ascii = ch;
		// System.out.println("The Ascii code for the character==>>"+ascii);
		return ascii;
	}

	public static void main(String[] args) {

		Assignment26 A = new Assignment26();
		// A.charToAscii('A');
		char ch = 'A';
		int asciivalue = A.charToAscii(ch);
		System.out.println("The Ascii code for the character==>>"+ch+ " "+" is " + asciivalue);

		ch = 'x';
		asciivalue = A.charToAscii(ch);
		System.out.println("The Ascii code for the character==>>"+ch+ " "+" is " + asciivalue);

		ch = ' ';
		asciivalue = A.charToAscii(ch);
		System.out.println("The Ascii code for the character==>>"+ch+ " "+" is " + asciivalue);

		ch = '.';
		asciivalue = A.charToAscii(ch);
		System.out.println("The Ascii code for the character==>>"+ch+ " "+" is " + asciivalue);

	}

}
