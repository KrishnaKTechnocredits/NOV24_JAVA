package kishor;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

//String str = "Hi Hello Hi Hi Pune India Pune India India City";
//output : Hi -> 3
//         Hello -> 1
//		 Pune -> 2
//		 India -> 3
//		 City -> 1
//		 return a map, having only those words with freq more than 1. 
//		 Hi -> 3
//         Pune -> 2
//		 India -> 3
//--we can write this programm thorugh HashMap, LInkedHashMap and TreeMap also

public class Assignment95_ConCurrentHashMap {

	static Map<String, Integer> getUpdatedMap(String[] arr) {
		Map<String, Integer> map = new ConcurrentHashMap<String, Integer>();
		for (int i = 0; i < arr.length; i++) {
			String name = arr[i];
			if (!map.containsKey(name)) {
				map.put(name, 1);
			} else {
				int count = map.get(name);
				map.put(name, count + 1);
			}
		}
		System.out.println("=======All Frequency========");
		System.out.println(map);
		System.out.println("========More than 1 frequency========");

		Set<String> set = map.keySet();
		Iterator<String> itr = set.iterator();

		while (itr.hasNext()) {
			String word = itr.next();
			int value = map.get(word);
			if (value == 1) {
				itr.remove();
			}
		}

		return map;
	}

	public static void main(String[] args) {
		String str = "Hi Hello Hi Hi Pune India Pune India India City";
		String[] arr = str.split(" ");
		Map<String, Integer> map = getUpdatedMap(arr);
		System.out.println(map);
	}
}
