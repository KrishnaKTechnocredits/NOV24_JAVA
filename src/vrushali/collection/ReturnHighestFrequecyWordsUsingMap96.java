package vrushali.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

//Assignment - 96 : 26th Jan'2025
//
//return the list of all the words having highest frequency.
//String str = "Hi Hello Hi Hi Pune India Pune India India City";
//output : [Hi, India] 

public class ReturnHighestFrequecyWordsUsingMap96 {

	Map<String, Integer> getWordFrquencyMap(String str) {
		String[] wordArray = str.split(" ");
		Map<String, Integer> wordFreqMap = new HashMap<String, Integer>();
		int count = 0;
		for (String word : wordArray) {
			if (wordFreqMap.containsKey(word)) {
				count = wordFreqMap.get(word);
				count++;
				wordFreqMap.put(word, count);
			} else {
				wordFreqMap.put(word, 1);
			}
		}
		return wordFreqMap;
	}

	List<String> getHighestFreqWordList(String str) {
		Map<String, Integer> wordFreqMap = getWordFrquencyMap(str);
		List<String> wordList = new ArrayList<String>();
		int maxLength = 0;
		Set<String> wordSet = wordFreqMap.keySet();
		for (String word : wordSet) {
			if (maxLength < wordFreqMap.get(word)) {
				maxLength = wordFreqMap.get(word);
			}
		}

		for (String word : wordSet) {
			if (maxLength == wordFreqMap.get(word)) {
				wordList.add(word);
			}
		}
		return wordList;
	}

	public static void main(String[] args) {
		ReturnHighestFrequecyWordsUsingMap96 returnHighestFrequecyWordsUsingMap96 = new ReturnHighestFrequecyWordsUsingMap96();
		String str = "Hi Hello Hi Hi Pune India Pune India India City";
		System.out.println(" words having highest frequency :-- "+returnHighestFrequecyWordsUsingMap96.getHighestFreqWordList(str));
	}
}
