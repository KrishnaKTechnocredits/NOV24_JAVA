package ashwini.collections;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
 Assignment 92 : 17th Jan

Program 1: 

Find the word frequency of below string
String s = "hi hello good morning good evening hi bye hello"; 
Output: {hi=2, hello=2, evening=1, good=2, morning=1, bye=1}
 */
public class Assignment92 {
	public static void main(String[] args) {
		String s = "hi hello good morning good evening hi bye hello";
		String[] word = s.split(" ");
		Map<String, Integer> map = new HashMap<String, Integer>();

		for (int i = 0; i < word.length; i++) {
			if (map.containsKey(word[i])) {
				int freq = map.get(word[i]) + 1;
				map.put(word[i], freq);
			} else {
				map.put(word[i], 1);
			}
		}
		System.out.println(map);

	}
}
