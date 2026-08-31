package prem;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Assignment105 {

	void checkAnagram(String str1, String str2) {
		char[] word1 = str1.toCharArray();
		char[] word2 = str2.toCharArray();
		Arrays.sort(word1);
		Arrays.sort(word2);
		System.out.println(Arrays.equals(word1, word2));
	
	
	HashMap<Character, Integer> output1 = new HashMap<Character, Integer>();
	
	for(char ch: str1.toCharArray()) {
		output1.put(ch, output1.getOrDefault(ch, 0) + 1);
	}
	System.out.println(output1);
	
	HashMap<Character, Integer>  output2 = new HashMap<Character, Integer> ();
	for(char ch: str2.toCharArray()) {
		output2.put(ch, output2.getOrDefault(ch, 0) + 1);
	}
	System.out.println(output2);
	System.out.println(output1.equals(output2));
	
	for(char ch: output1.keySet()) {
		if(output1.get(ch)==output2.get(ch)) {
			System.out.println(output1.get(ch));				}
	}
	}
	public static void main(String[] args) {
		String str1 = "listen";
		String str2 = "silent";
		Assignment105 assign105 = new Assignment105();
		assign105.checkAnagram(str1, str2);
	}

}