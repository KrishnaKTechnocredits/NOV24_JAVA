package prem;

public class Assignment67 {
	static String upperCase = "";
	static String lowerCase = "";
	static String digit = "";

	void rearrangeString(String input) {
		String output = "";

		for (int i = input.length() - 1; i >= 0; i--) {
			char ch = input.charAt(i);
			if (Character.isUpperCase(ch)) {
				upperCase = upperCase + input.charAt(i);
			}
			if (Character.isDigit(ch)) {
				digit = digit + input.charAt(i);
			}
			if (Character.isLowerCase(ch)) {
				lowerCase = lowerCase + input.charAt(i);
			}
		}
		output = upperCase + digit + lowerCase;
		System.out.println(output);
	}

	public static void main(String[] args) {
		Assignment67 assign67 = new Assignment67();
		String input = "Te1ch6NOCre3dits";
		assign67.rearrangeString(input);
	}
}
