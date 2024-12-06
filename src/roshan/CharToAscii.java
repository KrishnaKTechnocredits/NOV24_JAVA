package roshan;

public class CharToAscii {
	static int getAsciiOfChar(char ch) {
		int asciiValue = ch; // note- dont add ch in ""/''
		return asciiValue;
	}

	public static void main(String[] args) {

		System.out.println("Ascii value of given character is " + CharToAscii.getAsciiOfChar('0'));
	}

}

/*
 * Assignment - 26 : 2nd Dec'2024 [10 mins]
 * 
 * Write a method which returns ascii value of given character.
 * 
 * input : 'A' output : 65
 * 
 * input : 'x' output : 120
 * 
 * input : ' ' output : 32
 */