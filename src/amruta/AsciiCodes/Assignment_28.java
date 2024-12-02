/*
 * write a method to print all the characters having ascii value from 65 to 100.

output : 
65 -> A
66 -> B 
so on .. 

write a method to print ascii values for character A to Z.
output : 
A -> 65
B -> 66
..
..
Z -> 90
 */

package amruta.AsciiCodes;

public class Assignment_28 {

	static void printAllCharactersOfGivenAsciiValue(int startNum, int endNum) {
		int index = startNum;
		for (; index <= endNum; index++) {
			char ch = (char) index;
			System.out.println("Character of given Ascii value - " + index + " is : " + ch);
		}
	}

	void printAllAsciiValueOfGivenChar(char startChar, char endChar) {
		char ch = startChar;
		for (; ch <= endChar; ch++) {
			int val = ch;
			System.out.println("Ascii value of char " + ch + " is : " + val);
		}
	}

	public static void main(String[] args) {
		printAllCharactersOfGivenAsciiValue(65, 100);
		System.out.println("==========================================================");
		Assignment_28 a28 = new Assignment_28();
		a28.printAllAsciiValueOfGivenChar('A', 'Z');
	}
}
