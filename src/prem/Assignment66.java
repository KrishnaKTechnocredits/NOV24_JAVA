package prem;

import java.util.Arrays;

public class Assignment66 {

	String reverseString(String input) {
		String reName = "";
		for (int i = input.length() - 1; i >= 0; i--) {
			reName = reName + input.charAt(i);
		}
		return reName;
	}

	String removeDigitOnly(String input) {
		String reName = "";
		for (int i = 0; i <= input.length() - 1; i++) {
			char ch = input.charAt(i);
			if (!Character.isDigit(ch)) {
				reName = reName + input.charAt(i);
			}
		}
		return reName;
	}

	String getReverseOrder(String input) {
		String output = "";
		int count = 0;
		for (int i = input.length() - 1; i >= 0; i--) {
			char ch = input.charAt(i);
			if (Character.isDigit(ch)) {
				count++;
				break;
			}
		}
		if (count > 0) {
			output = removeDigitOnly(input);
		} else if (count == 0) {
			output = reverseString(input);
		}
		return output;
	}

	void printReverseStringReverseOrder(String[] name) {
		String[] output = new String[name.length];
		for (int i = 0; i <= name.length - 1; i++) {
			output[i] = getReverseOrder(name[i]);
		}
		System.out.println(Arrays.toString(output));
	}

	public static void main(String[] args) {
		Assignment66 assign66 = new Assignment66();
		String[] input = { "tech", "aa1shvi", "credits", "H4i", "Hello" };
		assign66.printReverseStringReverseOrder(input);
	}
}
