package rohan;

import java.util.Arrays;

public class Assignment_63 {

	public static void main(String[] args) {
		Assignment_63 rev = new Assignment_63();
		String[] input = { "TeCh", "Aashvi", "Credits", "AnsH" };
		String[] str = rev.ReverOrderString(input);
		System.out.println(Arrays.toString(str));
	}

	String Reverse(String str) {
		String word = " ";
		for (int i = str.length() - 1; i >= 0; i--) {
			word += str.charAt(i);
			word = word.toLowerCase();
		}
		return word;
	}

	String[] ReverOrderString(String[] input) {
		String[] output = new String[input.length];

		for (int i = input.length - 1; i >= 0; i--) {
			output[i] = Reverse(input[input.length - 1 - i]);
		}
		return output;
	}

}
