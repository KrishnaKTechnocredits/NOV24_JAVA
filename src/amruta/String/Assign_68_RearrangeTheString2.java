/*
 * Assignment - 68 : 23rd Dec (IMP) [15 mins]
Rearrange the given String, uppercase followed by sum of all the digits followed by lowercase.

input : Te1ch6NOCre4dits
output : TNOC11echredits
 */

package amruta.String;

public class Assign_68_RearrangeTheString2 {

	void printStringInGivenOrder(String str) {
		String input = "";
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isUpperCase(ch))
				input += ch;
		}

		int sum = 0;
		for (int index = 0; index < str.length(); index++) {
			int num = 0;
			char ch = str.charAt(index);
			if (Character.isDigit(ch)) {
				num = Character.getNumericValue(ch);
				sum += num;
			}
		}
		input += sum;

		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isLowerCase(ch))
				input += ch;
		}
		System.out.println("After rearranging string as per requirement : " + input);
	}

	public static void main(String[] args) {
		String str = "Te1ch6NOCre4dits";
		System.out.println("Original : " + str);
		new Assign_68_RearrangeTheString2().printStringInGivenOrder(str);
	}
}
