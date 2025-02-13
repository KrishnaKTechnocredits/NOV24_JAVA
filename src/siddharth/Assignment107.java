package siddharth;
/*
Assignment 107: Count Vowels in a String
Input: aaryahi
Total vowel count: 4
A → 3
I → 1
Unique vowels: 2
Hint: Use switch-case and a Scanner class for input handling.
 */

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Assignment107 {
	 void printVowelCount(String input) {
		Map<Character,Integer> map= new LinkedHashMap<Character,Integer>();
		int count=0;
		for(int i=0;i<input.length();i++) {
			char ch=input.charAt(i);
			switch(ch) {
			case'a':
				count++;
				if(!map.containsKey(ch)) {
					map.put(ch, 1);
				}else {
					map.get(ch);
					map.put(ch, map.get(ch)+1);
				}
				break;
			case'e':
				count++;
				if(!map.containsKey(ch)) {
					map.put(ch, 1);
				}else {
					map.get(ch);
					map.put(ch, map.get(ch)+1);
				}
				break;

			case'i':
				count++;
				if(!map.containsKey(ch)) {
					map.put(ch, 1);
				}else {
					map.get(ch);
					map.put(ch, map.get(ch)+1);
				}
				break;

			case'o':
				count++;
				if(!map.containsKey(ch)) {
					map.put(ch, 1);
				}else {
					map.get(ch);
					map.put(ch, map.get(ch)+1);
				}
				break;

			case'u':
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
		System.out.println("Output: "+ map);
		System.out.println("Unique vowels:"+ map.size());
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Input String");
		String input=sc.next();
		
		Assignment107 assignment107 = new Assignment107();
		assignment107.printVowelCount(input);
		
		sc.close();
	}
}