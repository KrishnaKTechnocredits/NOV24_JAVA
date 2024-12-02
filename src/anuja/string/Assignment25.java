package anuja.string;

/*Sum of all the digits present in a given String.

input : "te1ch2no3cre7dits"
output : 13

input : "techno"
output : 0

input : "4563"
output : 18*/
public class Assignment25 {

	public int getSumOfDigitFromString(String str) {
		int stringLen = str.length();
		int sum = 0;
		int evenSum = 0;
		int oddSum = 0;

		for (int i = 0; i < stringLen; i++) {
			// add condition to check , char is digit or not.
			if (Character.isDigit(str.charAt(i))) {
				// new method to convert char to its numeric value.
				int num = Character.getNumericValue(str.charAt(i));
				sum =  sum + num;
			}
		}

		return sum;

	}

	public static void main(String[] args) {
		Assignment25 assignment25 = new Assignment25();
		System.out.println("---- Assignment 25 o/p --- \n");

		String input1 = "te1ch2no3cre7dits";
		int sum1 = assignment25.getSumOfDigitFromString(input1);
		System.out.println("Sum of all digits from given String " + input1 + "-> " + sum1 + " . \n");

		String input2 = "techno";
		int sum2 = assignment25.getSumOfDigitFromString(input2);
		System.out.println("Sum of all digits from given String " + input2 + "-> " + sum2 + " . \n");

		String input3 = "4563";
		int sum3 = assignment25.getSumOfDigitFromString(input3);
		System.out.println("Sum of all digits from given String " + input3 + "-> " + sum3 + " . \n");
	}
}
