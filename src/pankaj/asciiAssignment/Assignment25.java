/*Sum of all the digits present in a given String. 

input : "te1ch2no3cre7dits"
output : 13
input : "techno"
output : 0
input : "4563"
output : 18*/
package pankaj.asciiAssignment;

public class Assignment25 {

	int sumOf(String str) {
		int sum = 0;
		int evensum = 0;
		int oddsum = 0;

		for (int i = 0; i <= str.length() - 1; i++) {
			char ch = str.charAt(i);
			int digit = Character.getNumericValue(ch);
			if (Character.isDigit(ch)) {
				if (digit % 2 == 0) {
					evensum = evensum + digit;
					System.out.println("The sum of even digits                     ==>>" + evensum);
				} else {
					oddsum = oddsum + digit;

				}

				sum = sum + digit;
			}

		}

		System.out.println("The sum of all digits present in the String==>>" + sum);
		return sum = oddsum - evensum;

	}

	public static void main(String[] args) {

		Assignment25 A = new Assignment25();
		int a = A.sumOf("te1ch2no3cre7dits");
		System.out.println("The Difference between odd and even digit  ==>>" + a);

	}

}
