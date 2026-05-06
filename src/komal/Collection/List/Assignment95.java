//
//Assignment - 95 : 26th Jan'2025
//
//String str = "Hi Hello Hi Hi Pune India Pune India India City";
//output : Hi -> 3
//         Hello -> 1
//		 Pune -> 2
//		 India -> 3
//		 City -> 1
//		 
//		 return a map, having only those words with freq more than 1. 
//		 Hi -> 3
//         Pune -> 2
//		 India -> 3
//		 
//NOTE : use ConcurrentHashMap

package komal.Collection.List;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class Assignment95 {
	int count;

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

		Iterator<String> keyIterator = map.keySet().iterator();

		while (keyIterator.hasNext()) {
			String key = keyIterator.next();
			Integer value = map.get(key);
			if (value <= 1) {
				map.remove(key);
			}
		}
		System.out.print(map);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new Assignment95().getFrequency();

	}

}
