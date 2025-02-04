package Assignments_Collections_Framework_Map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Assignment100 {
	
	Map<String,Integer> getFreq(String str){
		Map<String,Integer> mapOfFreq = new LinkedHashMap<String, Integer>();
		String[] arr = str.split(" ");
		for(String word : arr) {
			if(mapOfFreq.containsKey(word)) {
				mapOfFreq.put(word, mapOfFreq.get(word)+1);
			}else
				mapOfFreq.put(word, 1);
		}
		return mapOfFreq;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter string");
		String str = sc.nextLine();
		System.out.println(new Assignment100().getFreq(str));
		sc.close();
	}
}
