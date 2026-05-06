package roshan.Map;

import java.util.*;

public class FindFrequencyOfCharUsingMap {
	void getFrequencyofchar(String Word) {
		char[] arrOfCh = Word.toCharArray(); // split given string into list of char
		Map<Character, Integer> mapList = new HashMap<>();
		int count = 0;
		for (char ch : arrOfCh) {
			if (!mapList.containsKey(ch)) {
				mapList.put(ch, 1);
			} else {
				count = mapList.get(ch);//give value ofgiven key
				mapList.put(ch, count + 1);
			}
		}
		System.out.println(mapList);
	}

	public static void main(String[] args) {
		String word = "1234534622123";
		FindFrequencyOfCharUsingMap findfrequencyofcharusingmap = new FindFrequencyOfCharUsingMap();
		findfrequencyofcharusingmap.getFrequencyofchar(word);
	}
}

/*
 * Assignment93
 * 
 * Find the character frequency of below string String s = "1234534622123"
 * Output: {1=2, 2=4, 3=3, 4=2, 5=1, 6=1}
 */