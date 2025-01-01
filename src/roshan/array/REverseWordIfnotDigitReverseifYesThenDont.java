package roshan.array;

import java.util.Arrays;

public class REverseWordIfnotDigitReverseifYesThenDont {
	boolean isWordHAvingDigit(String input) {
		boolean flag = false;
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (Character.isDigit(ch)) {
				flag = true;
				break;
			}
		}
		return flag;

	}

	String removeDigit(String input) {
		String str = "";
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (!Character.isDigit(ch)) {
				str += ch;
			}
		}
		return str;
	}

	String reverseWordwithOUtDigit(String input) {
		String revreseWord = "";
		for (int i = input.length() - 1; i >= 0; i--) {
			char ch = removeDigit(input).charAt(i); // Question arrise : why removeDigit(input) not showing error as we
													// are saving return type having string in "ch" removeDigit(input)
													// returns a String >> AnS: we are calling charAt(i) on this
													// returned
													// String, which extracts the character at position i.thats why no
													// compile time error

			revreseWord += ch;

		}
		return revreseWord;
	}

	String[] processData(String[] input) {
		String[] output = new String[input.length];
		for (int i = 0; i < input.length; i++) {
			String word = input[i];
			if (isWordHAvingDigit(word)) {
				output[i] = removeDigit(word);
			} else {
				output[i] = reverseWordwithOUtDigit(word);

			}

		}
		return output;
	}

	public static void main(String[] args) {
		String[] input = { "tech", "aa1shvi", "credits", "H4i", "Hello" };
		REverseWordIfnotDigitReverseifYesThenDont reverseWord = new REverseWordIfnotDigitReverseifYesThenDont();
		String[] result = reverseWord.processData(input);
		System.out.println(Arrays.toString(result));
	}

}

/*
 * Assignment - 66 : 22nd Dec'2024 [20 min] reverse word in array at the same
 * place provided word should not have any digit, if word is having any digit do
 * not reverse the word.
 * 
 * input : {"tech", "aa1shvi", "credits", "H4i", "Hello"} output : [hcet,
 * aashvi, stiderc, Hi, olleH]
 */
