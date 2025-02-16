/*
 * Assignment - 107 : 2nd Feb'2025
Program to Check number of Vowels
Scenario: How many vowel (a, e, i, o, u) characters are there in the user defined string, print freq of each vowel.
 

input : aaryahi
putout : Total vowels count are 4
         a -> 3
         i -> 1
         Total unique vowels are 2.		
 */

package rohan;

import java.util.*;
import java.util.Scanner;

public class Assignment_107 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Give input::");
		String str = sc.next();
		str = str.toLowerCase();
		
		Map<Object,Integer> countVowel = new LinkedHashMap<>();
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
			if(countVowel.containsKey(ch)) {
				int freq = countVowel.get(ch);
				countVowel.put(ch, ++freq);
			}else {
				countVowel.put(ch, 1);
			}
			}
		}
		System.out.println(countVowel);
		int j = countVowel.size();
		System.out.println("Total unique vowels are "+j);
	}

}
