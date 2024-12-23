package swapnil;

public class Assignment57 {

	static int maxlength = 0, secondMax = 0;

	void maxLenArray(String[] input) {
		String maxStr = input[0];
		if (input[0].length() > input[1].length()) {
			maxlength = input[0].length();
			secondMax = input[1].length();
		}
		for (int i = 2; i < input.length; i++) {

			if (maxlength < input[i].length()) {
				secondMax = maxlength;
				maxlength = input[i].length();
				maxStr = input[i];
			}

		}

		System.out.println(maxStr+":"+maxlength);
	}

	public static void main(String[] args) {
		String[] input = { "Tech", "Tech", "Technocredits", "aashvi", "GlobantPune", "Ashvik", "PuneGlobant", "Pune",
				"PuGlobantne" };
		Assignment57 a = new Assignment57();
		a.maxLenArray(input);
	}
}
