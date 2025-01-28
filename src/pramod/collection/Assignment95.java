/*
 * Assignment - 95 : 26th Jan'2025

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

package pramod.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Assignment95 {

	Map<String, Integer> getFrequencyOfWordsMoreThanOne(String str) {
		String[] arr = str.split(" ");
		Map<String, Integer> map = new HashMap<String, Integer>();
		for (int i = 0; i < arr.length; i++) {
			String name = arr[i];
			if (map.containsKey(name)) {
				int value = map.get(name);
				value++;
				map.put(name, value);

			} else
				map.put(name, 1);
		}
		System.out.println(map);

		Map<String, Integer> map1 = new HashMap<String, Integer>();
		map1.putAll(map);
		Iterator<String> itr = map1.keySet().iterator();

		while (itr.hasNext()) {
			String key = itr.next();
			int value = map1.get(key);
			if (value == 1) {
				map.remove(key);
			}
		}

		return map;
	}

	public static void main(String[] args) {
		String str = "Hi Hello Hi Hi Pune India Pune India India City";
		System.out.println("Given string is: " + str);
		Map<String, Integer> ans = new Assignment95().getFrequencyOfWordsMoreThanOne(str);
		System.out.println("Map having word frequency more than 1: "+ ans);
	}
}
