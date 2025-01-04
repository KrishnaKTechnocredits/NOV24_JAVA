package rushikesh.ArrayAssignments;

import java.util.Arrays;

public class Assignment_62 {
	
	String getWordInRevOrder(String str) {
		String word = "";
		for (int index = str.length() - 1; index >= 0; index--) {
			char ch = str.charAt(index);
			word = word + ch;
		}
		return word;
	}

	String[] getArrayInRevereOrder(String[] input) {
		String[] output = new String[input.length];
		for (int index = 0, revIndex = input.length - 1; index < input.length; index++, revIndex--) {
			String word = getWordInRevOrder(input[index]);
			output[revIndex] = word;
		}
		return output;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment_62 assignment_62 = new Assignment_62();
		String[] arr = { "tech", "aashvi", "Credits", "Ansh" };
		String[] output = assignment_62.getArrayInRevereOrder(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(output));
	}
}
