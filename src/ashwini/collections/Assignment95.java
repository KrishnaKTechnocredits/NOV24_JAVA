package ashwini.collections;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/*
 Assignment - 95 : 26th Jan'2025

String str = "Hi Hello Hi Hi Pune India Pune India India City";
output : Hi -> 3
         Hello -> 1
		 Pune -> 2
		 India -> 3
		 City -> 1
		 
		 return a map, having only those words with freq more than 1. 
		 Hi -> 3
         Pune -> 2
		 India -> 3
		 
NOTE : use ConcurrentHashMap
 */
public class Assignment95 {
 void m1() {
	 String str = "Hi Hello Hi Hi Pune India Pune India India City";
     String[] words = str.split(" ");
    
	ConcurrentHashMap<String,Integer> mapWordFreq=new ConcurrentHashMap<String,Integer>();
	
	for (String word : words) {
		if (mapWordFreq.containsKey(word)) {
			int count = mapWordFreq.get(word); // Get the current count
			mapWordFreq.put(word, count + 1); 
		} else {
			mapWordFreq.put(word, 1);
		}
     }
	
	Set<String> setOfKeys=mapWordFreq.keySet();
	Iterator<String> itr=setOfKeys.iterator();
	
	while(itr.hasNext()) {
		String key=itr.next();
		int value=mapWordFreq.get(key);
		if(value==1) {
			mapWordFreq.remove(key);
		}
	}
	System.out.println(mapWordFreq);
}
 public static void main(String[] args) {
	 Assignment95 a95=new Assignment95();
	 a95.m1();
}
}
