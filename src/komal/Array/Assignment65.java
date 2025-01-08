//Assignment - 65 : 22nd Dec'2024 [20 min]
//reverse each string in array and place at in reverse order. without digit
//
//input : {"Te1Ch", "A2as3Hvi", "CrE45di555ts", "ANSH"}
//output : [HSNa,StidErc, IvHsaa, HCet]
//
//Hint : First letter in Uppercase + last Letter in lowercase + all other characters in same case + exclude digits

package komal.Array;

import java.util.Arrays;

public class Assignment65 {
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

	String getFirstLetterinUpperCase(String word) {

		return word.substring(0, 1).toUpperCase() + word.substring(1, word.length() - 1)
				+ word.substring(word.length() - 1).toLowerCase();
	}

	String[] getProcessData(String[] input) {
		String word = "";
		String[] outputArray = new String[input.length];
		for (int i = 0, j = input.length - 1; i < input.length; i++, j--) {
			word = input[i];
			word = removeDigit(word);
			word = getReverseString(word);
			word = getFirstLetterinUpperCase(word);
			outputArray[j] = word;
		}
		return outputArray;
	}

	public static void main(String[] args) {
		String[] input = { "Te1Ch", "A2as3Hvi", "CrE45di555ts", "ANSH" };
		Assignment65 a65 = new Assignment65();
		String[] outputArraay = a65.getProcessData(input);
		System.out.println(Arrays.toString(outputArraay));
	}

}
