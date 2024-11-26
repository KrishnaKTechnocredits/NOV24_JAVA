/*
 * Assignment - 23 : 26th Nov'2024 [30 mins]

Print count of uppercase, lowercase, digit, space and special characters in given input string. [20 mins]

Input : "Te4c_hno Credi3ts"
Output : uppercase -> 2
lowercase -> 11
digit -> 2
space -> 1
special char -> 1

Hint : use Character class static methods.
 */

package mayur;

public class Assignment23 {

	void displayStringCharTypes(String str) {
		int uCaseCount = 0;
		int lCaseCount = 0;
		int dCount = 0;
		int spCount = 0;
		int spCharCount = 0;
		for (int i = 0; i < str.length(); i++) {
			if (Character.isLetter(str.charAt(i))){
				if (Character.isUpperCase(str.charAt(i))) {
					uCaseCount++;
				}else {
					lCaseCount++;	
				}
			}else if (Character.isDigit(str.charAt(i))){
				dCount++;
			}else if (str.charAt(i)==' ') {
				spCount++;
			}else {
				spCharCount++;
			}			
		}
		System.out.println("Upper case character count is "+uCaseCount);
		System.out.println("Lower case character count is "+lCaseCount);
		System.out.println("Digit count is "+dCount);
		System.out.println("spaces count is "+spCount);
		System.out.println("Special characters count is "+spCharCount);
	}
	
	public static void main(String[] args) {
		Assignment23 assign23 = new Assignment23();
		assign23.displayStringCharTypes("Te4c_hno Credi3ts");
	}
}

