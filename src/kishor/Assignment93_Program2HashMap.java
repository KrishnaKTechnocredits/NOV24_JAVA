package kishor;

import java.util.HashMap;
import java.util.Map;

//Find the character frequency of below string
//String s = "1234534622123"
//Output: {1=2, 2=4, 3=3, 4=2, 5=1, 6=1}

public class Assignment93_Program2HashMap {
	
	Map<Character,Integer> getFrequency(String str){
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(!map.containsKey(ch)) {
				map.put(ch, 1);
			}
			else {
				Integer num = map.get(ch);
				map.put(ch,num+1);
			}
		}
		return map;
	}
	
	public static void main(String[] args) {
		String s = "1234534622123";
		Assignment93_Program2HashMap assignment92 = new Assignment93_Program2HashMap();
		Map<Character,Integer> map=assignment92.getFrequency(s);
		System.out.println(map);
	}
}
