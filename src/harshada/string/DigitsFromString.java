//Assignment - 22 : 25th Nov'2024 [20 mins]
//
//write a method to return total number of digits from the given input.
//print the count in main method.
//
//input : aa1kan33ks4h5a
//output : total 5 digits are there in given input.
//
//Hint : boolean Character.isDigit(ch)

package harshada.string;

public class DigitsFromString {
	int digitCnt;

//	method to find if char is digit
	int findDigitsfromString(String input) {
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (Character.isDigit(ch)) {
				digitCnt++;
			}
		}
		return digitCnt;
	}

	public static void main(String[] args) {
		DigitsFromString digitsFromString = new DigitsFromString();
		int count = digitsFromString.findDigitsfromString("aa1kan33ks4h5a");
		System.out.println("total " + count + " digits are there in given input.");
	}
}
