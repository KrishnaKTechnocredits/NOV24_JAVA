/*Assignment - 64 : 22nd Dec'2024 [20 min]
reverse each string in array and place at in reverse order, each word first letter capital and rest in lowercase.
use substring function.

input : {"Tech", "Aashvi", "Credits", "Ansh"}
output : [Hsna,Stiderc, Ivhsaa, Hcet]*/

package pankaj;

import java.util.*;

public class Assignment64 {

	String revWord(String str) {
		String word = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			word = word + str.charAt(i);
		}

		return word;
	}

	String firstLetterCapital(String str) {
		return str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();

	}

	String[] revArray(String[] arr) {
		String[] output = new String[arr.length];
		for (int i = 0, j = arr.length - 1; i < arr.length; i++, j--) {
			output[j] = revWord(arr[i]);
		}

		return output;
	}

	String[] revArrayWithFirstCapitalOtherLowercase(String[] arrOne) {
		String[] output = new String[arrOne.length];
		for (int i = 0, j = arrOne.length - 1; i < arrOne.length; i++, j--) {
			String word = revWord(arrOne[i]);
			output[j] = firstLetterCapital(word);
		}

		return output;
	}

	public static void main(String[] args) {
		Assignment64 A = new Assignment64();
		String[] arr = { "Tech", "Aashvi", "Credits", "Ansh" };
		String[] M = A.revArrayWithFirstCapitalOtherLowercase(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(M));
	}

}
