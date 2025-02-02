package ashwini.collections;

import java.util.HashMap;
import java.util.Map;

/*
 Program 2:

Find the character frequency of below string
String s = "1234534622123"
Output: {1=2, 2=4, 3=3, 4=2, 5=1, 6=1}
 */
public class Assignment93 {
	public static void main(String[] args) {
		String s = "1234534622123";
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (map.containsKey(ch)) {
				int freq = map.get(ch) + 1;
				map.put(ch, freq);
			} else {
				map.put(ch, 1);
			}
		}
		System.out.println(map);
	}
}
