/* Assignment - 31 : 2nd Dec'2024 [15 mins]

return the difference of Sum of all the odd digits and even digits present in a given String. 
HINT : sum of odd digits - sum of even digits

input : "te1ch2no3cre7dits"
output : 9

input : "4563"
output : -2 */


package nikita.stringdemo;

public class Assignment31 {

	private int getOddEvenSumDifference(String str) {
		int sumOfEvenDigits = 0;
		int sumOfOddDigits = 0;
		for(int i = 0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(Character.isDigit(ch)) {
				if(Character.getNumericValue(ch) % 2 == 0) {
				sumOfEvenDigits = sumOfEvenDigits + Character.getNumericValue(ch);			
			}
			else {
				sumOfOddDigits = sumOfOddDigits + Character.getNumericValue(ch);
			}
		}
	}
		
	System.out.println("Sum of Even Numbers from given string " + str + " is: " + sumOfEvenDigits);
	System.out.println("Sum of Odd Numbers from given string: " + str + " is: " + sumOfOddDigits);
	return sumOfOddDigits - sumOfEvenDigits;
	}
	
	public static void main(String[] args) {
		Assignment31 a31 = new Assignment31();
		String input = "te1ch2no3cre7dits";
		int oddEvenDifference = a31.getOddEvenSumDifference(input);
		System.out.println("The difference between sum of odd even digits from given string " + input + " is = " + oddEvenDifference + "\n");
		
		input = "4563";
		oddEvenDifference = a31.getOddEvenSumDifference(input);
		System.out.println("The difference between sum of odd even digits in given string " + input + " is = " + oddEvenDifference);	
	}
}
