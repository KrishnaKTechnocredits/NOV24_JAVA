//Assignment - 26 : 2nd Dec'2024 [10 mins]
//Write a method which returns ascii value of given character. 
//input : 'A'   output : 65
//input : 'x'  output : 120
//input : ' '   output : 32
//input : '.'   output : 46

//Assignment 27 :Write a method which returns character of given ascii value.
//input : 65   output : A
//input : 90   output : Z
//input : 55     output : 8 

package titiksha.Ascii;

public class Characterascii {
	void getasciiOfNumber(char character) {
		int ascii = character;// implicit datatype casting //int has 4 byte //character has 2 byte here we are
								// assigning small value to big so, no CE
		System.out.println("The ascii of " + character + "is :" + ascii);
	}

	void getCharacterOfAscii(int ascii) {
		char ch = (char) ascii;
		System.out.println("The number " + ascii + " is ascii for charcter " + ch);
	}

	public static void main(String[] args) {
		Characterascii characterascii = new Characterascii();
		characterascii.getasciiOfNumber('A');
		characterascii.getasciiOfNumber('x');
		characterascii.getasciiOfNumber(' ');
		characterascii.getasciiOfNumber('.');
		characterascii.getCharacterOfAscii(65);
		characterascii.getCharacterOfAscii(90);
		characterascii.getCharacterOfAscii(55);
	}
}
