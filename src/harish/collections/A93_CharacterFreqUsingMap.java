package harish.collections;

import java.util.HashMap;
import java.util.Map;

/**
 * Assignment 93 - 17th January 2025
 * 
 * Find the character frequency of below string
 * 
 * String s = "1234534622123"
 * 
 * Output: {1=2, 2=4, 3=3, 4=2, 5=1, 6=1}
 * 
 */

public class A93_CharacterFreqUsingMap {

	private Map<Character, Integer> getCharacterFrequency(String str) {

		Map<Character, Integer> frequencyMap = new HashMap<Character, Integer>();

		char[] charArrayOfInputString = str.toCharArray();

		for (Character ch : charArrayOfInputString) {
			if (frequencyMap.containsKey(ch)) {
				frequencyMap.put(ch, frequencyMap.get(ch) + 1);
			} else {
				frequencyMap.put(ch, 1);
			}
		}

		return frequencyMap;

	}

	public static void main(String[] args) {
		String s = "1234534622123";
		System.out.println("Input string: " + s);

		Map<Character, Integer> characterFrequencyMap = new A93_CharacterFreqUsingMap().getCharacterFrequency(s);
		System.out.println("Character frequency map: " + characterFrequencyMap);
	}
}