/*
 * Assignment 105: Check for Anagram
📥 Input: Listen, Silent
✅ The given strings are anagrams

📥 Input: Techno, chnott
❌ The given strings are not anagrams

💡 Hint: Use sorting and comparison of character arrays.
 */
package pramod.collection;

import java.util.*;

public class Assignment105 {

	void findIsStringAnagram(String input1, String input2) {
		input1 = input1.toLowerCase();
		input2 = input2.toLowerCase();

		char[] charInput1 = input1.toCharArray();
		char[] charInput2 = input2.toCharArray();

		Arrays.sort(charInput1);
		Arrays.sort(charInput2);

		if (Arrays.equals(charInput1, charInput2)) {
			System.out.println(input1 + " and " + input2 + " are Anagram strings");
		} else {
			System.out.println(input1 + " and " + input2 + " are not anagram strings");
		}
	}

	public static void main(String[] args) {
		String input1 = "Listen";
		String input2 = "Silent";

		String input3 = "Techno";
		String input4 = "chnott";

		new Assignment105().findIsStringAnagram(input1, input2);
		new Assignment105().findIsStringAnagram(input3, input4);
	}
}
