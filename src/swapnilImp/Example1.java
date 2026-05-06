package swapnilImp;

import java.util.HashMap;
import java.util.Map;

public class Example1 {
	 
	void getCharFreq(String word) {
		char[] arr = word.toCharArray();
		Map<Character,Integer> mapCharFreq = new HashMap<Character, Integer>();
		
		for(char ch   :  arr) {
			if(mapCharFreq.containsKey(ch)) {
				int count = mapCharFreq.get(ch);
				mapCharFreq.put(ch, count+1);
			}else {
				mapCharFreq.put(ch, 1);
					
				
			}
		}
		System.out.println(mapCharFreq);
	}
	public static void main(String[] args) {
		String str = "aakankshakkkk";
		new Example1().getCharFreq(str);;
	}
}
