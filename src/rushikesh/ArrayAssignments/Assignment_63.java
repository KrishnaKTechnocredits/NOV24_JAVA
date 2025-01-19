package rushikesh.ArrayAssignments;

import java.util.Arrays;

public class Assignment_63 {

	String getWordInRevOrder(String str) {
		String word = "";
		for (int index = str.length() - 1; index >= 0; index--) {
			char ch = str.charAt(index);
			word = word + ch;
		}
		return word;
	}

	String getFirstLetterInUpperCase(String str) {
		return str.substring(0, 1).toUpperCase() + str.substring(1, str.length()).toLowerCase();
	}

	String[] getArrayInRevereOrder(String[] input) {
		String[] output = new String[input.length];
		for (int index = 0, revIndex = input.length - 1; index < input.length; index++, revIndex--) {
			String word = getWordInRevOrder(input[index]).toLowerCase();
			word = getFirstLetterInUpperCase(word);
			output[revIndex] = word;
		}
		return output;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment_63 assignment_63 = new Assignment_63();
		String[] arr = { "tech", "aashvi", "Credits", "Ansh" };
		String[] output = assignment_63.getArrayInRevereOrder(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(output));
	}

}
