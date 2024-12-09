package ashwini.stringAssignments;

public class Assignment31 {
		int getEvenDigit(String str) {
		int sum = 0;
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			boolean flag = Character.isDigit(ch);
			if (flag == true) {
				int num = Character.getNumericValue(ch);
				if (num % 2 == 0) {
					sum = sum + num;
				}
			}
		}
		return sum;
	}

	int getOddDigit(String str) {
		int sum1 = 0;
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			boolean flag = Character.isDigit(ch);
			if (flag == true) {
				int num = Character.getNumericValue(ch);
				if (num % 2 == 1) {
					sum1 = sum1 + num;
				}
			}
		}
		return sum1;
	}

	public static void main(String[] args) {
		Assignment31 assn31 = new Assignment31();
		int ans1 = assn31.getEvenDigit("te1ch2no3cre7dits");
		int ans2 = assn31.getOddDigit("te1ch2no3cre7dits");
		int ans = ans2 - ans1;
		System.out.println("Difference between Sum of Even Digit and Odd Digit is " +ans);
		int ans3 = assn31.getEvenDigit("4563");
		int ans4 = assn31.getOddDigit("4563");
		int ans5 = ans4 - ans3;
		System.out.println("Difference between Sum of Even Digit and Odd Digit is " + ans5);
	}

}
