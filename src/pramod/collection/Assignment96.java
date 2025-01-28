/*
 * Assignment - 96 : 26th Jan'2025

return the list of all the words having highest frequency.
 
String str = "Hi Hello Hi Hi Pune India Pune India India City";
output : [Hi, India] 
 */

package pramod.collection;

import java.util.*;

public class Assignment96 {

	List<String> getHighestFrequencyWord(String str) {
		String[] arr = str.split(" ");

		Map<String, Integer> map = new HashMap<String, Integer>();

		for (int i = 0; i < arr.length; i++) {
			String name = arr[i];
			if (map.containsKey(name)) {
				int value = map.get(name);
				map.put(name, value + 1);
			} else {
				map.put(name, 1);
			}
		}

		System.out.println(map);

		Iterator<String> itr = map.keySet().iterator();

		List<String> list = new ArrayList<String>();
		int maxValue = 0;

		String maxName;
		while (itr.hasNext()) {
			String name = itr.next();
			int value = map.get(name);

			if (maxValue <= value) {
				maxValue = value;
				maxName = name;
				list.add(maxName);
			}
		}
		return list;
	}

	public static void main(String[] args) {
		String str = "Hi Hello Hi Hi Pune India Pune India India City";
		System.out.println("Given string is: " + str);

		List<String> ans = new Assignment96().getHighestFrequencyWord(str);
		System.out.println("Higest frequency words are : " + ans);
	}
}
