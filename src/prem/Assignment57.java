package prem;

public class Assignment57 {

	String getMaxLength(String[] input) {
		int maxCount = input[0].length();
		String output = input[0];

		for (int i = 1; i <= input.length - 1; i++) {
			if (maxCount < input[i].length()) {
				output = input[i];
				maxCount = input[i].length();
			}
		}
		return output;
	}

	public static void main(String[] args) {
		Assignment57 assign57 = new Assignment57();
		String[] input = { "Tech", "Tech", "Technocredits", "aashvi", "GlobantPune", "Ashvik", "PuneGlobant", "Pune",
				"PuGlobantne" };
		String maxLength = assign57.getMaxLength(input);
		System.out.println(maxLength);
	}
}
