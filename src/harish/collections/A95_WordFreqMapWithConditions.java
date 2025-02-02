package harish.collections;

import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Assignment - 95 : 26th Jan'2025
 * 
 * String str = "Hi Hello Hi Hi Pune India Pune India India City";
 * 
 * Output : Hi -> 3 Hello -> 1 Pune -> 2 India -> 3 City -> 1
 * 
 * Return a map, having only those words with freq more than 1.
 * 
 * Hi -> 3 Pune -> 2 India -> 3
 * 
 * NOTE : Use ConcurrentHashMap
 */

public class A95_WordFreqMapWithConditions {

	private Map<String, Integer> getWordsWithFreqMoreThan1(String input) {

		Map<String, Integer> output = new ConcurrentHashMap<String, Integer>();

		for (String str : input.split(" ")) {
			if (output.containsKey(str)) {
				output.put(str, output.get(str) + 1);
			} else {
				output.put(str, 1);
			}
		}

		System.out.println("Word frequency map: " + output);

		Iterator<String> iterator = output.keySet().iterator();
		while (iterator.hasNext()) {
			String word = iterator.next();
			Integer freq = output.get(word);
			if (freq < 2) {
				output.remove(word);
			}
		}
		return output;
	}

	public static void main(String[] args) {
		String input = "Hi Hello Hi Hi Pune India Pune India India City";
		System.out.println("Input string: " + input);
		Map<String, Integer> wordsWithFreqMoreThan1 = new A95_WordFreqMapWithConditions()
				.getWordsWithFreqMoreThan1(input);
		System.out.println("Words with frequency more than 1: " + wordsWithFreqMoreThan1);
	}
}