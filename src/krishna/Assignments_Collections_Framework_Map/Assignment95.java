package Assignments_Collections_Framework_Map;

import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

public class Assignment95 {
	
	Map<String ,Integer> mapofStringFreq(String[] arr){
		Map<String,Integer> mapOfFreq = new ConcurrentHashMap<String , Integer>();
		Map<String,Integer> mapOfMaxFreq = new ConcurrentHashMap<String , Integer>();
		for(String str:arr) {
			if(mapOfFreq.containsKey(str)) {
				mapOfFreq.put(str, mapOfFreq.get(str)+1);
			}else
				mapOfFreq.put(str, 1);
		}
		
		for(Entry<String, Integer> setOfEnteris : mapOfFreq.entrySet()) {
			if(setOfEnteris.getValue() >1) {
				mapOfMaxFreq.put(setOfEnteris.getKey(),setOfEnteris.getValue());
			}
		}
		System.out.println(mapOfFreq);
		return mapOfMaxFreq;
	}

	public static void main(String[] args) {
		String str = "Hi Hello Hi Hi Pune India Pune India India City";
		String[] arr = str.split(" ");
		System.out.println(new Assignment95().mapofStringFreq(arr));
		
	}
}
