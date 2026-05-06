package Assignments_Collections_Framework_Map;

import java.util.LinkedHashMap;
import java.util.Map;

public class Assignment92 {
	
	Map<String,Integer> getWordFreq(String str){
		Map<String,Integer> mapOfFreq = new LinkedHashMap<String,Integer>();
		String[] arr = str.split(" ");
		for(int i = 0;i<arr.length;i++) {
			if(mapOfFreq.containsKey(arr[i])) {
				mapOfFreq.put(arr[i], mapOfFreq.get(arr[i])+1);
			}else
				mapOfFreq.put(arr[i], 1);
		}
		
		return mapOfFreq;
	}

	public static void main(String[] args) {
		String str = "hi hello good morning good evening hi bye hello"; 
		System.out.println(new Assignment92().getWordFreq(str));
	}
}
