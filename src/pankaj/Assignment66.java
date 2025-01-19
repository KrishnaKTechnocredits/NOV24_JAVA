/*Assignment - 66 : 22nd Dec'2024 [20 min]
reverse word in array at the same place provided word should not have any digit, if word is having any digit do not reverse the word.

input : {"tech", "aa1shvi", "credits", "H4i", "Hello"}
output : [hcet, aashvi, stiderc, Hi, olleH]*/

package pankaj;

import java.util.Arrays;

public class Assignment66 {

	String revWord(String word) {
		String str = "";
		for (int i = word.length() - 1; i >= 0; i--) {
			str = str + word.charAt(i);
		}
		return str;
	}

	boolean wordHavingDigit(String word) {
		boolean flag = false;
		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			if (Character.isDigit(ch)) {
				flag = true;
			}
		}
		return flag;
	}

	String wordWithoutDigit(String word) {
		String output = "";
		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			if (!Character.isDigit(ch)) {
				output = output + ch;
			}
		}
		return output;
	}

	String[] processArray(String[] arr) {
		String[] arrOne = new String[arr.length];
		for (int i = 0; i < arr.length; i++) {
			String word = arr[i];
			if (wordHavingDigit(word)) {
				arrOne[i] = wordWithoutDigit(word);
			} else {
				arrOne[i] = revWord(word);
			}
		}
		return arrOne;
	}

	public static void main(String[] args) {
		Assignment66 A = new Assignment66();
		String[] arr = { "tech", "aa1shvi", "credits", "H4i", "Hello" };
		String[] M = A.processArray(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(M));
	}
}
