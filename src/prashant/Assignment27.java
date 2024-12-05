/*Assignment - 27 : 2nd Dec'2024 [10 mins]-----10 min

Write a method which returns character of given ascii value.

input : 65
output : A

input : 90
output : Z

input : 55
output : 8 */

package prashant;

public class Assignment27 {
	
	char charofAscii(int num) {
		char ch = (char) num;

		return ch;
	}

	public static void main(String[] args) {

		Assignment27 assignment27 = new Assignment27();

		int num = 65;
		char ch = assignment27.charofAscii(num);
		System.out.println(ch + " is represented by Ascii value " + num);

		num = 90;
		ch = assignment27.charofAscii(num);
		System.out.println(ch + " is represented by Ascii value " + num);

		num = 55;
		ch = assignment27.charofAscii(num);
		System.out.println(ch + " is represented by Ascii value " + num);

	}

}
