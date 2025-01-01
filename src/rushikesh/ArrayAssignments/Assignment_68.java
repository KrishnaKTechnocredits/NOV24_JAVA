package rushikesh.ArrayAssignments;

import java.util.Arrays;

public class Assignment_68 {

	String getStringWithSumOfDigitInLastSeq(String str) {
		String word = "";
		int sum = 0;
		for (int index = 0; index < str.length(); index++) {
			if (Character.isDigit(str.charAt(index))) {
				int digit = Character.getNumericValue(str.charAt(index));
				sum = sum + digit;
			} else {
				word = word + str.charAt(index);
			}
		}
		return word + sum;
	}

	String[] getArrayInSameOrder(String[] input) {
		String[] output = new String[input.length];
		for (int index = 0; index < input.length; index++) {
			output[index] = getStringWithSumOfDigitInLastSeq(input[index]);
		}
		return output;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment_68 assignment_68 = new Assignment_68();
		String[] arr = { "Rush234ikesh", "123Narendra2", "5Kap5are" };
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(assignment_68.getArrayInSameOrder(arr)));

	}
}
