package anuja.anuja_interview;

import java.util.Arrays;

//🔹 Assignment 105: Check for Anagram

//📥 Input: Listen, Silent
//✅ The given strings are anagrams
//
//📥 Input: Techno, chnott
//❌ The given strings are not anagrams

//💡 Hint: Use sorting and comparison of character arrays

public class Assignment105Anagram {
	public static void main(String[] args) {
		Assignment105Anagram abc = new Assignment105Anagram();
		String str1 = "Listen";
		String str2 = "Silent";
		String str3 = "Techno";
		String str4 = "chnott";
		System.out.println("Used Ascii sum " + "\n");

		abc.checkIfAnagramOrNotUsedAscii(str1, str2);
		System.out.println("-----------------------------------------------");
		System.out.println("Used arrya sort method" + "\n");
		abc.checkIfAnagraUsingArraySort(str3, str4);

	}

	private void checkIfAnagramOrNotUsedAscii(String strFirst, String strSecond) {
		int sumOfAsciiInStr1 = 0;
		int sumOFAsciiInStr2 = 0;
		strFirst = strFirst.toLowerCase().trim(); // to get equal string
		strSecond = strSecond.toLowerCase().trim();
		for (int i = 0; i < strFirst.length(); i++) {
			char ch1 = strFirst.charAt(i);
			sumOfAsciiInStr1 += ch1;
		}

		for (int i = 0; i < strSecond.length(); i++) {
			char ch2 = strSecond.charAt(i);
			sumOFAsciiInStr2 += ch2;
		}
		if (sumOfAsciiInStr1 == sumOFAsciiInStr2) {
			System.out.println(strFirst + " and " + strSecond + " Both String are anagram");
		} else {
			System.out.println(strFirst + " and " + strSecond + " Both String are not anagram");
		}

		// System.out.println( "Ascii sum -" +sumOfAsciiInStr1);
		// System.out.println( "Ascii sum -" +sumOFAsciiInStr2);

	}

	private void checkIfAnagraUsingArraySort(String strFirst, String strSecond) {
		char[] arr1 = strFirst.toCharArray();
		char[] arr2 = strSecond.toCharArray();
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		if (Arrays.equals(arr1, arr2)) {
			System.out.println(strFirst + " and " + strSecond + " Both String are anagram");
		} else {
			System.out.println(strFirst + " and " + strSecond + " Both String are not anagram");
		}

	}
}
