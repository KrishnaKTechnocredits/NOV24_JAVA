/*Assignment - 28 : 2nd Dec'2024 [20 mins]---10 min

write a method to print all the characters having ascii value from 65 to 100.

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

package prashant;

public class Assignment28 {
	
	char printCharOfAscii(int Ascii) {
		char ch = (char) Ascii;
		return ch;
	}

	int printAsciiOfChar(char ch) {
		int num = ch;
		return num;
	}

	public static void main(String[] args) {

		Assignment28 assignment28 = new Assignment28();

		for (char ch1 = 'A'; ch1 <= 'Z'; ch1++) {
			int ans = assignment28.printAsciiOfChar(ch1);
			System.out.println(ch1 + "-->" + ans);
		}
		for (int index = 65; index <= 90; index++) {
			char ch2 = assignment28.printCharOfAscii(index);
			System.out.println(index + "-->" + ch2);
		}

	}


}
