package roshan.String;

public class reArrangeStringandAddNum {
	static String rearranageString(String input) {
		String uCase = "", lCase = "";
		int digit = 0;

		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (Character.isUpperCase(ch)) {
				uCase += ch;
			} else if (Character.isDigit(ch)) {
				int num = Character.getNumericValue(ch);
				digit += num;
			} else if (Character.isLowerCase(ch)) {
				lCase += ch;
			}

		}
		return uCase + digit + lCase;
	}

	public static void main(String[] args) {
		System.out.println(reArrangeStringandAddNum.rearranageString("Te1ch6NOCre4dits"));
	}

}

/*
 * Assignment - 68 : 23rd Dec (IMP) [15 mins] Rearrange the given String,
 * uppercase followed by sum of all the digits followed by lowercase.
 * 
 * input : Te1ch6NOCre4dits output : TNOC11echredits
 */
