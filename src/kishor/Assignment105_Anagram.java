package kishor;
//🔹 Assignment 105: Check for Anagram
//📥 Input: Listen, Silent
//✅ The given strings are anagrams
//📥 Input: Techno, chnott
//❌ The given strings are not anagrams
//💡 Hint: Use sorting and comparison of character arrays.

import java.util.Arrays;

public class Assignment105_Anagram {
	
	static void checkIfAnagram(String str1, String str2) {
		
		if(str1.length()!=str2.length()) {
			System.out.println("No, string is not anagram");
			return;
		}
		
		char[] arr= str1.toCharArray();
		char[] arr1=str2.toCharArray();
		
		Arrays.sort(arr);
		Arrays.sort(arr1);
		
		if(Arrays.equals(arr, arr1)) {
			System.out.println("Strings is anagram");
		}
		else {
			System.out.println("String is not anagram");
		}
	}
	
	public static void main(String[] args) {
		String word1="Listen".toLowerCase();
		String word2="Silent".toLowerCase();
		
		String word3="Techno".toLowerCase();
		String word4="chnott".toLowerCase();
		
		checkIfAnagram(word1,word2);
		checkIfAnagram(word3,word4);
	}
}
