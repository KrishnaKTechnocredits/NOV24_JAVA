package swapnilArray;

import java.util.Arrays;

public class Assignment61 {

	String revStr(String str) {

		String revStr = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			revStr = revStr + str.charAt(i);
		}
		return revStr;

	}

	String[] revArray(String[] input) {

		String[] Array = new String[input.length];
		for (int j = 0; j < Array.length; j++) {
			Array[j] = revStr(input[j]);

		}
		return Array;
	}

	public static void main(String[] args) {
		String[] input = { "tech", "aashvi", "credits" };
		Assignment61 a = new Assignment61();
		String[] output = a.revArray(input);
		System.out.println(Arrays.toString(output));

	}

}
