/*
 * Assignment - 100 : 1st Feb'2025
 * 
 * Find out frequency of each word on user defined input. Hint : Use scanner
 * class and Map.
 */

package amruta.CollectionPrograms;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Assign_100_FindWordFreqUsingScannerAndMap {
	
	static Map<String, Integer> getWordFreq(String str) {
		String[] words = str.split(" ");
		Map<String, Integer> wordFreqMap = new LinkedHashMap<String, Integer>();
		for (String word : words) {
			wordFreqMap.put(word, wordFreqMap.getOrDefault(word, 0) + 1);
		}
		return wordFreqMap;
	}

	public static void main(String[] args) {
		System.out.println("Enter a string: ");
		Scanner scanner = new Scanner(System.in);
		String inputString = scanner.nextLine();
		scanner.close();
		Map<String, Integer> wordFreq = Assign_100_FindWordFreqUsingScannerAndMap.getWordFreq(inputString);
		System.out.println(wordFreq);
	}
}