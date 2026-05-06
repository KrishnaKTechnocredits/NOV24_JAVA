package kishor;
//return the list of all the words having highest frequency.

//		 
//String str = "Hi Hello Hi Hi Pune India Pune India India City";
//output : [Hi, India] 

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Assignment96_Map {

	static List<String> getHighestFreList(String[] arr) {
		List<String> list = new ArrayList<String>();
		Map<String, Integer> map = new LinkedHashMap<String, Integer>();
		for (int i = 0; i < arr.length; i++) {
			String word = arr[i];
			if (!map.containsKey(word)) {
				map.put(word, 1);
			} else {
				int count = map.get(word);
				map.put(word, count + 1);
			}
		}

		Set<String> set = map.keySet();
		int maxcount = 0;
		for (String word : set) {
			int value = map.get(word);
			if (value > maxcount) {
				maxcount = value;
			}
		}
		
		//System.out.println(maxcount);
		
		for (String word : set) {
			int value = map.get(word);
			if (value == maxcount) {
				list.add(word);
			}
		}

		return list;
	}

	public static void main(String[] args) {
		String str = "Hi Hello Hi Hi Pune India Pune India India City";
		String[] arr = str.split(" ");
		List<String> list = getHighestFreList(arr);
		System.out.println(list);
	}
}
