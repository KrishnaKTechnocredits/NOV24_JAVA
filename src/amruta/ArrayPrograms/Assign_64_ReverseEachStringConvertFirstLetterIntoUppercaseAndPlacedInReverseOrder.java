/*
 * Assignment - 64 : 22nd Dec'2024 [20 min]
reverse each string in array and place at in reverse order, each word first letter capital and rest in lowercase.

input : {"Tech", "Aashvi", "Credits", "Ansh"}
output : [Hsna,Stiderc, Ivhsaa, Hcet]
 */
package amruta.ArrayPrograms;

import java.util.Arrays;

public class Assign_64_ReverseEachStringConvertFirstLetterIntoUppercaseAndPlacedInReverseOrder {

	String returnReverseString(String str) {
		String reverseString = "";
		for (int index = str.length() - 1; index >= 0; index--) {
			reverseString += str.charAt(index);
		}
		return reverseString;
	}

	// Optimized - Logic 2
	String converFirstLetterTOUppercase2(String str) {
		str = returnReverseString(str);
		str = str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
		return str;
	}

	// Logic 1
	String converFirstLetterTOUppercase1(String str) {
		str = returnReverseString(str);

		String str1 = str.substring(0, 1);
		str1 = str1.toUpperCase();

		String str2 = str.substring(1);
		str2 = str2.toLowerCase();

		str = str1 + str2;

		return str;
	}

	void takeArray(String[] arr) {
		String[] op = new String[arr.length];
		int count = 0;
		for (int index = arr.length - 1; index >= 0; index--) {
			op[count] = converFirstLetterTOUppercase2(arr[index]);
			count++;
		}
		System.out.println("Array after string reversing and converting to lowercase and placed in reverse order ---> "
				+ Arrays.toString(op));
	}

	public static void main(String[] args) {
		String[] input = { "Tech", "Aashvi", "Credits", "Ansh" };
		System.out.println("Given Array --> " + Arrays.toString(input));
		System.out.println("------------------------------------------------");
		new Assign_64_ReverseEachStringConvertFirstLetterIntoUppercaseAndPlacedInReverseOrder().takeArray(input);
	}
}
