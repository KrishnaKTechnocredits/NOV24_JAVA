package ravindra;

import java.util.Arrays;

public class Assignment_61 {
	public static void main(String[] args) {
		String[] input = { "tech", "aashvi", "credits" };
		Assignment_61 reversearray = new Assignment_61();
		String[] rev = reversearray.reverseString(input);
		System.out.println(Arrays.toString(rev));
	}

	String[] reverseString(String[] input) {
		for (int i = 0; i < input.length; i++) {
			String str = input[i];
			String reversString = "";
			for (int index = str.length() - 1; index >= 0; index--) {
				reversString += str.charAt(index);
			}
			input[i] = reversString;
		}
		return input;
	}
}
