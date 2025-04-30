package pranita;


public class Assignment_57 {
	String maxLengthStr;

	String getMaximumStringLength(String[] input) {

		int maxLength = input[0].length();
		for (int i = 1; i < input.length; i++) {
			if (maxLength < input[i].length()) {
				maxLength = input[i].length();
				maxLengthStr = input[i];
			}
		}
		System.out.println(maxLengthStr + "=>" + maxLength);
		return maxLengthStr;
	}

	public static void main(String args[]) {
		String[] input = { "Tech", "Tech", "Technocredits", "aashvi", "GlobantPune", "Ashvik", "PuneGlobant", "Pune",
				"PuGlobantne" };
		Assignment_57 a57 = new Assignment_57();
		String output = a57.getMaximumStringLength(input);
		System.out.println("Maximum length string from given array is" + "=>" + output);
	}
}
