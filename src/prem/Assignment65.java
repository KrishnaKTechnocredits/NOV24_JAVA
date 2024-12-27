package prem;

import java.util.Arrays;

public class Assignment65 {

	String getReverseOrderReverseSmallLetterString(String input) {
		String reName = "";
		String output = "";
		for (int i = input.length() - 1; i >= 0; i--) {
			char ch = input.charAt(i);
			if (!Character.isDigit(ch)) {
				reName = reName + input.charAt(i);
			}
		}
		if (reName.length() >= 0) {
			String outputFirstLetter = reName.substring(0, 1).toUpperCase();
			String outputMiddleLetter = reName.substring(1, reName.length() - 1);
			String outputLastLetter = reName.substring(reName.length() - 1).toLowerCase();
			output = outputFirstLetter + outputMiddleLetter + outputLastLetter;
		}
		return output;
	}

	void printReverseStringReverseOrder(String[] name) {
		String[] output = new String[name.length];
		for (int i = 0, j = name.length - 1; i <= name.length - 1; i++, j--) {
			output[j] = getReverseOrderReverseSmallLetterString(name[i]);
		}
		System.out.println(Arrays.toString(output));
	}

	public static void main(String[] args) {
		Assignment65 assign65 = new Assignment65();
		String[] input = { "Te1Ch", "A2as3Hvi", "CrE45di555ts", "ANSH" };
		assign65.printReverseStringReverseOrder(input);
	}

}
