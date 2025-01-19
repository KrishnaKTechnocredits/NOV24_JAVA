package pooja.stringassignments;

/*Assignment - 31 : 2nd Dec'2024 [15 mins]

return the difference of Sum of all the odd digits and even digits present in a given String. 
HINT : sum of odd digits - sum of even digits

input : "te1ch2no3cre7dits"
output : 9

input : "4563"
output : -2*/
public class Assignment_31 {

	int getDiffOfEvenOddDigitSum(String str) {
		int evenSum = 0, oddSum = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isDigit(ch)) {
				int num = Character.getNumericValue(ch);
				if (num % 2 == 0) {
					evenSum += num;
				} else {
					oddSum += num;
				}
			}
		}
		return oddSum - evenSum;
	}

	public static void main(String[] args) {

		Assignment_31 assignment_31 = new Assignment_31();
		String input = "te1ch2no3cre7dits";
		System.out.println("Given String : " + input);
		System.out.println("Difference : " + assignment_31.getDiffOfEvenOddDigitSum(input));
		System.out.println("---------------------------------");
		input = "4563";
		System.out.println("Given String : " + input);
		System.out.println("Difference : " + assignment_31.getDiffOfEvenOddDigitSum(input));
	}
}