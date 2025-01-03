package harish.arraysdemo;

import java.util.Arrays;

/**
 * Assignment - 65 : 22nd Dec'2024
 * 
 * Reverse each string in array and place at in reverse order.
 * 
 * Input : {"Te1Ch", "A2as3Hvi", "CrE45di555ts", "ANSH"}
 * 
 * Output : [HSNa,StidErc, IvHsaa, HCet]
 * 
 * Hint : First letter in Uppercase + last Letter in lowercase + all other
 * characters in same case + exclude digits
 */

public class Assignment65 {

	String formatOutput(String input) {
		String output = "";
		for (int i = 0; i <= input.length() - 1; i++) {
			if (!Character.isDigit(input.charAt(i))) {
				output += input.charAt(i);
			}
		}
		return output.substring(0, 1).toUpperCase() + output.substring(1, output.length() - 1)
				+ output.substring(output.length() - 1).toLowerCase();
	}

	String getReverseWord(String input) {
		String output = "";
		for (int i = input.length() - 1; i >= 0; i--) {
			output += input.charAt(i);
		}
		return formatOutput(output);
	}

	String[] getReverseArray(String[] input) {
		String[] output = new String[input.length];
		for (int i = input.length - 1, j = 0; i >= 0; i--, j++) {
			output[j] = getReverseWord(input[i]);
		}
		return output;
	}

	public static void main(String[] args) {
		Assignment65 assignment65 = new Assignment65();
		String[] input = { "Te1Ch", "A2as3Hvi", "CrE45di555ts", "ANSH" };
		System.out.println("Original array - " + Arrays.toString(input));
		System.out.println(
				"Reverse array with expected format - " + Arrays.toString(assignment65.getReverseArray(input)));
	}
}