package pooja.stringassignments;
/*Assignment - 26 : 2nd Dec'2024 [10 mins]

Write a method which returns ascii value of given character. 

input : 'A'
output : 65

input : 'x'
output : 120

input : ' '
output : 32

input : '.'
output : 46*/

public class Assignment_26 {

	int getAsciiOfCharacter(char ch) {
		int value = ch;
		return value;
	}

	public static void main(String[] args) {
		Assignment_26 assignment_26 = new Assignment_26();
		char ch = 'A';
		int ans = assignment_26.getAsciiOfCharacter(ch);
		System.out.println("Ascii Value of " + ch + " is : " + ans);

		ch = 'x';
		ans = assignment_26.getAsciiOfCharacter(ch);
		System.out.println("Ascii Value of " + ch + " is : " + ans);

		ch = ' ';
		ans = assignment_26.getAsciiOfCharacter(ch);
		System.out.println("Ascii Value of " + ch + " is : " + ans);

		ch = '.';
		ans = assignment_26.getAsciiOfCharacter(ch);
		System.out.println("Ascii Value of " + ch + " is : " + ans);
	}
}
