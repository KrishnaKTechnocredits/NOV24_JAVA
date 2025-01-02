/*
Assignment - 65 : 22nd Dec'2024 [20 min] [15 mins]
reverse each string in array and place at in reverse order.

input : {"Te1Ch", "A2as3Hvi", "CrE45di555ts", "ANSH"}
output : [HSNa,StidErc, IvHsaa, HCet]

Hint : First letter in Uppercase + last Letter in lowercase + all other characters in same case + exclude digits
*/

package pramod.arraydemo;

import java.util.*;

class Assignment65 {

	String getReverseString(String word) {
		String output = "";
		for (int i = word.length() - 1; i >= 0; i--) {
			char ch = word.charAt(i);
			output = output + ch;
		}
		return output;
	}

	String getDigitsRemoved(String word) {
		String output = "";
		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			if (!Character.isDigit(ch)) {
				output = output + ch;
			}
		}
		return output;
	}

	String getFirstAndLastLetterConv(String word) {
		return word.substring(0, 1).toUpperCase() + word.substring(1, word.length() - 1)
				+ word.substring(word.length() - 1).toLowerCase();
	}

	void printStringInReverseInReverseArray(String[] input) {
		String[] output = new String[input.length];
		for (int i = 0, j = input.length - 1; i < input.length; i++, j--) {
			String str = getDigitsRemoved(input[i]);
			str = getReverseString(str);
			output[j] = getFirstAndLastLetterConv(str);
		}
		System.out.println(
				"Reverse string in reverse array and first letter in Upper Case and last letter in Lower case with no digits: "
						+ Arrays.toString(output));
	}

	public static void main(String[] args) {
		Assignment65 A65 = new Assignment65();
		String[] input = { "Te1Ch", "A2as3Hvi", "CrE45di555ts", "ANSH" };
		System.out.println("Given string is: " + Arrays.toString(input));
		A65.printStringInReverseInReverseArray(input);

	}
}