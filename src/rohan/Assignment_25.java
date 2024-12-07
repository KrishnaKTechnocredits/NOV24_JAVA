package rohan;

public class Assignment_25 {

	public static void main(String[] args) {
		Assignment_25 assignment = new Assignment_25();
		assignment.FindSumDidit("te1ch2no3cre7dits");
		assignment.FindSumDidit("techno");
		assignment.FindSumDidit("4563");
	}

	int FindSumDidit(String input) {
		int digit = 0;
		for (int i = 0; i < input.length(); i++) {
			boolean flag = Character.isDigit(input.charAt(i));
			if (flag == true) {
				int num = Character.getNumericValue(input.charAt(i));
				digit += num;
			}
		}
		System.out.println("Input: " + input + "\n" + "Output: " + digit + "\n");
		return digit;
	}

}
