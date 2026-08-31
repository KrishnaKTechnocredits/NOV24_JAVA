package krishna;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Assignment105 {
	
	boolean getAnagramString(String str1 , String str2) {
		if(str1.length()== str2.length()) {
			str1 = str1.toLowerCase();
			str2 = str2.toLowerCase();
			
			char[] arr1 = str1.toCharArray();
			char[] arr2 = str2.toCharArray();
			
			Map<Character, Integer> mapOfChar1 = new TreeMap<Character, Integer>();
			Map<Character, Integer> mapOfChar2 = new TreeMap<Character, Integer>();
			
			for(char ch:arr1) {
				if(mapOfChar1.containsKey(ch)) {
					mapOfChar1.put(ch, mapOfChar1.get(ch)+1);
				}else
					mapOfChar1.put(ch, 1);
			}
			
			for(char ch:arr2) {
				if(mapOfChar2.containsKey(ch)) {
					mapOfChar2.put(ch, mapOfChar1.get(ch)+1);
				}else
					mapOfChar2.put(ch, 1);
			}
			if(mapOfChar1.equals(mapOfChar2)) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		Assignment105 test = new Assignment105();
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter string");
		String str1 = sc.next();
		System.out.println("please enter string");
		String str2 = sc.next();
		
		boolean flag = test.getAnagramString(str1, str2);
		if(flag) {
			System.out.println(str1 +" & " + str2  + " is anagram Strings");
		}else
			System.out.println(str1 +" & " + str2  + " is not anagram Strings");
	}
}
