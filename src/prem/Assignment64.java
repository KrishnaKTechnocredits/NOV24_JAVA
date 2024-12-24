package prem;

import java.util.Arrays;

public class Assignment64 {

	String getReverseOrderReverseSmallLetterString(String input) {
		String reName = "";
		String output = "";
		for (int i = input.length() - 1; i >= 0; i--) {
			reName = reName + input.charAt(i);
			if (i == 0) {
				output = reName.substring(0, 1).toUpperCase() + reName.substring(1).toLowerCase();
			}
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
		Assignment64 assign64 = new Assignment64();
		String[] input = { "Tech", "Aashvi", "Credits", "Ansh" };
		assign64.printReverseStringReverseOrder(input);
	}

}
