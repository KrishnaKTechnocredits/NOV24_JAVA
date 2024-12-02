package siddharth;

public class Assignment25 {

	void sumOfDigits(String str) {
		System.out.println("Input : "+str);
		int sum = 0;
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isDigit(ch)) {
				int digit = Character.getNumericValue(ch);
				sum = sum + digit;
			}
		}
		System.out.println("Output : "+sum);
	}

	public static void main(String[] args) {
		Assignment25 assignment25 = new Assignment25();
		assignment25.sumOfDigits("te1ch2no3cre7dits");
		assignment25.sumOfDigits("techno");
		assignment25.sumOfDigits("4563");
	}
}
