package ajay_ArrayAssignments;

import java.util.Arrays;

public class Assignment66 {

	boolean hasDigit(String word) {
		boolean flag = false;
		for (int i = 0; i <	word.length(); i++) {
			char ch = word.charAt(i);
			if (Character.isDigit(ch)) {
				flag = true;
				break;
			}
		}

		return flag;
	}

	String getreverseWord(String word) {
		String reverseWord = "";
		for (int j = word.length() - 1; j >= 0; j--) {
			reverseWord = reverseWord + word.charAt(j);
		}
		return reverseWord;
	}

	String[] OutputProcessedArray(String[] input) {

		String[] outputArray = new String[input.length];
		for (int i = 0; i < input.length; i++) {
			if (hasDigit(input[i])) {
				outputArray[i] = input[i];
			} else {
				outputArray[i] = getreverseWord(input[i]);
			}
		}
		return outputArray;
	}

	public static void main(String[] args) {
		Assignment66 assignment66 = new Assignment66();
		String[] input = { "tech", "aa1shvi", "credits", "H4i", "Hello" };
		String[] output = assignment66.OutputProcessedArray(input);
		System.out.println(Arrays.toString(output));

	}

}
