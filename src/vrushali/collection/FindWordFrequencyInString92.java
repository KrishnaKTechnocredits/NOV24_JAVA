package vrushali.collection;

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

public class FindWordFrequencyInString92 {

	void printWordFrequency(String str) {
		String[] strArray = str.split(" ");
		Map<String, Integer> wordFreqMao = new HashMap<String, Integer>();
		int count = 0;
		for (String word : strArray) {
			if (wordFreqMao.containsKey(word)) {
				count = wordFreqMao.get(word);
				count++;
				wordFreqMao.put(word, count);
			} else {
				wordFreqMao.put(word, 1);
			}
		}
		System.out.println(wordFreqMao);
	}

	public static void main(String[] args) {

		FindWordFrequencyInString92 findWordFrequencyInString92 = new FindWordFrequencyInString92();
		String str = "hi hello good morning good evening hi bye hello";
		findWordFrequencyInString92.printWordFrequency(str);

	}
}
