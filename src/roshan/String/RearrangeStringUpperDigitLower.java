package roshan.String;

public class RearrangeStringUpperDigitLower {
	static String rearranageString(String input) {
		String uCase = "", lCase = "", digit = "";

		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (Character.isUpperCase(ch)) {
				uCase += ch;
			} else if (Character.isDigit(ch)) {
				digit += ch;
			} else if (Character.isLowerCase(ch)) {
				lCase += ch;
			}

		}
		return uCase + digit + lCase;
	}

	public static void main(String[] args) {
		System.out.println(RearrangeStringUpperDigitLower.rearranageString("Te1ch6NOCre3dits"));
	}

}

/*
 * Assignment - 67 : 23rd Dec (IMP) [15 mins] Rearrange the given String,
 * uppercase followed by digits followed by lowercase.
 * 
 * input : Te1ch6NOCre3dits output : TNOC163echredits
 */
