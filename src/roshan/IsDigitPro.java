package roshan;

public class IsDigitPro {

	String input = "aa1kan33ks4h5a";

	int getDigit() {
		int count = 0;
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isDigit(ch)) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		IsDigitPro isdigit = new IsDigitPro();
		int ans = isdigit.getDigit();
		System.out.println("total " + ans + " digits are there in given input");

	}
}

/*
 * write a method to return total number of digits from the given input. print
 * the count in main method.
 * 
 * input : aa1kan33ks4h5a output : total 5 digits are there in given input.
 * 
 * Hint : boolean Character.isDigit(ch)
 */
