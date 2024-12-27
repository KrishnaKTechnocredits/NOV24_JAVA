package pratiksha;

import java.util.Arrays;

public class Assignment66 {
/*
  //Assignment - 66 : 22nd Dec'2024 [20 min]
//reverse word in array at the same place provided word should not have any digit, if word is having any digit do not reverse the word.
//
//input : {"tech", "aa1shvi", "credits", "H4i", "Hello"}
//output : [hcet, aashvi, stiderc, Hi, olleH]
 * 
 */
	String getReverseSring(String str) {
		String revString = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			revString += str.charAt(i);
		}
		return revString;
	}

	String removeDigit(String str) {
		String revString = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (!Character.isDigit(ch)) {
				revString += str.charAt(i);
			}
		}
		return revString;
	}
	boolean isDigitPresent(String str) {
		for (int i = 0; i < str.length(); i++) {
			if (Character.isDigit(str.charAt(i))) {
				return true;
			}
		}
		return false;
	}

	String getRevArray(String[] array) {
		String[] output = new String[array.length];
		for (int i = 0; i < array.length; i++) {
			if (!isDigitPresent(array[i])) {
				output[i] = getReverseSring(array[i]);
			} else {
				output[i] = array[i];
			}
			output[i] = removeDigit(output[i]);
		}
		return Arrays.toString(output);
	}
	public static void main(String[] args) {
		String[] input = { "tech", "aa1shvi", "credits", "H4i", "Hello" };
		System.out.println("Input Array:" + Arrays.toString(input));
		Assignment66 assignment66 = new Assignment66();
		System.out.println("Output Array:" + assignment66.getRevArray(input));
	}
}
