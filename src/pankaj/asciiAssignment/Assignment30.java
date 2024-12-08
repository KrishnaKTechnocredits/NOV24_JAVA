/*Sum of all the even digits present in a given String. 

input : "te1ch2no3cre7dits"
output : 2

input : "techno"
output : 0

input : "4563"
output : 10*/
package pankaj.asciiAssignment;

public class Assignment30 {

	int sumOf(String str) {
		int evensum = 0;

		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);
			int digit = Character.getNumericValue(ch);
			if (Character.isDigit(ch)) {

				if (ch % 2 == 0) {

					evensum = evensum + digit;
				}

			}
		}
		return evensum;

	}

	public static void main(String[] args) {

		Assignment30 A = new Assignment30();
		int a = A.sumOf("te1ch2no3cre7dits");
		System.out.println("The sum even digit  ==>>" + a);

		int b = A.sumOf("techno");
		System.out.println("The sum even digit  ==>>" + b);

		int c = A.sumOf("4563");
		System.out.println("The sum even digit  ==>>" + c);

	}

}
