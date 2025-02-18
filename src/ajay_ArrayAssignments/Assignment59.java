package ajay_ArrayAssignments;

import java.util.Arrays;

public class Assignment59 {

	String getMaxLengthString(String[] input) {
		String maxLengthString = "";
		for (int i = 0; i < input.length; i++) {
			if (input[i].length() > maxLengthString.length()) {
				maxLengthString = input[i];
			}
		}
		return maxLengthString;
	}

	String[] getAllSecondMaxLengthStrings(String[] input) {
		String maxLengthString = getMaxLengthString(input);
		int secondMaxLength = 0;

		for (int i = 0; i < input.length; i++) {
			if (input[i].length() < maxLengthString.length() && input[i].length() > secondMaxLength) {
				secondMaxLength = input[i].length();
			}
		}
		int count = 0;
		for (int i = 0; i < input.length; i++) {
			if (input[i].length() == secondMaxLength) {
				count++;
			}
		}
		String[] secondMaxLengthStrings = new String[count];
		int index = 0;
		for (int i = 0; i < input.length; i++) {
			if (input[i].length() == secondMaxLength) {
				secondMaxLengthStrings[index++] = input[i];
			}
		}
		return secondMaxLengthStrings;
	}

	public static void main(String[] args) {
		Assignment59 assignment59 = new Assignment59();
		String[] input = { "Tech", "Tech", "Technocredits", "aashvi", "GlobantPune", "Ashvik", "PuneGlobant", "Pune",
				"PuGlobantne" };
		String[] result = assignment59.getAllSecondMaxLengthStrings(input);
		System.out.print("All Second Max Length Strings from given Strings are = " + Arrays.toString(result));

	}
}