//Assignment - 66 : 22nd Dec'2024 [20 min]
//reverse word in array at the same place provided word should not have any digit, if word is having any digit do not reverse the word.

//input : {"tech", "aa1shvi", "credits", "H4i", "Hello"}
//output : [hcet, aashvi, stiderc, Hi, olleH]

package rushikesh.ArrayAssignments;

import java.util.Arrays;

public class Assignment_66 {

	boolean containsDigitinString(String str) {
		boolean flag = false;
		for (int index = 0; index < str.length(); index++) {
			if (Character.isDigit(str.charAt(index))) {
				flag = true;
			}
		}
		return flag;
	}

	String getWordInRevOrder(String str) {
		String word = "";
		for (int index = str.length() - 1; index >= 0; index--) {
			word = word + str.charAt(index);
		}
		return word;
	}

	String[] getArrayInRevOrderInSamePlace(String[] input) {
		String[] output = new String[input.length];
		for (int index = 0; index < input.length; index++) {
			if (containsDigitinString(input[index]) == true) {
				output[index] = input[index];
			} else if (containsDigitinString(input[index]) == false) {
				output[index] = getWordInRevOrder(input[index]);
			}
		}
		return output;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment_66 assignment_66 = new Assignment_66();
		String[] arr = { "tech", "aa1shvi", "credits", "H4i", "Hello" };
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(assignment_66.getArrayInRevOrderInSamePlace(arr)));
	}
}
