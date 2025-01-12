package rushikesh.ArrayAssignments;

import java.util.Arrays;

public class Assignment_67 {

	String getStringWithDigitInLastSeq(String str) {
		String word1 = "";
		String word2 = "";
		for (int index = 0; index < str.length(); index++) {
			if (Character.isDigit(str.charAt(index))) {
				word2 = word2 + str.charAt(index);
			} else {
				word1 = word1 + str.charAt(index);
			}
		}
		return word1 + word2;
	}

	String[] getArrayInSameOrder(String[] input) {
		String[] output = new String[input.length];
		for (int index = 0; index < input.length; index++) {
			output[index] = getStringWithDigitInLastSeq(input[index]);
		}
		return output;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment_67 assignment_67 = new Assignment_67();
		String[] arr = { "Rush234ikesh", "123Narendra2", "Kapare" };
		String[] output = assignment_67.getArrayInSameOrder(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(output));
	}
}
