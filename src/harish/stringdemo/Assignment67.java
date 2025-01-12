package harish.stringdemo;

/**
 * Assignment - 67 : 23rd Dec
 * 
 * Rearrange the given String, uppercase followed by digits followed by
 * lowercase.
 * 
 * Input : Te1ch6NOCre3dits
 * 
 * Output : TNOC163echredits
 */

public class Assignment67 {

	private String getRearrangedString(String input) {
		String upperCaseLetters = "";
		String lowerCaseLetters = "";
		String digits = "";

		for (int i = 0; i < input.length(); i++) {
			if (Character.isUpperCase(input.charAt(i))) {
				upperCaseLetters += input.charAt(i);
			} else if (Character.isLowerCase(input.charAt(i))) {
				lowerCaseLetters += input.charAt(i);
			} else if (Character.isDigit(input.charAt(i))) {
				digits += input.charAt(i);
			}
		}

		return upperCaseLetters + digits + lowerCaseLetters;
	}

	public static void main(String[] args) {
		Assignment67 assignment67 = new Assignment67();
		String input = "Te1ch6NOCre3dits";
		System.out.println("Input : " + input);
		System.out.println("Output : " + assignment67.getRearrangedString(input));
	}
}