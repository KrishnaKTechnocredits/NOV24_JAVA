package vrushali.arrayProgram;

import java.util.Arrays;

/**
 * Assignment - 66 : 22nd Dec'2024
 * 
 * Reverse word in array at the same place provided word should not have any
 * digit, if word is having any digit do not reverse the word.
 * 
 * Input : {"tech", "aa1shvi", "credits", "H4i", "Hello"}
 * 
 * Output : [hcet, aashvi, stiderc, H4i, olleH]
 */

public class ReverseStrinInArrayIfNoDigit66 {
	String reverseWord(String str) {
		String reverseWord = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			reverseWord = reverseWord + str.charAt(i);
		}
		return reverseWord;
	}

	boolean isStringContainsDigit(String str) {
		boolean isDigit = false;
		for (int i = 0; i < str.length(); i++) {
			if (Character.isDigit(str.charAt(i))) {
				isDigit = true;
			}
		}
		return isDigit;
	}

	String[] returnReverseStrinArray(String[] str) {
		String[] outputArray = new String[str.length];
		String reverseString = "";
		boolean isDigit = false;
		for (int i = 0; i < str.length; i++) {
			isDigit = isStringContainsDigit(str[i]);
			reverseString = "";
			if (isDigit) {
				outputArray[i] = str[i];
			} else {
				reverseString = reverseWord(str[i]);
				outputArray[i] = reverseString;
			}
		}
		return outputArray;
	}

	public static void main(String[] args) {
		ReverseStrinInArrayIfNoDigit66 reverseStrinInArrayIfNoDigit66 = new ReverseStrinInArrayIfNoDigit66();
		String[] inputArray = { "tech", "aa1shvi", "credits", "H4i", "Hello" };
		String[] outPutArray = reverseStrinInArrayIfNoDigit66.returnReverseStrinArray(inputArray);
		System.out.println("Input Array ;-->" + Arrays.toString(inputArray));
		System.out.println("Output Array ;-->" + Arrays.toString(outPutArray));
	}
}
