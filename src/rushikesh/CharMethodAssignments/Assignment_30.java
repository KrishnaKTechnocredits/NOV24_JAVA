package rushikesh.CharMethodAssignments;

public class Assignment_30 {

	void printSumOfEvenDigit(String str) {

		int sum = 0;
		for (int index = 0; index < str.length(); index++) {
			if (Character.isDigit(str.charAt(index))) {
				int digit = Character.getNumericValue(str.charAt(index));
				if (str.charAt(index) % 2 == 0) {
					sum = sum + digit;
				}
			}
		}
		System.out.println("Sum of Even Number in " + str + " string is " + sum);
	}

	public static void main(String[] args) {
		Assignment_30 assignment_30 = new Assignment_30();
		assignment_30.printSumOfEvenDigit("te1ch2no3cre7dits");
		System.out.println();
		assignment_30.printSumOfEvenDigit("techno");
		System.out.println();
		assignment_30.printSumOfEvenDigit("4563");
	}
}
