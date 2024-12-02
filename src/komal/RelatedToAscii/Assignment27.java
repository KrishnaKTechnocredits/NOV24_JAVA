/*
Write a method which returns character of given ascii value.

input : 65
output : A

input : 90
output : Z

input : 55
output : 8 
-----------------------------
Assignment - 28 : 2nd Dec'2024 [20 mins]

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
Z -> 90
----------------------------
Assignment - 29 : 2nd Dec'2024 [20 mins]
write a method to print asscii of Uppercase (A-Z), lowercase(a-z) and all digits (0-9).*/

package komal.RelatedToAscii;

public class Assignment27 {

	void getAsciiValueForNumbers(int start, int end) {

		for (int i = start; i <= end; i++) {
			char ch = (char) i;
			System.out.println("Number of " + i + " ascii  value " + ch);
		}

	}

	void getAsciiValueForCharacter(char start, char end) {
		for (char i = start; i <= end; i++) {
			int ch = i;
			System.out.println("character of " + i + " ascii  value " + ch);
		}
	}

	void getCharacterOfAsciiValue(int input) {
		char ch = (char) input;
		System.out.println("Ascii value of ch : " + ch);
	}

	public static void main(String args[]) {
		Assignment27 assignment27 = new Assignment27();
		assignment27.getCharacterOfAsciiValue(90);
		assignment27.getAsciiValueForCharacter('A', 'Z');
		assignment27.getAsciiValueForCharacter('a', 'z');
		assignment27.getAsciiValueForNumbers(60, 100);
		assignment27.getAsciiValueForNumbers(0, 9);
	}
}
