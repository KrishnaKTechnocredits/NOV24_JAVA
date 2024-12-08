/* Assignment - 31 : 2nd Dec'2024 [15 mins]

return the difference of Sum of all the odd digits and even digits present in a given String. 
HINT : sum of odd digits - sum of even digits

input : "te1ch2no3cre7dits"
output : 9

input : "4563"
output : -2   */

package amruta.String;

public class Assign_31_DifferenceOfSumOfOddEvenNum_Logic_2 {

	void printDifferenceOfSumOfEvenOddDigits(int evenSum, int oddSum) {
		int difference = 0;
		if (evenSum > oddSum) {
			difference = evenSum - oddSum;
			System.out.println(
					"Difference of sum of even and odd digits available in String is --> " + difference);
		} else {
			difference = oddSum - evenSum;
			System.out.println(
					"Difference of sum of even and odd digits available in String is --> " + difference);
		}
	}
	
	void sumOfEvenAndOddNum(String str) {
		int evenSum = 0;
		int oddSum = 0;
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isDigit(ch)) {
				int num = Character.getNumericValue(ch);
				if (num % 2 != 0) 
					oddSum += num;
				else 
					evenSum += num;
			}
		}
		System.out.println("String is - "+str);
		
		//NS-NS method Calling 
		printDifferenceOfSumOfEvenOddDigits(evenSum,oddSum);
	}

	public static void main(String[] args) {
		Assign_31_DifferenceOfSumOfOddEvenNum_Logic_2 a31 = new Assign_31_DifferenceOfSumOfOddEvenNum_Logic_2();
		a31.sumOfEvenAndOddNum("te1ch2no3cre7dits");
		System.out.println("");
		a31.sumOfEvenAndOddNum("4563");
	}
}

