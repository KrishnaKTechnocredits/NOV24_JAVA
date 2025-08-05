/*
 * Assignment 93 - 17th January 2025
 * 
 * Find the character frequency of below string
 * 
 * String s = "1234534622123"
 * 
 * Output: {1=2, 2=4, 3=3, 4=2, 5=1, 6=1}
 * 
 */

package amruta.CollectionPrograms;

import java.util.HashMap;
import java.util.Map;

public class Assign_93_FindCharacterFrequencyOfString {

	Map<Character, Integer> getCharacterFrequency(String str) {

		Map<Character, Integer> freqOfChar = new HashMap<Character, Integer>();

		// To iterate chars using element need to Convert String into char array
		char[] charArrayOfInputString = str.toCharArray();

		for (Character ch : charArrayOfInputString) {
			if (freqOfChar.containsKey(ch)) {
				freqOfChar.put(ch, freqOfChar.get(ch) + 1);
			} else {
				freqOfChar.put(ch, 1);
			}
		}

		return freqOfChar;
	}

	public static void main(String[] args) {
		String s = "1234534622123";
		System.out.println("Input string: " + s);
		Map<Character, Integer> characterFrequencyMap = new Assign_93_FindCharacterFrequencyOfString()
				.getCharacterFrequency(s);
		System.out.println("\nCharacter frequency map: " + characterFrequencyMap);
	}
}