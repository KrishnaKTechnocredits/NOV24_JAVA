package ravindra;

public class SecondMaxStrignFromArray58 {
	String maxString(String[] input) {
		int maxStringlength = input[0].length();
		String maxString = input[0];
		int secMaxLength = input[1].length();
		String SecmaxString = input[1];
		if (maxStringlength < secMaxLength) {
			maxStringlength = input[1].length();
			maxString = input[1];
			secMaxLength = input[0].length();
			SecmaxString = input[0];
		}
		for (int i = 0; i < input.length; i++) {
			if (maxStringlength <= input[i].length()) {
				secMaxLength = maxStringlength;
				SecmaxString = maxString;
				maxStringlength = input[i].length();
				maxString = input[i];
			} else if (secMaxLength <= input[i].length()) {
				secMaxLength = input[i].length();
				SecmaxString = input[i];
			}
		}
		return SecmaxString;
	}

	public static void main(String[] args) {
		String[] input = { "Tech", "Tech", "Technocredits", "aashvi", "GlobantPune", "Ashvik", "PuneGlobant", "Pune",
				"PuGlobantne" };
		SecondMaxStrignFromArray58 Assignment58 = new SecondMaxStrignFromArray58();
		String str = Assignment58.maxString(input);
		System.out.println(str);
	}
}
