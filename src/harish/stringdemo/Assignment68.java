package harish.stringdemo;

/**
 * Assignment - 68 : 23rd Dec (IMP)
 * 
 * Rearrange the given String, uppercase followed by sum of all the digits
 * followed by lowercase.
 * 
 * Input : Te1ch6NOCre4dits
 * 
 * Output : TNOC11echredits
 */

public class Assignment68 {

	private String getRearrangedString(String input) {
		String upperCaseLetters = "";
		String lowerCaseLetters = "";
		int sumOfDigits = 0;

		for (int i = 0; i < input.length(); i++) {
			if (Character.isUpperCase(input.charAt(i))) {
				upperCaseLetters += input.charAt(i);
			} else if (Character.isLowerCase(input.charAt(i))) {
				lowerCaseLetters += input.charAt(i);
			} else if (Character.isDigit(input.charAt(i))) {
				sumOfDigits += Character.getNumericValue(input.charAt(i));
			}
		}

		return upperCaseLetters + String.valueOf(sumOfDigits) + lowerCaseLetters;
	}

	public static void main(String[] args) {
		Assignment68 assignment68 = new Assignment68();
		String input = "Te1ch6NOCre4dits";
		System.out.println("Input : " + input);
		System.out.println("Output : " + assignment68.getRearrangedString(input));
	}
}