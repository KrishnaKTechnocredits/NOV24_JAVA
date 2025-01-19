package harish.arraysdemo;

import java.util.Arrays;

/**
 * Assignment - 58 : 21th Dec'2024
 * 
 * Return the second maximum length string from given array.
 * 
 * Hint - If you find multiple string as second maximum, return the last second
 * maximum.
 * 
 * input : {"Tech", "Tech", "Technocredits", "aashvi","GlobantPune","Ashvik",
 * "PuneGlobant","Pune", "PuGlobantne"}
 * 
 * output : PuGlobantne
 */

public class Assignment58 {

	String getSecondMaxLengthStringFromArray(String[] input) {
		// Handle edge cases for input size
		if (input == null || input.length == 0) {
			return "Error: Input array is empty or null";
		}
		if (input.length < 2) {
			return "Error: No second max string as input array size is less than 2";
		}
		String maxLengthString = input[0];
		String secondMaxLengthString = input[1];

		if (input[1].length() > input[0].length()) {
			maxLengthString = input[1];
			secondMaxLengthString = input[0];
		}

		for (int i = 2; i <= input.length - 1; i++) {

			if (input[i] == null || input[i].isEmpty()) {
				continue; // Skip null or empty strings
			}

			if (input[i].length() > maxLengthString.length()) {
				secondMaxLengthString = maxLengthString;
				maxLengthString = input[i];
			} else if (input[i].length() >= secondMaxLengthString.length()) {
				secondMaxLengthString = input[i];
			}
		}

		return secondMaxLengthString;
	}

	public static void main(String[] args) {
		Assignment58 assignment58 = new Assignment58();
		String[] input = { "Tech", "Tech", "Technocredits", "aashvi", "GlobantPune", "Ashvik", "PuneGlobant", "Pune",
				"PuGlobantne" };

		System.out.println("Given input array is -\n" + Arrays.toString(input));

		String result = assignment58.getSecondMaxLengthStringFromArray(input);
		if (result.startsWith("Error: ")) {
			System.out.println("\n" + result);
		} else {
			System.out.println("\nSecond max length string in given array is - " + result);
		}
	}
}