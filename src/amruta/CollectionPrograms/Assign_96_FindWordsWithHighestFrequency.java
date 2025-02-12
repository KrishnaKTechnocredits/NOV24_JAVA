/*
 * Assignment - 96 : 26th Jan'2025
 * 
 * Return the list of all the words having highest frequency.
 * 
 * String str = "Hi Hello Hi Hi Pune India Pune India India City";
 * 
 * Output : [Hi, India]
 */

package amruta.CollectionPrograms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Assign_96_FindWordsWithHighestFrequency {

	int getHighestFrequency(Map<String, Integer> frequencyMap) {
		int maxFrequency = 0;
		Set<String> wordKey = frequencyMap.keySet();
		Iterator<String> iterator = wordKey.iterator();

		while (iterator.hasNext()) {
			String word = iterator.next();
			if (frequencyMap.get(word) > maxFrequency) {
				maxFrequency = frequencyMap.get(word);
			}
		}
		return maxFrequency;
	}

	Map<String, Integer> getWordFrequencyMap(String str) {
		String[] words = str.split(" ");
		Map<String, Integer> wordFrequencyMap = new HashMap<String, Integer>();

		for (String word : words) {
			if (wordFrequencyMap.containsKey(word)) {
				wordFrequencyMap.put(word, wordFrequencyMap.get(word) + 1);
			} else {
				wordFrequencyMap.put(word, 1);
			}
		}

		System.out.println("Words and their frequencies: " + wordFrequencyMap);
		return wordFrequencyMap;
	}

	List<String> getWordsWithHighestFrequency(String str) {
		List<String> wordsWithHighestFrequency = new ArrayList<String>();

		Map<String, Integer> wordFrequencyMap = getWordFrequencyMap(str);

		int highestFrequency = getHighestFrequency(wordFrequencyMap);

		Set<String> keySet = wordFrequencyMap.keySet();

		Iterator<String> iterator = keySet.iterator();

		while (iterator.hasNext()) {
			String word = iterator.next();
			if (wordFrequencyMap.get(word) == highestFrequency) {
				wordsWithHighestFrequency.add(word);
			}
		}
		return wordsWithHighestFrequency;
	}

	public static void main(String[] args) {
		String str = "Hi Hello Hi Hi Pune India Pune India India City";
		System.out.println("Input string: " + str);
		List<String> wordsWithHighestFrequency = new Assign_96_FindWordsWithHighestFrequency()
				.getWordsWithHighestFrequency(str);
		System.out.println("Words with highest frequency: " + wordsWithHighestFrequency);
	}
}