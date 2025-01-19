package siddharth;

import java.util.HashMap;
import java.util.Map;

/*
Find the character frequency of below string
String s = "1234534622123"
Output: {1=2, 2=4, 3=3, 4=2, 5=1, 6=1}
 */
public class Assignment93 {
	
	Map<Character, Integer> printNumFrequency(String input) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for(int i=0;i<input.length();i++) {
			char ch = input.charAt(i);
			if(map.containsKey(ch)) {
				int freq = map.get(ch)+1;
				map.put(ch, freq);
			}else {
				map.put(ch, 1);
			}
		}
		return map;
	}
	
	public static void main(String[] args) {
		String s = "1234534622123";
		Assignment93 assignment93 = new Assignment93();
		System.out.println("Output : "+assignment93.printNumFrequency(s));
	}
}
