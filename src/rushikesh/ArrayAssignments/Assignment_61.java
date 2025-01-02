package rushikesh.ArrayAssignments;

import java.util.Arrays;

public class Assignment_61 {

	String wordReveseInOrder(String word) {
		String str = "";
		for (int index = word.length() - 1; index >= 0; index--) {
			char ch = word.charAt(index);
			str = str + ch;
		}
		return str;
	}

	String[] getStringInReverseOrder(String[] input) {
		String[] output = new String[input.length];
		for (int index = 0; index < input.length; index++) {
			String word = wordReveseInOrder(input[index]);
			output[index]=word.toLowerCase();
		}
		return output;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment_61 assignment_61 = new Assignment_61();
		String[] arr = { "tEch", "aashvi", "crEdIts" };
		String[] output = assignment_61.getStringInReverseOrder(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(output));
	}
}
