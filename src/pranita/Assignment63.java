package pranita;

import java.util.Arrays;

class Assignment63 {

	String getReverseWord(String word) {
		String output = "";
		for (int i = word.length() - 1; i >= 0; i--) {
			char ch = word.charAt(i);
			output = output + ch;
		}
		return output;
	}

	String getStringInLowerCase(String word) {
		return word.toLowerCase();
	}

	void getStringInLowerCaseInReverseOrder(String[] input) {
		String[] output = new String[input.length];
		for (int i = 0, j = input.length - 1; i < input.length; i++, j--) {
			String str = getReverseWord(input[i]);
			str = getStringInLowerCase(str);
			output[j] = str;
		}
		System.out.println("Rversed string in reverse array is: " + Arrays.toString(output));
	}

	public static void main(String[] args) {
		Assignment63 A63 = new Assignment63();
		String[] input = { "TeCh", "Aashvi", "Credits", "AnsH" };
		System.out.println("Given String is: " + Arrays.toString(input));
		A63.getStringInLowerCaseInReverseOrder(input);
	}
}