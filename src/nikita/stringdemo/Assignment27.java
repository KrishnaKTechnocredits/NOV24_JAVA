/* Assignment - 27 : 2nd Dec'2024 [10 mins]

Write a method which returns character of given ascii value.

input : 65
output : A

input : 90
output : Z

input : 55
output : 8*/

package nikita.stringdemo;

public class Assignment27 {
	
	void asciiToChar(int ascii) {
		char ch = (char) ascii;
		System.out.println(ch + " is represent by given ascii value " + ascii);
		}

	public static void main(String[] args) {
		Assignment27 a27 = new Assignment27();
		a27.asciiToChar(95);
		a27.asciiToChar(78);
		a27.asciiToChar(88);
		a27.asciiToChar(105);
		a27.asciiToChar(37);
		a27.asciiToChar(110);
	}
}
