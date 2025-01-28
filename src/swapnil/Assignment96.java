package swapnil;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class Assignment96 {
	
	void getMaxFreq(String str) {
		String[] array = str.split(" ");
		ConcurrentHashMap<String,Integer> map = new ConcurrentHashMap<String,Integer>();
		int maxNum=0;
		for(String word : array) {
			if(map.containsKey(word)) {
				int count =map.get(word);
			map.put(word,count+1);
			maxNum=count;
			}else{
				map.put(word,1);
			}
		}
		Set<String> set = map.keySet();
		Iterator<String> itr= set.iterator();
		
		while(itr.hasNext()) {
			String name = itr.next();
			int value=map.get(name);
			if(value<=maxNum) {
				set.remove(name);
			}
		}
		System.out.println(map);
		System.out.println(set);
	}
	public static void main(String[] args) {
		String str = "Hi Hello Hi Hi Pune India Pune India India City";
		Assignment96 a = new Assignment96();
		a.getMaxFreq(str);
	} 
}
