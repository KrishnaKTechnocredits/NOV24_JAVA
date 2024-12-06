//Assignment - 28 : 2nd Dec'2024 [20 mins]
//
//write a method to print all the characters having ascii value from 65 to 100.
//
//output : 
//65 -> A
//66 -> B 
//so on .. 
//
//write a method to print ascii values for character A to Z.
//output : 
//A -> 65
//B -> 66
//..
//..
//Z -> 90

package harshada.ascii;

public class Ascii_Ex3 {
	void findAsciiofChar(char startChar, char endChar) {
		int ascii;
		for (char ch = startChar; ch <= endChar; ch++) {
			ascii = ch;
			System.out.println("Ascii value of " + ch + " is " + ascii);
		}
	}

	void printCharfromAscii(int asciiStart, int asciiEnd) {
		char ch;
		for (int ascii = asciiStart; ascii <= asciiEnd; ascii++) {
			ch = (char) ascii;
			System.out.println("Character from ascii value " + ascii + " is " + ch);
		}
	}

	public static void main(String[] args) {
		Ascii_Ex3 ascii_Ex3 = new Ascii_Ex3();
		ascii_Ex3.findAsciiofChar('A', 'Z');
		ascii_Ex3.printCharfromAscii(65, 100);
	}
}
