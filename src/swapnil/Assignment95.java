package swapnil;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class Assignment95 {
	
	void getFreq(String str){
		String[] array = str.split(" ");
		ConcurrentHashMap<String,Integer> map = new ConcurrentHashMap<String,Integer>();
		
		for(String word:array) {
			if(map.containsKey(word)) {
				int count = map.get(word);
				map.put(word, count+1);
			}else {
				map.put(word, 1);
			}
		}
		Set<String> set = map.keySet();
		Iterator<String> itr = set.iterator();
		
		while(itr.hasNext()) {
			String name =itr.next();
			int value = map.get(name);
			if(value==1) {
				set.remove(name);
			}
		}
		System.out.println(set);
		System.out.println(map);
		
	}
	public static void main(String[] args) {
		String str = "Hi Hello Hi Hi Pune India Pune India India City";
		Assignment95 a = new Assignment95();
		a.getFreq(str);
	}
}
