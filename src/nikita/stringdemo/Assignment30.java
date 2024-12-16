/* Assignment - 30 : 2nd Dec'2024 [15 mins]

Sum of all the even digits present in a given String. 

input : "te1ch2no3cre7dits"
output : 2

input : "techno"
output : 0

input : "4563"
output : 10*/

package nikita.stringdemo;

public class Assignment30 {
	
	private int sumOfEvenDigits(String str) {
		int sum = 0;
		for(int i = 0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(Character.isDigit(ch) && Character.getNumericValue(ch) % 2 == 0) {
				sum = sum + Character.getNumericValue(ch);			
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		Assignment30 a30 = new Assignment30();
		String input = "te1ch2no3cre7dits";
		int sumOfEvenDigits = a30.sumOfEvenDigits(input);
		System.out.println("The sum of even digits in given string " + input + " is = " + sumOfEvenDigits);
		
		input = "techno";
		sumOfEvenDigits = a30.sumOfEvenDigits(input);
		System.out.println("The sum of even digits in given string " + input + " is = " + sumOfEvenDigits);
		
		input = "4563";
		sumOfEvenDigits = a30.sumOfEvenDigits(input);
		System.out.println("The sum of even digits in given string " + input + " is = " + sumOfEvenDigits);	
	}
}
