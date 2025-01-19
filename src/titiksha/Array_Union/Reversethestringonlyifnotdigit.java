//Assignment - 66 : 22nd Dec'2024 [20 min]
//reverse word in array at the same place provided word should not have any digit, if word is having any digit do not reverse the word.
//input : {"tech", "aa1shvi", "credits", "H4i", "Hello"}
//output : [hcet, aashvi, stiderc, Hi, olleH]

package titiksha.Array_Union;

import java.util.Arrays;

public class Reversethestringonlyifnotdigit {
	String getreversestring(String word) {
		String reverse = "";
		for (int i = word.length() - 1; i >= 0; i--) {
			reverse += word.charAt(i);
		}
		return reverse;
	}

	String getstringwithoutdigiT(String word) {
		String digit = "";
		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			if (!Character.isDigit(ch)) {
				digit += ch;

			}
		}
		return digit;
	}

	String[] getreversearray(String[] arr) {
		String[] output = new String[arr.length];
		for (int i = 0; i < arr.length; i++) {
			String word = arr[i];
			if (!word.matches(".*\\d.*")) {// checking if word contains digit
				output[i] = getreversestring(word);
			}

			else {
				output[i] = getstringwithoutdigiT(word);

			}

		}
		return output;
	}

	public static void main(String[] args) {
		Reversethestringonlyifnotdigit reverseString3 = new Reversethestringonlyifnotdigit();
		String[] result = { "tech", "aa1shvi", "credits", "H4i", "Hello" };
		System.out.println("The input array:" + Arrays.toString(result));
		String[] output1 = reverseString3.getreversearray(result);
		System.out.println("The output array:" + Arrays.toString(output1));
	}
}
