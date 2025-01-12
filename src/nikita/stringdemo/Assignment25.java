
/* Assignment - 25 : 2nd Dec'2024 [20 mins]

Sum of all the digits present in a given String. 

input : "te1ch2no3cre7dits"
output : 13

input : "techno"
output : 0

input : "4563"
output : 18
*/

package nikita.stringdemo;

public class Assignment25 {
	
	int getSumOfDigits(String str) {
		int sum = 0;
		for(int i = 0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(Character.isDigit(ch)) {
				sum = sum + Character.getNumericValue(ch);
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		Assignment25 a25 = new Assignment25();

		String input = "te1ch2no3cre7dits";
		int sumOfDigits = a25.getSumOfDigits(input);
		System.out.println("Sum of all the digits present in a given String " + input + " is: " + sumOfDigits);
	}
}
