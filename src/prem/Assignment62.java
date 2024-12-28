package prem;

import java.util.Arrays;

public class Assignment62 {
	String[] input = { "tech", "aashvi", "Credits", "Ansh" };

	static String[] output = { "" };

	String getString(String name) {
		String revName = "";
		for (int j = name.length() - 1; j >= 0; j--) {
			revName = revName + name.charAt(j);
		}
		return revName;
	}

	void printReverseArrayStringReverseOrder(String[] input) {
		String[] output = new String[input.length];
		for (int i = 0, j = input.length - 1; i <= input.length - 1; i++, j--) {
			output[j] = getString(input[i]);
		}
		System.out.print(Arrays.toString(output));
	}

	public static void main(String[] args) {
		Assignment62 assign62 = new Assignment62();
		String[] input = { "tech", "aashvi", "Credits", "Ansh" };
		assign62.printReverseArrayStringReverseOrder(input);
	}

}
