package swapnil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Assignment92 {
		
		Map<String,Integer> gwtWOrdFreq(String[] arr){
			List<String> s = new ArrayList<String>(Arrays.asList(arr));
		
		Map<String,Integer> map = new HashMap<String,Integer>();
	
		for(int i=0;i<s.size();i++) {
			String ch = s.get(i);
			if(map.containsKey(ch)) {
				Integer freq = map.get(ch)+1;
				map.put(ch, freq);
			}else {
				map.put(ch, 1);
			}
		}
		return map;
	}
		public static void main (String[] args) {
		String str = "hi hello good morning good evening hi bye hello"; 
		String[] arr =str.split(" ");
		Assignment92 a = new Assignment92();
		System.out.println(a.gwtWOrdFreq(arr));
		}			
}
