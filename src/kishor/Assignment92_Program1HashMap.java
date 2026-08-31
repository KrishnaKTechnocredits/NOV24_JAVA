package kishor;

import java.util.HashMap;
import java.util.Map;

//Find the word frequency of below string
//String s = "hi hello good morning good evening hi bye hello"; 
//Output: {hi=2, hello=2, evening=1, good=2, morning=1, bye=1}

public class Assignment92_Program1HashMap {
	
	Map<String,Integer> getFrequency(String[] arr){
		Map<String,Integer> map = new HashMap<String,Integer>();
		
		for(int i=0;i<arr.length;i++) {
			String name = arr[i];
			if(!map.containsKey(name)) {
				map.put(name, 1);
			}
			else {
				Integer num = map.get(name);
				map.put(name, num+1);
			}
		}
		return map;
	}
	
	public static void main(String[] args) {
		String s = "hi hello good morning good evening hi bye hello";
		String[] arr=s.split(" ");
		Assignment92_Program1HashMap assignment92 = new Assignment92_Program1HashMap();
		Map<String,Integer> map=assignment92.getFrequency(arr);
		System.out.println(map);
	}
}
