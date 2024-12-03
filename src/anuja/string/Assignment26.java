package anuja.string;

/*Write a method which returns ascii value of given character. 

input : 'A'
output : 65

input : 'x'
output : 120

input : ' '
output : 32

input : '.'
output : 46
*/
public class Assignment26 {

	public static void main(String[] args) {

		Assignment26 assignment26 = new Assignment26();
		char ch1 = 'A';
		int asciiResult = assignment26.getAsciiFromChar(ch1);
		System.out.println("Ascii value of a given character: " + ch1 + " is ->" + asciiResult + ".\n");

		char ch2 = 'x';
		int asciiResult2 = assignment26.getAsciiFromChar(ch2);
		System.out.println("Ascii value of a given character: " + ch2 + " is ->" + asciiResult2 + ".\n");

		char ch3 = ' ';// space
		int asciiResult3 = assignment26.getAsciiFromChar(ch3);
		System.out.println("Ascii value of a given character which is a space is: " + ch3 + " is ->" + asciiResult3 + ".\n");

		char ch4 = '.';
		int asciiResult4 = assignment26.getAsciiFromChar(ch4);
		System.out.println("Ascii value of a given character: " + ch4 + " is ->" + asciiResult4 + ".\n");
	}

	public int getAsciiFromChar(char ch) {
		int ascii = ch;
		return ascii;

	}
}
