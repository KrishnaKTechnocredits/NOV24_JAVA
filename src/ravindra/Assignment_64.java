package ravindra;

import java.util.Arrays;

public class Assignment_64 {
	public static void main(String[] args) {
		String[] input = { "Tech", "Aashvi", "Credits", "Ansh" };
		String[] arry = reverseArray(input);
		System.out.println(Arrays.toString(arry));
	}

	static String revresestring(String input) {
		String rev = "";
		for (int i = input.length() - 1; i >= 0; i--) {
			rev += input.charAt(i);
		}
		String rev1 = rev.substring(0, 1).toUpperCase();
		String rev2 = rev.substring(1).toLowerCase();
		String concaterev1andrev2 = rev1 + rev2;
		return concaterev1andrev2;
	}

	static String[] reverseArray(String[] input) {
		String[] output = new String[input.length];
		for (int i = 0, j = input.length - 1; i < input.length; i++, j--) {
			String str = input[i];
			String revstringwitCon = revresestring(str);
			output[j] = revstringwitCon;
		}
		return output;
	}
}
