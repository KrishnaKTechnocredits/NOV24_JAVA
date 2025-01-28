package swapnilArray;

import java.util.Arrays;

public class Assignment62 {

	String getRevWord(String word) {
		String revWord = "";
		for (int i = word.length() - 1; i >= 0; i--) {
			revWord = revWord + word.charAt(i);

		}
		return revWord;
	}

	String[] revArray(String[] input) {
		String[] output = new String[input.length];
		for (int i = 0, j = input.length - 1; i < input.length; i++, j--) {
			output[j] = getRevWord(input[i]);
		}
		return output;
	}

	public static void main(String[] args) {
		String[] input = { "tech", "aashvi", "Credits", "Ansh" };
		Assignment62 a = new Assignment62();
		String[] abc = a.revArray(input);
		System.out.println(Arrays.toString(abc));
	}
}
