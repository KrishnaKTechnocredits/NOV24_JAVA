package rushikesh.CharMethodAssignments;

public class Assignment_31 {

	int getDigitMethod(String str) {

		System.out.println("Given string is " + str);
		int sumOdd = 0;
		int sumEven = 0;
		for (int index = 0; index < str.length(); index++) {
			if (Character.isDigit(str.charAt(index))) {
				if (str.charAt(index) % 2 == 1) {
					int digit = Character.getNumericValue(str.charAt(index));
					sumOdd = sumOdd + digit;
				} else if (str.charAt(index) % 2 == 0) {
					int digit = Character.getNumericValue(str.charAt(index));
					sumEven = sumEven + digit;
				}
			}
		}
		return sumOdd - sumEven;
	}

	public static void main(String[] args) {
		Assignment_31 assignment_31 = new Assignment_31();
		int digit = assignment_31.getDigitMethod("te1ch2no3cre7dits");
		System.out.println("Sum of odd - Sum of even = " + digit);
		System.out.println();
		int digit1 = assignment_31.getDigitMethod("4563");
		System.out.println("Sum of odd - Sum of even = " + digit1);
	}
}
