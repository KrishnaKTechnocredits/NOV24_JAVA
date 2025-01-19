package Assignment_Array;

import java.util.Arrays;

public class Assignment65 {

	String reverseString(String str) {
		StringBuilder revStr = new StringBuilder();
		for (int i = str.length() - 1; i >= 0; i--) {
			if (Character.isLetter(str.charAt(i))) {
				revStr.append(str.charAt(i));
			}
		}
		if (revStr.length() > 1) {
			char lastChar = Character.toLowerCase(revStr.charAt(revStr.length() - 1));
			revStr.setCharAt(revStr.length() - 1, lastChar);
		}
		return revStr.toString();
	}

	String[] getReverseString(String[] str) {
		String[] output = new String[str.length];
		for (int i = 0; i < str.length; i++) {
			output[i] = reverseString(str[i]);
		}
		return output;
	}

	public static void main(String[] args) {
		String[] str = { "Te1Ch", "A2as3Hvi", "CrE45di555ts", "ANSH" };
		String[] arr = new Assignment65().getReverseString(str);
		System.out.println(Arrays.toString(arr));
	}
}
