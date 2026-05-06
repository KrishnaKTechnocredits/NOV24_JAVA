package roshan.Map;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class FindWordsWithFreqMoreThanOne95 {
	public Map<String, Integer> getWordFeqMoreThanOne(String str) {
		String[] array = str.split(" ");
		List<String> newlist = new ArrayList<>(Arrays.asList(array));
		Map<String, Integer> maplist = new ConcurrentHashMap<>();

		for (int i = 0; i < newlist.size(); i++) {
			String word = newlist.get(i);
			if (!maplist.containsKey(word)) {
				maplist.put(word, 1);
			} else {
				int count = maplist.get(word) + 1;
				maplist.put(word, count);
			}
		}
		System.out.println("=======All Frequency========");
		System.out.println(maplist);
		System.out.println("========More than 1 frequency========");

		Set<String> finalmap = maplist.keySet(); // to itterate map
		Iterator<String> itr = finalmap.iterator();
		while (itr.hasNext()) {
			String word = itr.next();
			int value = maplist.get(word);
			if (value == 1) {
				itr.remove();
			}

		}

		return maplist; // made mistake here it will return map not set(change will be made in original
						// List

	}

	public static void main(String[] args) {
		String str = "Hi Hello Hi Hi Pune India Pune India India City";
		FindWordsWithFreqMoreThanOne95 findwordswithfreqmorethanone95 = new FindWordsWithFreqMoreThanOne95();
		Map<String, Integer> result = findwordswithfreqmorethanone95.getWordFeqMoreThanOne(str);
		System.out.println(result);

	}
}

/*
 * String str = "Hi Hello Hi Hi Pune India Pune India India City"; output : Hi
 * -> 3 Hello -> 1 Pune -> 2 India -> 3 City -> 1 return a map, having only
 * those words with freq more than 1. Hi -> 3 Pune -> 2 India -> 3 NOTE : use
 * ConcurrentHashMap
 */

//note:- 2. Why String as Key and Integer as Value
//In your program, you want to count how many times each word appears in the sentence.
//
//Example input:
//"Hi Hello Hi Hi Pune India Pune India India City"
//
//Desired output:
//{Hi=3, Hello=1, Pune=2, India=3, City=1}
//
//Here:
//
//"Hi", "Hello", "Pune" … are keys (words).
//
//3, 1, 2 … are values (counts).
//
//That’s why the map must be Map<String, Integer>