package ravindra;

import java.util.HashMap;

public class Assignment_92 {
	public static void main(String[] args) {
		HashMap<Character,Integer> map=new HashMap<>();
		String s = "1234534622123";
		for (int i = 0; i < s.length(); i++) {
			char ch=s.charAt(i);
			if(map.containsKey(ch)) {
				Integer character = map.get(ch);
				map.put(ch, character+1);
			}else {
				map.put(ch, 1);
			}
		}System.out.println(map);
	}
}
