/*
 * Assignment - 67 : 23rd Dec (IMP) [15 mins]
Rearrange the given String, uppercase followed by digits followed by lowercase.

input : Te1ch6NOCre3dits
output : TNOC163echredits
 */

package amruta.String;

public class Assign_67_RearrangeTheString {

	void printStringInGivenOrder(String str) {
		String input = "";
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isUpperCase(ch))
				input += ch;
		}

		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isDigit(ch))
				input += ch;
		}

		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isLowerCase(ch))
				input += ch;
		}
		System.out.println("After rearranging string as per requirement : " + input);
	}

	public static void main(String[] args) {
		String str = "Te1ch6NOCre3dits";
		System.out.println("Original : " + str);
		new Assign_67_RearrangeTheString().printStringInGivenOrder(str);
	}
}
