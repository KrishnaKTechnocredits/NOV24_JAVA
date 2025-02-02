package harish.collections;

import java.util.HashMap;
import java.util.Map;

/**
 * Assignment 92 - 17th Jan
 * 
 * Find the word frequency of below string
 * 
 * String s = "hi hello good morning good evening hi bye hello";
 * 
 * Output: {hi=2, hello=2, evening=1, good=2, morning=1, bye=1}
 */

public class A92_WordFrequencyUsingMaps {

	private void printWordsFrequency(String str) {
		// split given string on white space to create a array of words
		String[] arrayOfString = str.split(" ");

		Map<String, Integer> frequencyMap = new HashMap<String, Integer>();

		for (String word : arrayOfString) {
			if (frequencyMap.containsKey(word)) {
				frequencyMap.put(word, frequencyMap.get(word) + 1);
			} else {
				frequencyMap.put(word, 1);
			}
		}
		System.out.println("Frequency map: " + frequencyMap);
	}

	public static void main(String[] args) {
		String s = "hi hello good morning good evening hi bye hello";
		System.out.println("Input string: " + s);
		new A92_WordFrequencyUsingMaps().printWordsFrequency(s);
	}
}