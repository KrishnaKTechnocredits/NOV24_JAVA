package AssignmentDemoCode;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Assignment107 {
	
	Map<Character,Integer> getFreqOfVowels(String str){
		int totalVowelCount = 0;
		int totalUniqueVowelCount = 0;
		Map<Character , Integer> mapOfVowels = new LinkedHashMap<Character, Integer>();
		Map<Character, Integer> mapOfFreq = new LinkedHashMap<Character, Integer>();
		char[] arr = str.toCharArray();
		for(char ch:arr) {
			if(mapOfFreq.containsKey(ch)) {
				mapOfFreq.put(ch, mapOfFreq.get(ch)+1);
			}else
				mapOfFreq.put(ch, 1);
		}
		
		System.out.println(mapOfFreq);
		
		for(char ch:mapOfFreq.keySet()) {
			if(ch == 'a'|| ch== 'e'||ch == 'i'|| ch=='o'||ch=='u') {
				mapOfVowels.put(ch, mapOfFreq.get(ch));
				totalVowelCount += mapOfFreq.get(ch);
				totalUniqueVowelCount++;
			}
		}
		System.out.println(totalUniqueVowelCount+ " total unique vowel count");
		System.out.println(totalVowelCount + " total vowel count");
		return mapOfVowels;
	}

	public static void main(String[] args) {
		Assignment107 test = new Assignment107();
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter string");
		String word = sc.next();
		
		Map<Character, Integer> map = test.getFreqOfVowels(word);
		
		if(map.size()>1) {
			System.out.println(map + " vowels with freq in word");
		}else
			System.out.println(map + " vowel with freq in word");
	}
}
