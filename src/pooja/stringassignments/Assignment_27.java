package pooja.stringassignments;
/*Assignment - 27 : 2nd Dec'2024 [10 mins]

Write a method which returns character of given ascii value.

input : 65
output : A

input : 90
output : Z

input : 55
output : 8 */

public class Assignment_27 {

	char getCharacterFromAscii(int ch) {
		char val = (char) ch;
		return val;
	}

	public static void main(String[] args) {
		Assignment_27 assignment_27 = new Assignment_27();
		int ch = 65;
		char ans = assignment_27.getCharacterFromAscii(ch);
		System.out.println("The character of " + ch + " is : " + ans);

		ch = 90;
		ans = assignment_27.getCharacterFromAscii(ch);
		System.out.println("The character of " + ch + " is : " + ans);

		ch = 56;
		ans = assignment_27.getCharacterFromAscii(ch);
		System.out.println("The character of " + ch + " is : " + ans);
	}
}