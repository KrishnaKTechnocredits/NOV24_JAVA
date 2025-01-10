package ravindra;

public class PrintAllSecMaxStringFromArray59 {
	void PrintAllSecMaxString(String[] input) {
		int maxLength = input[0].length();
		String maxString = input[0];
		int secMaxlength = input[1].length();
		String secMaxString = input[1];
		if (maxLength < secMaxlength) {
			maxLength = input[1].length();
			maxString = input[1];
			secMaxlength = input[0].length();
			secMaxString = input[0];
		}
		for (int i = 0; i < input.length; i++) {
			if (maxLength <= input[i].length()) {
				secMaxlength = maxLength;
				secMaxString = maxString;
				maxLength = input[i].length();
				maxString = input[i];
			} else if (secMaxlength <= input[i].length()) {
				secMaxlength = input[i].length();
				secMaxString = input[i];
			}
		}
		allSecMaxlength(input, secMaxlength);
	}

	void allSecMaxlength(String[] input, int targatelength) {
		for (int i = 0; i < input.length; i++) {
			if (targatelength == input[i].length()) {
				System.out.println(input[i]);
			}
		}
	}

	public static void main(String[] args) {
		String[] input = { "Tech", "Tech", "Technocredits", "aashvi", "GlobantPune", "Ashvik", "PuneGlobant", "Pune","PuGlobantne" };
		PrintAllSecMaxStringFromArray59 assignment59 = new PrintAllSecMaxStringFromArray59();
		assignment59.PrintAllSecMaxString(input);
	}
}
