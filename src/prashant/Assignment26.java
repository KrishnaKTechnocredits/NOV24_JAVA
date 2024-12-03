/*Assignment - 26 : 2nd Dec'2024 [10 mins]-------9 min

Write a method which returns ascii value of given character. 

input : 'A'
output : 65

input : 'x'
output : 120

input : ' '
output : 32

input : '.'
output : 46*/

package prashant;

public class Assignment26 {
	
	int asciiOfChar(char ch) {
		int num = ch;
		return num;
	}

	public static void main(String[] args) {

		Assignment26 assignment26 = new Assignment26();
		char ch = 'A';
		int asciivalue = assignment26.asciiOfChar(ch);
		System.out.println("The asciivalue value of " + ch + " is " + asciivalue);

		ch = 'x';
		asciivalue = assignment26.asciiOfChar(ch);
		System.out.println("The asciivalue value of " + ch + " is " + asciivalue);

		ch = ' ';
		asciivalue = assignment26.asciiOfChar(ch);
		System.out.println("The asciivalue value of " + ch + " is " + asciivalue);

		ch = '.';
		asciivalue = assignment26.asciiOfChar(ch);
		System.out.println("The asciivalue value of " + ch + " is " + asciivalue);

	}


}
