package harish.arraysdemo;

import java.util.Arrays;

/**
 * Assignment - 57 : 21th Dec'2024
 * 
 * Return the maximum length string from given array.
 * 
 * input : {"Tech", "Tech", "Technocredits", "aashvi","GlobantPune","Ashvik",
 * "PuneGlobant","Pune", "PuGlobantne"}
 * 
 * output : Technocredits
 */

public class Assignment57 {

	String getMaxLengthString(String[] input) {
		// Handle edge cases for input size
		if (input == null || input.length == 0) {
			return "Error: Input array is empty or null";
		}

		String output = input[0];
		for (int i = 1; i < input.length - 1; i++) {
			if (input[i] == null || input[i].isEmpty()) {
				continue; // Skip null or empty strings
			}
			if (input[i].length() > output.length()) {
				output = input[i];
			}
		}

		return output;
	}

	public static void main(String[] args) {
		Assignment57 assignment57 = new Assignment57();
		String[] input = { "Tech", "Tech", "Technocredits", "aashvi", "GlobantPune", "Ashvik", "PuneGlobant", "Pune",
				"PuGlobantne" };
		System.out.println("Given array - " + Arrays.toString(input));

		String result = assignment57.getMaxLengthString(input);
		if (result.startsWith("Error: ")) {
			System.out.println("\n" + result);
		} else {
			System.out.println("\nMax length string in given array is - " + result);
		}
	}
}