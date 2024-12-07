/*
 * Assignment - 26 : 2nd Dec'2024 [10 mins]

Write a method which returns ascii value of given character. 

input : 'A'
output : 65

input : 'x'
output : 120

input : ' '
output : 32

input : '.'
output : 46
 */
package amruta.AsciiCodes;

public class Assign_26_ReturnAsciiValueOfChar {

	static int returnAsciiValue(char ch) {
		int value = ch;
		return value;
	}

	static void printAsciiValue(char ch) {
		int asciiValue = returnAsciiValue(ch);
		System.out.println("Input char is - " + ch + " And it's ASCII value is - " + asciiValue);
	}

	public static void main(String[] args) {
		printAsciiValue('A');
		printAsciiValue('x');
		printAsciiValue(' ');
		printAsciiValue('.');
	}
}
