package titiksha.Array_Union;

import java.util.Arrays;

public class ReverseStringInReverseOrder {

	String getStringReverse(String name) {
		String output = "";
		for (int j = name.length() - 1; j >= 0; j--) {
			output = output + name.charAt(j);
		}
		return output;
	}

	String getFirstLetterInCaps(String name) {
		name = name.toLowerCase();
		char ch = Character.toUpperCase(name.charAt(0));
		String output = ch + name.substring(1);

		return output;
	}

	String[] getReverseArray(String[] arr) {
		String[] reverse = new String[arr.length];
		int j = arr.length - 1;
		for (int i = 0; i < arr.length; i++) {
			String word = arr[i];
			word = getStringReverse(word);
			word = getFirstLetterInCaps(word);
			reverse[j--] = word;

		}
		return reverse;
	}

	public static void main(String[] args) {
		ReverseStringInReverseOrder reverseString1 = new ReverseStringInReverseOrder();
		String[] result = { "tech", "aashvi", "credits" };
		System.out.println("The input array:" + Arrays.toString(result));
		String[] output1 = reverseString1.getReverseArray(result);
		System.out.println("The output array:" + Arrays.toString(output1));
	}
}
