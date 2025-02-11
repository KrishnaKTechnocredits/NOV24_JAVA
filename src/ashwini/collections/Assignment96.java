package ashwini.collections;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/*
 Assignment - 96 : 26th Jan'2025

return the list of all the words having highest frequency.
 
String str = "Hi Hello Hi Hi Pune India Pune India India City";
output : [Hi, India] 
 */
public class Assignment96 {

	int count;

	ConcurrentHashMap<String, Integer> getHighestFreqList(ConcurrentHashMap<String, Integer> map) {

		Iterator<Integer> valueIterator = map.values().iterator();
		int maxCount = valueIterator.next();
		while (valueIterator.hasNext()) {
			if (maxCount < valueIterator.next()) {
				maxCount = valueIterator.next();
			}
		}

		ConcurrentHashMap<String, Integer> map1 = new ConcurrentHashMap<String, Integer>();

		Iterator<String> keyIterator = map.keySet().iterator();

		while (keyIterator.hasNext()) {
			String key = keyIterator.next();
			Integer value = map.get(key)
;
			if (value == maxCount) {
				map1.put(key, value);
			}
		}

		return map1;
	}

	void getFrequency() {
		String str = "Hi Hello Hi Hi Pune India Pune India India City";
		String[] words = str.split(" ");
		ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<String, Integer>();

		for (String str1 : words) {
			if (map.containsKey(str1)) {
				count = map.get(str1); // Get the current count
				map.put(str1, count + 1);
			} else {
				map.put(str1, 1);
			}

		}
		ConcurrentHashMap<String,Integer> highestFreqWords = getHighestFreqList(map);
		System.out.print("The list of all the words having highest frequency => " + highestFreqWords);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Assignment96().getFrequency();
	}

}