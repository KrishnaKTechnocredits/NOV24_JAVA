package vrushali.assciiProgram;

//Assignment - 25 : 2nd Dec'2024 [20 mins]
//
//Sum of all the digits present in a given String. 
//
//input : "te1ch2no3cre7dits"
//output : 13
//
//input : "techno"
//output : 0
//
//input : "4563"
//output : 18

public class SumOfDigitsInString {

	void PrintSumDigitsInString(String str) {
		char ch;
		int sum = 0;
		for (int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
			if (Character.isDigit(ch)) {
				sum = sum + Character.getNumericValue(ch);
			}
		}
		System.out.println("Sum of all digits in string " + str + " is : " + sum);
	}

	public static void main(String[] args) {
		SumOfDigitsInString sumOfDigitsInString = new SumOfDigitsInString();
		sumOfDigitsInString.PrintSumDigitsInString("te1ch2no3cre7dits");
		sumOfDigitsInString.PrintSumDigitsInString("techno");
		sumOfDigitsInString.PrintSumDigitsInString("4563");

	}
}
