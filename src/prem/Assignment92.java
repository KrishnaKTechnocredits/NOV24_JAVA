package prem;

import java.util.*;

public class Assignment92 {

	public static void main(String[] args) {

		String s = "hi hello good morning good evening hi bye hello";
		String[] str = s.split(" ");
		System.out.println(Arrays.toString(str));

		Map<String, Integer> outputMap = new HashMap<>();

		for (String word : str) {
			int count = 0;
			if (outputMap.get(word) == null) {
				count++;
				outputMap.put(word, count);
			} else if (outputMap.get(word) != null) {
				outputMap.get(word);
				outputMap.put(word, outputMap.get(word) + 1);
			}

		}
		System.out.println(outputMap);
	}
}
