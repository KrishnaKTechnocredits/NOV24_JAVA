/*Assignment - 66 : 22nd Dec'2024 [20 min]
reverse word in array at the same place provided word should not have any digit, if word is having any digit do not reverse the word.
input : {"tech", "aa1shvi", "credits", "H4i", "Hello"}
output : [hcet, aashvi, stiderc, Hi, olleH]
*/
package harshada.Array3;

import java.util.Arrays;

public class Ass66_ReversewordNodigit {

	String reverseWord(String str) {
		String output = "";
		boolean digitFlag = false;
		if (digitFlag == isDigitWord(str)) {
			for (int i = str.length() - 1; i >= 0; i--) {
				output += str.charAt(i);
			} // System.out.println(output);
			return output;
		} else {
			output = getStringWithoutDigit(str);
			return output;
		}
	}

	boolean isDigitWord(String str) {
		boolean flag = false;
		for (int i = 0; i < str.length(); i++) {
			if (Character.isDigit(str.charAt(i))) {
				flag = true;
			}
		}
		return flag;
	}

	String getStringWithoutDigit(String str) {
		String output = "";
		for (int i = 0; i < str.length(); i++) {
			if (!Character.isDigit(str.charAt(i))) {
				output += str.charAt(i);
			}
		} // System.out.println(output);
		return output;
	}

	void getReverseWordArrayWithoutDigit(String[] array) {
		for (int i = 0; i < array.length; i++) {
			array[i] = reverseWord(array[i]);
		}
		System.out.println(Arrays.toString(array));
	}

	public static void main(String[] args) {
		Ass66_ReversewordNodigit ass66 = new Ass66_ReversewordNodigit();
		String[] input = { "tech", "aa1shvi", "credits", "H4i", "Hello" };
		ass66.getReverseWordArrayWithoutDigit(input);
	}
}
