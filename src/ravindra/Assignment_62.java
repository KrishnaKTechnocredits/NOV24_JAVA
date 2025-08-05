package ravindra;

import java.util.Arrays;

public class Assignment_62 {
	public static void main(String[] args) {
		String[] input = { "tech", "aashvi", "Credits", "Ansh" };
		Assignment_62 assignment=new Assignment_62();
		String[] revArray = assignment.reverseArray(input);
		System.out.println(Arrays.toString(revArray));
	}

	static String revrseString(String input) {
		String rev = "";
		for (int i = input.length() - 1; i >= 0; i--) {
			rev += input.charAt(i);
		}
		return rev;
	}

	String[] reverseArray(String[] input) {
		String[] output = new String[input.length];
		for (int i = 0, j = input.length - 1; i <input.length; i++, j--) {
			String str = input[i];
			String revString = revrseString(str);
			output[j] = revString;
		}
		return output;
	}
}
