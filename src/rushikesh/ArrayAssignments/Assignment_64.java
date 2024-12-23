package rushikesh.ArrayAssignments;

import java.util.Arrays;

public class Assignment_64 {

	String getWordInRevOrder(String str) {
		String word = "";
		for (int index = str.length() - 1; index >= 0; index--) {
			char ch = str.charAt(index);
			word = word + ch;
		}
		return word;
	}

	String getWordWithoutDigit(String str) {
		String word = "";
		for (int index = 0; index < str.length(); index++) {
			if (!Character.isDigit(str.charAt(index))) {
				char ch = str.charAt(index);
				word = word + ch;
			}
		}
		return word;
	}

	String getFirstLetterInUpperCase(String str) {
		String word = "";
		char ch = Character.toUpperCase(str.charAt(0));
		for (int index = 1; index < str.length(); index++) {
			word = word + Character.toLowerCase(str.charAt(index));
		}
		return ch + word;
	}

	String[] getArrayInRevOrder(String[] input) {
		String[] output = new String[input.length];
		for (int index = 0, revOrder = input.length - 1; index < input.length; index++, revOrder--) {
			String word = getWordInRevOrder(input[index]);
			word = getWordWithoutDigit(word);
			word = getFirstLetterInUpperCase(word);
			output[revOrder] = getFirstLetterInUpperCase(word);
		}
		return output;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment_64 assignment_64 = new Assignment_64();
		String[] arr = { "Te1ch", "A2as3hvi", "Cre45di555ts", "Ansh" };
		String[] output = assignment_64.getArrayInRevOrder(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(output));
	}

}
