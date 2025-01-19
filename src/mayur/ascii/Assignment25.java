/*
 * Assignment - 25 : 2nd Dec'2024 [20 mins]

Sum of all the digits present in a given String. 

input : "te1ch2no3cre7dits"
output : 13

input : "techno"
output : 0

input : "4563"
output : 18

 */


package mayur.ascii;

public class Assignment25 {
	
	int getSumOfDigitsInString(String str) {
		int sum = 0;
		for (int i = 0; i < str.length();i++) {
			if (Character.isDigit(str.charAt(i))) {
				sum = sum + Character.getNumericValue(str.charAt(i));
			}
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Assignment25 obj = new Assignment25();
		System.out.println("Sum of digits in given string is = "+obj.getSumOfDigitsInString("te1ch2no3cre7dits"));
		System.out.println("Sum of digits in given string is = "+obj.getSumOfDigitsInString("techno"));
		System.out.println("Sum of digits in given string is = "+obj.getSumOfDigitsInString("4563"));		
	}

}
