package kishor;

import java.util.LinkedHashMap;
import java.util.Map;

//🔹 Assignment 105: Check for Anagram
//📥 Input: Listen, Silent
//✅ The given strings are anagrams
//📥 Input: Techno, chnott
//❌ The given strings are not anagrams
//💡 Hint: Use sorting and comparison of character arrays.

public class Assignment105_Anagram_Collection {
	
	static Map<Character,Integer> getFrequency(String str){
		Map<Character,Integer> map= new LinkedHashMap<Character,Integer>();
		
		for(int i=0;i<str.length();i++) {
			char ch= str.charAt(i);
			if(!map.containsKey(ch)) {
				map.put(ch, 1);
			}
			else {
				int count= map.get(ch);
				map.put(ch, count+1);
			}
		}
		return map;
	}
	
	public static void main(String[] args) {
		String word1="Listen".toLowerCase();
		String word2="Silent".toLowerCase();
		
		Map<Character,Integer> map=getFrequency(word1);
		Map<Character,Integer> map1=getFrequency(word2);
		
		if(map.equals(map1)) {
			System.out.println("Strings is anagram");
		}
		else {
			System.out.println("Strings is not anagram");
		}
	}
}
