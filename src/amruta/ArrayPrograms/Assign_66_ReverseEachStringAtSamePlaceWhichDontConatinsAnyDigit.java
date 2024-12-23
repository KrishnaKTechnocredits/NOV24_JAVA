/*
 * Assignment - 66 : 22nd Dec'2024 [20 min]
reverse word in array at the same place provided word should not have any digit, if word is having any digit do not reverse the word.

input : {"tech", "aa1shvi", "credits", "H4i", "Hello"}
output : [hcet, aa1shvi, stiderc, H4i, olleH]
 */
package amruta.ArrayPrograms;

import java.util.Arrays;

public class Assign_66_ReverseEachStringAtSamePlaceWhichDontConatinsAnyDigit {

	String returnReverseString(String str) {
		String reverseString = "";
		for (int index = str.length() - 1; index >= 0; index--) {
			reverseString += str.charAt(index);
		}
		return reverseString;
	}

	String checkStringContainsdigit(String str) {
		String input = "";
		boolean flag = true;
		for (int index = 0; index < str.length(); index++) {
			if (Character.isDigit(str.charAt(index)))
				flag = false;
		}

		if (flag)
			input = returnReverseString(str);
		else
			input = str;

		return input;
	}

	void takeArray(String[] arr) {
		String[] op = new String[arr.length];
		int count = 0;
		for (int index = 0; index < arr.length; index++) {
			op[count] = checkStringContainsdigit(arr[index]);
			count++;
		}
		System.out.println("Array after reversing string which dont contain any digit ---> " + Arrays.toString(op));
	}

	public static void main(String[] args) {
		String[] input = { "tech", "aa1shvi", "credits", "H4i", "Hello" };
		System.out.println("Given Array --> " + Arrays.toString(input));
		System.out.println("------------------------------------------------");
		new Assign_66_ReverseEachStringAtSamePlaceWhichDontConatinsAnyDigit().takeArray(input);
	}
}
