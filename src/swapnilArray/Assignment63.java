package swapnilArray;

import java.util.Arrays;

public class Assignment63 {

	String revWord(String Word) {
		String revWord = "";
		for (int i = Word.length() - 1; i >= 0; i--) {
			revWord = revWord + Word.charAt(i);
		}

		return revWord;
	}

	String[] revArray(String[] input) {
		String[] output = new String[input.length];
		for (int i = 0, j = input.length - 1; i < input.length; i++, j--) {
			String ABC = revWord(input[i]);
			output[j] = ABC.toLowerCase();
		}
		return output;
	}

	public static void main(String[] args) {
		String[] input = { "TeCh", "Aashvi", "Credits", "AnsH" };
		Assignment63 a = new Assignment63();
		String[] output = a.revArray(input);
		System.out.println(Arrays.toString(output));

	}
}
