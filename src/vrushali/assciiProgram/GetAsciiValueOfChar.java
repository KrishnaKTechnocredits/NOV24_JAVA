package vrushali.assciiProgram;

//Assignment - 26 : 2nd Dec'2024 [10 mins]
//
//Write a method which returns ascii value of given character. 
//
//input : 'A'
//output : 65
//
//input : 'x'
//output : 120
//
//input : ' '
//output : 32
//
//input : '.'
//output : 46
public class GetAsciiValueOfChar {
	int getAsciiValueOfChar(Character ch) {
		int ascii = 0;
		ascii = ch;
		return ascii;
	}

	public static void main(String[] args) {

		GetAsciiValueOfChar getAsciiValueOfChar = new GetAsciiValueOfChar();
		int ascii = getAsciiValueOfChar.getAsciiValueOfChar('A');
		System.out.println("Ascii value of A is -> " + ascii);

		ascii = getAsciiValueOfChar.getAsciiValueOfChar('x');
		System.out.println("Ascii value of x is -> " + ascii);

		ascii = getAsciiValueOfChar.getAsciiValueOfChar(' ');
		System.out.println("Ascii value of space is -> " + ascii);

		ascii = getAsciiValueOfChar.getAsciiValueOfChar('.');
		System.out.println("Ascii value of. is -> " + ascii);

	}
}
