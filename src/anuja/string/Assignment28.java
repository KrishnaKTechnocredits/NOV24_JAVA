package anuja.string;
/*write a method to print all the characters having ascii value from 65 to 100.

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
Z -> 90*/

public class Assignment28 {

	public static void main(String[] args) {

		Assignment28 assignment28 = new Assignment28();

		for (int i = 65; i <= 100; i++) {
			char resultCh = assignment28.getCharFromAscii(i);
			System.out.println(i + " -> " + resultCh);
		}
		System.out.println("-------------------------------------------------------------");

		for (char j = 'A'; j <= 'Z'; j++) {
			int result = assignment28.getAsciiFromChar(j);
			System.out.println(j + " -> " + result);

		}

	}

	public char getCharFromAscii(int i) {
		char ch = (char)i;
		return ch;
	}

	public int getAsciiFromChar(char j) {
		int ascii = j;
		return ascii;
	}

}
