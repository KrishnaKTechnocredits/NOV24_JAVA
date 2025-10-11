package roshan.Map;

import java.util.*;

public class A92_FindWordFrequencyUsingMap {
	void getFrequencyOfWord(String s) {
		// split given string on white space to create a array of words
		String[] stringArray = s.split(" ");
		Map<String, Integer> mapList = new HashMap<>();
		for (String word : stringArray) {
			if (mapList.containsKey(word)) {
				mapList.put(word, mapList.get(word) + 1);
			} else {
				mapList.put(word, 1);
			}

		}
		System.out.println(" Frequency is " + mapList);
	}

	public static void main(String[] args) {
		String s = "hi hello good morning good evening hi bye hello";
		A92_FindWordFrequencyUsingMap a92_findwordfrequencyusingmap = new A92_FindWordFrequencyUsingMap();
		a92_findwordfrequencyusingmap.getFrequencyOfWord(s);

	}

}

/*
 * Assignment 92 : 17th Jan
 * 
 * 
 * Find the word frequency of below string String s =
 * "hi hello good morning good evening hi bye hello"; Output: {hi=2, hello=2,
 * evening=1, good=2, morning=1, bye=1}
 */