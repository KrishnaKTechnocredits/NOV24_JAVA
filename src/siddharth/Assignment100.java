package siddharth;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/*
Assignment - 100 : 1st Feb'2025
Find out frequency of each word on user defined input. 
Hint : Use scanner class and Map.
 */
public class Assignment100 {
	
	void getFreqOfWords(String[] input){
		Map<String, Integer> map = new HashMap<String, Integer>();
		List<String> words = new ArrayList<String>(Arrays.asList(input));
		for(int i=0;i<input.length;i++) {
			String word = words.get(i);
			if(!map.containsKey(word)) {
				map.put(word, 1);
			}else {
				int value = map.get(word) + 1;
				map.put(word, value);
			}
		}
		System.out.println(map);
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Sentence");
		String input = sc.nextLine(); //next() reads only 1 word
		String[] arr = input.split(" ");
		Assignment100 assignment100 = new Assignment100();
		assignment100.getFreqOfWords(arr);
		
		sc.close();
	}
}
