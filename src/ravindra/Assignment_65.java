package ravindra;

import java.util.Arrays;

public class Assignment_65 {
	public static void main(String[] args) {
		String input[] = { "Te1Ch", "A2as3Hvi", "CrE45di555ts", "ANSH" };
		String[] rev = revrseArray(input);
		System.out.println(Arrays.toString(rev));
	}

	static String revresrString(String input) {
		String rev = "";
		for (int i = input.length() - 1; i >= 0; i--) {
			if (Character.isLetter(input.charAt(i))) {
				rev += input.charAt(i);
			}
		}
		String rev1 = rev.substring(0, 1).toUpperCase();
		String rev2 = rev.substring(1).toLowerCase();
		String concate = rev1.concat(rev2);
		return concate;
	}

	static String[] revrseArray(String[] input) {
		String output[] = new String[input.length];
		for (int i = 0, j = input.length - 1; i < input.length; i++, j--) {
			String revstr = input[i];
			String rev = revresrString(revstr);
			output[j] = rev;
		}
		return output;
	}
}
