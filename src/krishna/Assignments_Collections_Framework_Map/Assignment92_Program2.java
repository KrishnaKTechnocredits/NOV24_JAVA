package Assignments_Collections_Framework_Map;

import java.util.LinkedHashMap;

public class Assignment92_Program2 {

	public static void main(String[] args) {
		String str = "1234534622123";
		LinkedHashMap<Character , Integer> mapOfNames = new LinkedHashMap<Character , Integer>();
		
		for(int i = 0;i<str.length();i++) {
			if(mapOfNames.containsKey(str.charAt(i))) {
				mapOfNames.put(str.charAt(i), mapOfNames.get(str.charAt(i))+1);
			}else {
				mapOfNames.put(str.charAt(i), 1);
			}
		}
		
		System.out.println(mapOfNames);
	}
}
