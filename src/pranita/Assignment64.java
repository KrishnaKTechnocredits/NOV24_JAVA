package pranita;

import java.util.*;

class Assignment64 {

	String getReverseString(String word) {
		String output = "";
		for (int i = word.length() - 1; i >= 0; i--) {
			char ch = word.charAt(i);
			output = output + ch;
		}
		return output;
	}

	String getFirstLetterCapital(String word) {
		return word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();
	}

	void getReverseStringInRevArrayFirstLetterCapital(String[] input) {
		String[] output = new String[input.length];
		for (int i = 0, j = input.length - 1; i < input.length; i++, j--) {
			String str = getReverseString(input[i]);
			str = getFirstLetterCapital(str);
			output[j] = str;
		}
		System.out.println("Reverse string and first letter capital is in reverse array: " + Arrays.toString(output));
	}

	public static void main(String[] args) {
		Assignment64 A64 = new Assignment64();
		String[] input = { "Tech", "Aashvi", "Credits", "Ansh" };
		System.out.println("Given string array is: " + Arrays.toString(input));
		A64.getReverseStringInRevArrayFirstLetterCapital(input);
	}
}