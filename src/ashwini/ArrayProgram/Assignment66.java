package ashwini.ArrayProgram;

import java.util.Arrays;

/*
 Assignment - 66 : 22nd Dec'2024 [20 min]
reverse word in array at the same place provided word should not have any digit, if word is having any digit do not reverse the word.

input : {"tech", "aa1shvi", "credits", "H4i", "Hello"}
output : [hcet, aashvi, stiderc, Hi, olleH]
 */
public class Assignment66 {
	boolean isWordHavingDigit(String word) {
		boolean flag = false;
		for (int index = 0; index < word.length(); index++) {
			char ch = word.charAt(index);
			if (Character.isDigit(ch)) {
				flag = true;
				break;
			}
		}
		return flag;
	}

	String getWordWithoutDigit(String word) {
		String output = "";
		for (int index = 0; index < word.length(); index++) {
			char ch = word.charAt(index);
			if (!Character.isDigit(ch)) {
				output = output + ch;
			}
		}
		return output;
	}

	String getRevWord(String word) {
		String output = "";
		for (int index = word.length() - 1; index >= 0; index--) {
			output = output + word.charAt(index);
		}
		return output;
	}

	String[] getProcessedArray(String[] arr) {
		String[] output = new String[arr.length];
		for (int index = 0; index < arr.length; index++) {
			String word = arr[index];
			if (isWordHavingDigit(word)) {
				output[index] = getWordWithoutDigit(word);
			} else {
				output[index] = getRevWord(word);
			}
		}
		return output;
	}

	public static void main(String[] args) {
		Assignment66 a66 = new Assignment66();
		String[] arr = { "tech", "aa1shvi", "credits", "H4i", "Hello" };
		String[] ans = a66.getProcessedArray(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(ans));

	}

}