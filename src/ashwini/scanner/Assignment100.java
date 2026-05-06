package ashwini.scanner;
/* 
Assignment - 100 : 1st Feb'2025
Find out frequency of each word on user defined input. 
Hint : Use scanner class and Map.
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Assignment100 {
	public static Map<String, Integer> getWordFrequecy(String input) {
		System.out.println("Given input is :" + input);

		Map<String, Integer> wordFreq = new HashMap<String, Integer>();
		String[] str = input.split(" ");

		for (String str1 : str) {
			int count = 0;
			if (wordFreq.containsKey(str1)) {
				count = wordFreq.get(str1); // Get the current count
				wordFreq.put(str1, count + 1);
			} else {
				wordFreq.put(str1, 1);
			}

		}
		return wordFreq;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter input : ");
		String input = sc.nextLine();
		Map<String, Integer> wordFreq = getWordFrequecy(input);
		System.out.println(wordFreq);
		// Close the scanner
		sc.close();
	}
}
