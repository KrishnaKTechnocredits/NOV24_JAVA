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
Assignment - 95 : 26th Jan'2025

String str = "Hi Hello Hi Hi Pune India Pune India India City";
output : Hi -> 3
         Hello -> 1
		 Pune -> 2
		 India -> 3
		 City -> 1
		 
		 return a map, having only those words with freq more than 1. 
		 Hi -> 3
         Pune -> 2
		 India -> 3
		 
NOTE : use ConcurrentHashMap
 */
public class Assignment95 {

	Map<String, Integer> getFrequencyOfWords(String[] input){
		List<String> listOfWords = new ArrayList<>(Arrays.asList(input));
		Map<String, Integer> map = new HashMap<>();
		
		Iterator<String> itr = listOfWords.iterator();
		while(itr.hasNext()) {
			String key = itr.next();
			if(!map.containsKey(key)) {
				map.put(key, 1);
			}else {
				int value=map.get(key);
				value=value+1;
				map.put(key, value);
			}
		}
		System.out.println("Frequency of Words is : "+map);
		return map;
	}
	
	Map<String, Integer> getFrequencyOfWordsMoreThanOne(Map<String, Integer> map){
		Map<String, Integer> map2 = new ConcurrentHashMap<String, Integer>(map);
		Set<String> keysOfMap = map2.keySet();
		Iterator<String> itr2 = keysOfMap.iterator();
			while(itr2.hasNext()) {
				String key = itr2.next();
				int value = map2.get(key);
				if(value<=1) {
					map2.remove(key);
				}
			}
		System.out.println("Frequency of Words having only those words with freq more than 1 : " + map2);
		return map2;
	}

	public static void main(String[] args) {
		String str = "Hi Hello Hi Hi Pune India Pune India India City";
		String[] arr = str.split(" ");
		Assignment95 assignment95 = new Assignment95();
		Map<String, Integer> map = assignment95.getFrequencyOfWords(arr);
		assignment95.getFrequencyOfWordsMoreThanOne(map);
	}
}
