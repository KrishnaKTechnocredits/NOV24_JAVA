package vrushali.collection;

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

public class FindFrequenyOfCharInWord93 {

	void findFreqOfCharFromFromWord(String str) {
		char[] charArray = str.toCharArray();
		Map<Character, Integer> charFreqMap = new HashMap<Character, Integer>();
		int count = 0;
		for (char ch : charArray) {

			if (charFreqMap.containsKey(ch)) {
				count = charFreqMap.get(ch);
				count++;
				charFreqMap.put(ch, count);
			} else {
				charFreqMap.put(ch, 1);
			}
		}
		System.out.println(charFreqMap);
	}

	public static void main(String[] args) {
		FindFrequenyOfCharInWord93 findFrequenyOfCharInWord93 = new FindFrequenyOfCharInWord93();
		String str = "1234534622123";
		findFrequenyOfCharInWord93.findFreqOfCharFromFromWord(str);
	}

}
