package siddharth;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
Find the word frequency of below string
String s = "hi hello good morning good evening hi bye hello"; 
Output: {hi=2, hello=2, evening=1, good=2, morning=1, bye=1}
 */
public class Assignment92 {

	Map<String, Integer> printWordFrequency(String[] arr) {
		List<String> words = new ArrayList<String>(Arrays.asList(arr));
		Map<String, Integer> map = new HashMap<String, Integer>();
		for(int i=0;i<words.size();i++) {
			String word=words.get(i);
			if(map.containsKey(word)) {
				int freq = map.get(word)+1;
				map.put(word, freq);
			}else {
				map.put(word, 1);
			}
		}
		return map;
	}
	
	public static void main(String[] args) {
		String s = "hi hello good morning good evening hi bye hello";
		String[] arr=s.split(" ");
		Assignment92 assignment92 = new Assignment92();
		System.out.println("Output : "+assignment92.printWordFrequency(arr));
	}
}
