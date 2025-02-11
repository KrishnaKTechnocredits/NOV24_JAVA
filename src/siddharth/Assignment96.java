package siddharth;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/*
Assignment - 96 : 26th Jan'2025

return the list of all the words having highest frequency.
 
String str = "Hi Hello Hi Hi Pune India Pune India India City";
output : [Hi, India] 
 */
public class Assignment96 {

	Map<String, Integer> getFrequencyOfWords(String[] input) {
		List<String> listOfWords = new ArrayList<>(Arrays.asList(input));
		Map<String, Integer> map = new HashMap<>();

		Iterator<String> itr = listOfWords.iterator();
		while (itr.hasNext()) {
			String key = itr.next();
			if (!map.containsKey(key)) {
				map.put(key, 1);
			} else {
				int value = map.get(key);
				value = value + 1;
				map.put(key, value);
			}
		}
		return map;
	}

	List<String> getWordsOfHighestFreq(Map<String, Integer> map) {
		Map<String, Integer> map2 = new ConcurrentHashMap<String, Integer>(map);
		Set<String> keyOfMap = map2.keySet();
		List<String> output = new ArrayList<String>();
		Iterator<String> itr2 = keyOfMap.iterator();

		int maxValue = 0;
		while (itr2.hasNext()) {
			String key = itr2.next();
			int value = map2.get(key);
			if (value > maxValue) {
				maxValue = value;
			}
		}
		itr2 = keyOfMap.iterator();  
		while (itr2.hasNext()) {
			String key = itr2.next();
			if(map2.get(key)==maxValue) {
				output.add(key);
			}
		}
		return output;
	}

	public static void main(String[] args) {
		String str = "Hi Hello Hi Hi Pune India Pune India India City";
		String[] arr = str.split(" ");
		Assignment96 assignment96 = new Assignment96();
		Map<String, Integer> map = assignment96.getFrequencyOfWords(arr);
		System.out.println("Output : "+assignment96.getWordsOfHighestFreq(map));
	}
}
