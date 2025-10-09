package roshan.Set;

import java.util.*;

public class ReturnAllNameWhichEndWithVowels {
	Set<String> getNameEndWithVowels(String[] arr) {
		Set<String> orignalList = new HashSet<String>(Arrays.asList(arr));
		Set<String> outputList1 = new HashSet<String>();
		for (String name : orignalList) {
			String currentch = Character.toString(name.charAt(name.length() - 1)); // - name.charAt(name.length() - 1) →
																					// Gets the last character of the
																					// current name. >>-
																					// Character.toString(...) →
																					// Converts that character into a
																					// String

			if ("aeiou".contains(currentch)) { // (Compare for each char)
				outputList1.add(name);  //made mistake here remember how to write
			}
		}
		return outputList1;
	}

	public static void main(String[] args) {
		String[] arr = { "Roshan", "mokati", "malanio", "ganesh" };
		ReturnAllNameWhichEndWithVowels returnallnamewhichendwithvowels = new ReturnAllNameWhichEndWithVowels();
		Set<String> output = returnallnamewhichendwithvowels.getNameEndWithVowels(arr);
		System.out.println(output);
	}
}

/*
 * Assignment 87 - return all names which are ended with vowels. String[] arr =
 * { "Roshan", "mokati", "malanio", "ganesh" };.
 * 
 * out put:- [mokati, malanio]
 */

