package rushikesh.CharMethodAssignments;

public class Assignment_22 {

	int getDigitFromString(String str) {

		int digitCount = 0;
		for (int i = 0; i < str.length(); i++) {
			System.out.print(str.charAt(i));
			if (Character.isDigit(str.charAt(i))) {
				digitCount++;
			}
		}
		System.out.println();
		return digitCount++;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment_22 assignment_22 = new Assignment_22();
		int digit = assignment_22.getDigitFromString("Techno123Credit");
		System.out.println("Count of Digit in Given String is " + digit);
	}

}
