package ravindra;

public class Assignment_68 {
	public static void main(String[] args) {
		String input = "Te1ch6NOCre4dits";
		String arrangedString = rearrangeString(input);
		System.out.println(arrangedString);
	}

	static String rearrangeString(String input) {
		String uppercase = "";
		String lowercase = "";
		int sumOfDigit = 0;
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (Character.isUpperCase(ch)) {
				uppercase += ch;
			} else if (Character.isLowerCase(ch)) {
				lowercase += ch;
			} else {
				sumOfDigit += Character.getNumericValue(ch);
			}
		}
		return uppercase + sumOfDigit + lowercase;
	}
}
