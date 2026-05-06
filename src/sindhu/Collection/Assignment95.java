/*String str = "Hi Hello Hi Hi Pune India Pune India India City";
output : Hi -> 3
         Hello -> 1
		 Pune -> 2
		 India -> 3
		 City -> 1
		 
		 return a map, having only those words with freq more than 1. 
		 Hi -> 3
         Pune -> 2
		 India -> 3*/

package sindhu.Collection;

import java.util.*;

public class Assignment95 {
	public Map<String, Integer> getWordsWithMaxFreq(String[] strArr){
		Map<String, Integer> opMap = new HashMap<String, Integer>();
		
		for(int i=0; i<strArr.length; i++) {
			String word = strArr[i];
						
			if(opMap.containsKey(word)) {
				int count = opMap.get(word); // it returns value for that key
				count++;
				opMap.put(word, count);
			}else {
				opMap.put(word, 1);
			}
		}
		System.out.println("The frequency of each word in array is: "+opMap);
		
		Map<String, Integer> opMap1 = new HashMap<>();
		opMap1.putAll(opMap);
		Iterator<String> itr = opMap1.keySet().iterator();
		
		while(itr.hasNext()) {
			String key = itr.next();
			int freq = opMap1.get(key);
			if(freq==1) {
				opMap.remove(key);
			}
		}
		return opMap;
	}
	
	public static void main(String[] args) {
		Assignment95 a95 = new Assignment95();
		String str = "Hi Hello Hi Hi Pune India Pune India India City";
		String[] strArr = str.split(" ");
		System.out.println("The input array is: "+Arrays.toString(strArr));
		
		Map<String, Integer> finalOP = a95.getWordsWithMaxFreq(strArr);
		System.out.println("The final output map is: "+ finalOP);
		
	}
}
