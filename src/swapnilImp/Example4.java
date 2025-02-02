package swapnilImp;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Example4 {
	 
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
		Set<Character> setOfKeys = mapCharFreq.keySet();
		int max=0;
		
		for(char key : setOfKeys) {
			int value = mapCharFreq.get(key);
			System.out.println(key+"-->"+value);
			if(max<value) {
				max=value;
				
			}
		}
		System.out.println(max);
		System.out.println("-----------------------");
		for(char key : setOfKeys) {
			int value = mapCharFreq.get(key);
			if(value == max) {
				System.out.println(key);
			}
		}
	}
	public static void main(String[] args) {
		String str = "aakankshakkkkaa";
		new Example4().getCharFreq(str);;
	}
}