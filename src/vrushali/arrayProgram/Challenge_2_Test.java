package vrushali.arrayProgram;

import java.util.Arrays;
//Given Array of String reverse string in the array only if string contains vowel

public class Challenge_2_Test {

	String reverseString(String str) {
		String reverseString = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			reverseString = reverseString + str.charAt(i);
		}
		return reverseString;
	}

	String[] getArrayWithReverseStringIfVowels(String[] strList) {
		String[] outputArray = new String[strList.length];
		String word = "";
		for (int i = 0; i < strList.length; i++) {
			word = strList[i];
			if (word.contains("a") || word.contains("i") || word.contains("o") || word.contains("e")
					|| word.contains("u")) {
				word = reverseString(word);
			}
			outputArray[i] = word;
		}

		return outputArray;
	}

	public static void main(String[] args) {
		Challenge_2_Test challenge_2_Test = new Challenge_2_Test();
		String[] strList = { "apple", "sky", "orange", "try", "eagle" };
		String[] outputArray = challenge_2_Test.getArrayWithReverseStringIfVowels(strList);
		System.out.println("Original Array--> " + Arrays.toString(strList));
		System.out.println("Array WithReverse String containig vowel--> " + Arrays.toString(outputArray));
	}

}
