package vrushali.asscii;
//Assignment - 30 : 2nd Dec'2024 [15 mins]
//
//Sum of all the even digits present in a given String. 
//
//input : "te1ch2no3cre7dits"
//output : 2
//
//input : "techno"
//output : 0
//
//input : "4563"
//output : 10

public class SumOfEvenDigitsInString {
	void printSumOfEvenDigitsInString(String str) {
		char ch;
		int sum = 0;
		for (int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
			if (Character.isDigit(ch)) {
				int num = Character.getNumericValue(ch);

				if (num % 2 == 0) {
					sum = sum + num;
				}
			}
		}
		System.out.println("Sum of Even Digits In String " + str + " is : " + sum);
	}

	public static void main(String[] args) {
		SumOfEvenDigitsInString sumOfEvenDigitsInString = new SumOfEvenDigitsInString();
		sumOfEvenDigitsInString.printSumOfEvenDigitsInString("te1ch2no3cre7dits");
		sumOfEvenDigitsInString.printSumOfEvenDigitsInString("techno");
		sumOfEvenDigitsInString.printSumOfEvenDigitsInString("4563");
	}

}
