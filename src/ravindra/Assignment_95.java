package ravindra;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class Assignment_95 {
	public static void main(String[] args) {
		String str = "Hi Hello Hi Hi Pune India Pune India India City";
		String[] array = str.split(" ");
		Assignment_95 assignment=new Assignment_95();
		assignment.getfreqofWord(array);
	}

	void getfreqofWord(String[] array) {
		Map<String, Integer> map = new ConcurrentHashMap<String, Integer>();
		for (int i = 0; i < array.length; i++) {
			if (map.containsKey(array[i])) {
				int value = map.get(array[i]);
				map.put(array[i], value + 1);
			} else {
				map.put(array[i], 1);
			}
		}System.out.println(map);
		
		Set<String> setofKey=map.keySet();
		Iterator<String> itr=setofKey.iterator();
		while(itr.hasNext()) {
			String key=itr.next();
			Integer value=map.get(key);
			if(value<=1) {
				map.remove(key);
			}			
		}System.out.println(map);
	}
}
