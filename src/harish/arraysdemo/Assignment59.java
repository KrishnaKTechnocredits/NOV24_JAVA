package harish.arraysdemo;

import java.util.Arrays;

/**
 * Assignment - 59 : 21th Dec'2024
 * 
 * Print all the second maximum length string from given array.
 * 
 * input : {"Tech", "Tech", "Technocredits", "aashvi","GlobantPune","Ashvik",
 * "PuneGlobant","Pune", "PuGlobantne"}
 * 
 * output : GlobantPune PuneGlobant PuGlobantne
 * 
 */

public class Assignment59 {

	void getSecondMaxLengthStringFromArray(String[] input) {
		// Handle edge cases for input size
		if (input == null || input.length == 0) {
			System.out.println("Error: Input array is empty or null");
			return;
		}
		if (input.length < 2) {
			System.out.println("Error: No second max string as input array size is less than 2");
			return;
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

		printAllSecondMaxLengthStringFromArray(input, secondMaxLengthString);
	}

	void printAllSecondMaxLengthStringFromArray(String[] input, String secondMaxLengthString) {
		System.out.println("All second max length strings in given array - ");
		for (String str : input) {
			if (str.length() == secondMaxLengthString.length()) {
				System.out.print(str + " ");
			}
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Assignment59 assignment59 = new Assignment59();
		String[] input = { "Tech", "Tech", "Technocredits", "aashvi", "GlobantPune", "Ashvik", "PuneGlobant", "Pune",
				"PuGlobantne" };
		System.out.println("Given input array - " + Arrays.toString(input));

		assignment59.getSecondMaxLengthStringFromArray(input);

		String[] input2 = {};
		System.out.println();
		System.out.println("Given input array - " + Arrays.toString(input2));

		assignment59.getSecondMaxLengthStringFromArray(input2);
	}
}