/*Assignment - 68 : 23rd Dec (IMP) [15 mins]
Rearrange the given String, uppercase followed by sum of all the digits followed by lowercase.

input : Te1ch6NOCre4dits
output : TNOC11echredits*/

package pankaj;

public class Assignment68 {

	String processStringOne(String word) {
		String str = "";
		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			// boolean flag=false;
			if (Character.isUpperCase(ch)) {
				str = str + word.charAt(i);
			}
		}

		return str;
	}

	String processLowerCase(String word) {
		String str = "";
		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			if (Character.isLowerCase(ch)) {
				str = str + word.charAt(i);
			}
		}
		return str;

	}

	int processDigit(String word) {
		// String str="";
		int digitsum = 0;
		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			if (Character.isDigit(ch)) {
				digitsum = digitsum + Character.getNumericValue(ch);
			}
		}
		return digitsum;
	}

	String processString(String word) {
		String upperCase = processStringOne(word);
		int digit = processDigit(word);
		String lowerCase = processLowerCase(word);
		return upperCase + digit + lowerCase;
	}

	public static void main(String[] args) {

		Assignment68 A = new Assignment68();
		String word = "Te1ch6NOCre4dits";
		String M = A.processString(word);
		System.out.println("The Updated String is==>>" + M);
	}

}
