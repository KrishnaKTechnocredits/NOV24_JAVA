package vrushali.asscii;

//Assignment - 31 : 2nd Dec'2024 [15 mins]
//
//return the difference of Sum of all the odd digits and even digits present in a given String. 
//HINT : sum of odd digits - sum of even digits
//
//input : "te1ch2no3cre7dits"
//output : 9
//
//input : "4563"
//output : -2

public class DiffBetEvenAndOddNumInString {

	void printDiffBetEvenAndOddNumDigitsInString(String str) {
		char ch;
		int evenSum = 0, oddSum = 0, diff = 0;
		for (int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
			if (Character.isDigit(ch)) {
				int num = Character.getNumericValue(ch);

				if (num % 2 == 0) {
					evenSum = evenSum + num;
				} else {
					oddSum = oddSum + num;
				}
			}
		}

		if (evenSum > oddSum) {
			diff = evenSum - oddSum;
		} else {
			diff = oddSum - evenSum;
		}
		System.out.println("Difference of Even And Odd  Digits In String " + str + " is : " + diff);
	}

	public static void main(String[] args) {
		DiffBetEvenAndOddNumInString diffBetEvenAndOddNumInString = new DiffBetEvenAndOddNumInString();
		diffBetEvenAndOddNumInString.printDiffBetEvenAndOddNumDigitsInString("te1ch2no3cre7dits");
		diffBetEvenAndOddNumInString.printDiffBetEvenAndOddNumDigitsInString("4563");

	}

}
