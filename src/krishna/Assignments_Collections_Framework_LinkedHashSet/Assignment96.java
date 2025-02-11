package Assignments_Collections_Framework_LinkedHashSet;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class Assignment96 {

	Set<String> setofString(String[] arr){
		Map<String,Integer> mapOfFreq = new ConcurrentHashMap<String , Integer>();
		Set<String> setOfMaxFreqString = new LinkedHashSet<String>();
		for(String str:arr) {
			if(mapOfFreq.containsKey(str)) {
				mapOfFreq.put(str, mapOfFreq.get(str)+1);
			}else
				mapOfFreq.put(str, 1);
		}
		
		Set<String> setOfKeys = mapOfFreq.keySet();
		int maxCount = 0;
		for (String str : setOfKeys) {
			if (maxCount < mapOfFreq.get(str)) {
				maxCount = mapOfFreq.get(str);
			}
		}
		
		Iterator<String> itr = setOfKeys.iterator();
		while(itr.hasNext()) {
			String str = itr.next();
			if(mapOfFreq.get(str)== maxCount) {
				setOfMaxFreqString.add(str);
			}
		}
		return setOfMaxFreqString;
	}

	public static void main(String[] args) {
		String str = "Hi Hello Hi Hi Pune India Pune India India City";
		String[] arr = str.split(" ");
		System.out.println(new Assignment96().setofString(arr));
		
	}
}
