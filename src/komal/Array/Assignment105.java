
//🔹 Assignment 105: Check for Anagram
//📥 Input: Listen, Silent
//✅ The given strings are anagrams

package komal.Array;

import java.util.Arrays;

public class Assignment105 {

	void checkAnagarmStr(String str1, String str2) {

		String[] word1 = str1.toLowerCase().split("");
		String[] word2 = str2.toLowerCase().split("");

		Arrays.sort(word1);
		Arrays.sort(word2);
		System.out.println(Arrays.toString(word1));

		// way 1st
		String sortedString = String.join("", word1);
		String sortedString1 = String.join("", word1);

		if (sortedString.equals(sortedString1)) {
			System.out.println("anagram");
		} else {
			System.out.println("not anagram");
		}

		// way 2nd
		boolean flag = Arrays.equals(word1, word1);
		System.out.println(Arrays.toString(word1));

		if (flag) {
			System.out.println("anagram");
		} else {
			System.out.println("not anagram");
		}
//		String sortedSentence = String.join(" ", words);
//		return sortedSentence;
	}

	public static void main(String args[]) {

		Assignment105 a105 = new Assignment105();

		String str1 = "Listen";
		String str2 = "Silent";

		if (str1.length() == str2.length()) {

			a105.checkAnagarmStr(str1, str2);
		} else {
			System.out.println("not anagram");
		}
	}

}
