/*
 * Assignment - 64 : 22nd Dec'2024 [20 min]
reverse each string in array and place at in reverse order, each word first letter capital and rest in lowercase.

input : {"Tech", "Aashvi", "Credits", "Ansh"}
output : [Hsna,Stiderc, Ivhsaa, Hcet]

 */

package rohan;

import java.util.Arrays;

public class Assignment_64 {

	public static void main(String[] args) {
		Assignment_64 rev = new Assignment_64();
		String[] input = { "TeCh", "Aashvi", "Credits", "AnsH" };
		String[] str = rev.ReverOrderString(input);
		System.out.println(Arrays.toString(str));
	}

	String Reverse(String str) {
		String word = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			word += str.charAt(i);
		}
		word = word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();
		return word;
	}

	String[] ReverOrderString(String[] input) {
		String[] output = new String[input.length];

		for (int i = input.length - 1; i >= 0; i--) {
			output[i] = Reverse(input[input.length - 1 - i]);
		}
		return output;
	}

}
