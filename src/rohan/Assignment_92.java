/*
 * Find the word frequency of below string
String s = "hi hello good morning good evening hi bye hello"; 
Output: {hi=2, hello=2, evening=1, good=2, morning=1, bye=1}
 */

package rohan;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.*;

public class Assignment_92 {

	public static void main(String[] args) {
		String s = "hi hello good morning good evening hi bye hello";
		String[] str = s.split(" ");
		System.out.println(Arrays.toString(str));

		Map<String, Integer> freq = new LinkedHashMap<>();

		for (int i = 0; i < str.length; i++) {
			String word = str[i];
			if (freq.containsKey(word)) {
				int wordfreq = freq.get(word);
				freq.put(word, ++wordfreq);
			} else {
				freq.put(word, 1);
			}
		}
		System.out.println(freq);
	}
}
