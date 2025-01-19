package swapnil;

import java.util.HashMap;
import java.util.Map;

public class Assignment93 {
		
		Map<Character,Integer> gwtWOrdFreq(String arr){
		
		Map<Character,Integer> map = new HashMap<Character,Integer>();
	
		for(int i=0;i<arr.length();i++) {
			char ch = arr.charAt(i);
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
		String str = "1234534622123"; 
	
		Assignment93 a = new Assignment93();
		System.out.println(a.gwtWOrdFreq(str));
		}			
}