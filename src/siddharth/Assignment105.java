package siddharth;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
Assignment 105: Check for Anagram. ANAGRAM = Freq of words is same
Input: Listen, Silent
The given strings are anagrams

Input: Techno, chnott
The given strings are not anagrams

Hint: Use sorting and comparison of character arrays.
 */
public class Assignment105 {
	
	void printAnagram(String input1, String input2) {
		List<Character> ch1 = new ArrayList<Character>();
		List<Character> ch2 = new ArrayList<Character>();
		
		String input1lowercase = input1.toLowerCase();
		String input2lowercase = input2.toLowerCase();
		
		if(!(input1lowercase.length()==input2lowercase.length())) {
			System.out.println("Input : "+input1+", "+input2);
			System.out.println("Length of words is not equal, The given strings are not anagrams");
			return; //early exit
		}
		for(int i=0;i<input1lowercase.length();i++) {
			char letter1 = input1lowercase.charAt(i);
			char letter2 = input2lowercase.charAt(i);
			ch1.add(letter1);
			ch2.add(letter2);	
		}	
		
		Collections.sort(ch1); //Sorts characters in natural order
		Collections.sort(ch2);
		
		if(ch1.equals(ch2)) {
			System.out.println("Input : "+input1+", "+input2);
			System.out.println("The given strings are anagrams");
		}else if(!ch1.equals(ch2)) {
			System.out.println("Input : "+input1+", "+input2);
			System.out.println("The given strings are not anagrams");
		}
		
		System.out.println("==============================================");
	}
	
	public static void main(String[] args) {
		String input1 = "Listen";
		String input2 = "Silent";
		String input3 = "Techno";
		String input4 = "chnott";
		String input5 = "Extratest";
		String input6 = "Extraaatest";
		
		Assignment105 assignment105 = new Assignment105();
		assignment105.printAnagram(input1,input2);
		assignment105.printAnagram(input3,input4);
		assignment105.printAnagram(input5,input6);
	}
}
