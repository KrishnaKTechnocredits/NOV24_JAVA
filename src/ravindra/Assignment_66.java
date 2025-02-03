package ravindra;

import java.util.Arrays;

public class Assignment_66 {
	public static void main(String[] args) {
		String[] input = { "tech", "aa1shvi", "credits", "H4i", "Hello" };
		String[] array = getArray(input);
		System.out.println(Arrays.toString(array));
	}

	static boolean isWordHavingDigit(String input) {
		boolean flag = false;
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (Character.isDigit(ch)) {
				flag = true;
				break;
			}
		}
		return flag;
	}

	static String revresrString(String input) {
		String rev = "";
		if (!isWordHavingDigit(input)) {
			for (int i = input.length() - 1; i >= 0; i--) {
				rev += input.charAt(i);
			}
		}
		return rev;
	}

	static String[] getArray(String input[]) {
		String[] output = new String[input.length];
		for (int i = 0; i < input.length; i++) {
			String str = revresrString(input[i]);
			output[i] = str;
		}
		return output;
	}
}
