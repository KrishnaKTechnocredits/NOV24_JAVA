
//🔹 Assignment 107: Count Vowels in a String
//📥 Input: aaryahi
//📊 Total vowel count: 4
//🅰️ a → 3
//ℹ️ i → 1
//🔢 Unique vowels: 2
//
//💡 Hint: Use switch-case and a Scanner class for input handling.


package fazrana.switchCase;

import java.util.*;
import java.util.Scanner;

public class FAssignment107 {
	static void getVowelCount() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Input String");
		String str=sc.next();
		sc.close();
		Map<Character,Integer> map= new LinkedHashMap<Character,Integer>();
		int count=0;
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
//			boolean bool=map.containsKey(ch);
			switch(ch) {
				case 'a':
					count++;
					if(!map.containsKey(ch)) {
						map.put(ch, 1);
					}else {
						map.get(ch);
						map.put(ch, map.get(ch)+1);
					}
					break;
				case 'e':
					count++;
					if(!map.containsKey(ch)) {
						map.put(ch, 1);
					}else {
						map.get(ch);
						map.put(ch, map.get(ch)+1);
					}
					break;
					
				case 'i':
					count++;
					if(!map.containsKey(ch)) {
						map.put(ch, 1);
					}else {
						map.get(ch);
						map.put(ch, map.get(ch)+1);
					}
					break;
					
				case 'o':
					count++;
					if(!map.containsKey(ch)) {
						map.put(ch, 1);
					}else {
						map.get(ch);
						map.put(ch, map.get(ch)+1);
					}
					break;
					
				case 'u':
					count++;
					if(!map.containsKey(ch)) {
						map.put(ch, 1);
					}else {
						map.get(ch);
						map.put(ch, map.get(ch)+1);
					}
					break;
			}
		}
		System.out.println("Total vowel count:"+ count);
		System.out.println("output: "+ map);
		System.out.println("Unique vowels:"+ map.size());
	}
	
	public static void main(String[] args) {
		getVowelCount();
	}
}
