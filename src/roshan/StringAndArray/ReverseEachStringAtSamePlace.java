package roshan.StringAndArray;

import java.util.Arrays;

public class ReverseEachStringAtSamePlace {
	String[] getreverseString(String[] input) {
		String[] outPut = new String[input.length];  //always remember if need to return array declare array of output first
		for (int i = 0; i < input.length; i++) {
			outPut[i] = RevereseWord(input[i]);     //capture all value in array

		}
		return outPut;
	}

	String RevereseWord(String word) {
		String revWord = ""; // always Initialize local variable before using it>> Initialize the string
		for (int i = word.length() - 1; i >= 0; i--) {
			revWord = revWord + word.charAt(i); // it will add each in string one by one which is itterate from loop.

			// String revWord = word.charAt(i);, encounter a compilation error because
			// word.charAt(i) returns a char, not a String can not use before intilize it

		}
		return revWord;
	}

	public static void main(String[] args) {
		String[] input = { "tech", "aashvi", "credits" };
		ReverseEachStringAtSamePlace reverseachstringatsameplace = new ReverseEachStringAtSamePlace();
		String[] result = reverseachstringatsameplace.getreverseString(input);
		System.out.println(Arrays.toString(result));
	}

}

/*
 * Assignment - 61 : 22nd Dec'2024 [20 min] [IMP] reverse each string in array
 * at the same place.
 * 
 * input : {"tech", "aashvi", "credits"} output : [hcet, ivhsaa, stiderc]
 */