/*
 * Assignment 92 - 17th Jan
 * 
 * Find the word frequency of below string
 * 
 * String s = "hi hello good morning good evening hi bye hello";
 * 
 * Output: {hi=2, hello=2, evening=1, good=2, morning=1, bye=1}
 */

package amruta.CollectionPrograms;

import java.util.HashMap;
import java.util.Map;

public class Assign_92_FindWordFrequencyUsingMaps {
	void printWordsFrequency(String str) {
		// split String
		String[] strArray = str.split(" ");
		Map<String, Integer> frequencyMap = new HashMap<String, Integer>();

		for (String word : strArray) {
			if (frequencyMap.containsKey(word)) {
				frequencyMap.put(word, frequencyMap.get(word) + 1);
			} else {
				frequencyMap.put(word, 1);
			}
		}
		System.out.println("\nFrequency of words -->  " + frequencyMap);
	}

	public static void main(String[] args) {
		String s = "hi hello good morning good evening hi bye hello";
		System.out.println("Given string --> " + s);
		new Assign_92_FindWordFrequencyUsingMaps().printWordsFrequency(s);
	}
}