//Assignment - 66 : 22nd Dec'2024 [20 min]
//reverse word in array at the same place provided word should not have any digit, if word is having any digit do not reverse the word.
//
//input : {"tech", "aa1shvi", "credits", "H4i", "Hello"}
//output : [hcet, aashvi, stiderc, Hi, olleH]

package komal.Array;

import java.util.Arrays;

public class Assignment66 {
	String removeDigit(String word) {
		String output = "";
		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			if (!Character.isDigit(ch)) {
				output = output + ch;
			}
		}
		return output;
	}

	String getReverseString(String word) {
		String output = "";
		for (int i = word.length() - 1; i >= 0; i--) {
			output = output + word.charAt(i);
		}
		return output;
	}

	boolean checkWordHavingDigit(String word) {
		boolean value = false;
		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			if (Character.isDigit(ch)) {
				value = true;
				return value;
			}
		}
		return value;
	}

	String[] getProcessData(String[] input) {
		String word = "";

//		String[] outputArray = new String[input.length];
		for (int i = 0; i < input.length; i++) {
			word = input[i];
			boolean value = checkWordHavingDigit(word);
			System.out.println(value + "hii");
			if (value) {
				System.out.println(value + "hii2");
				word = removeDigit(input[i]);
				input[i] = word;
			} else {
				word = getReverseString(word);
				input[i] = word;
			}
		}
		return input;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] input = { "tech", "aa1shvi", "credits", "H4i", "Hello" };
		Assignment66 a66 = new Assignment66();
		String[] outputArraay = a66.getProcessData(input);
		System.out.println(Arrays.toString(outputArraay));
	}

}
