package kishor;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

//Find out frequency of each word on user defined input. 
//Hint : Use scanner class and Map.

public class Assignment100_Scanner_freq {
	
	static Map<String,Integer> getFrequency(String[] arr){
		Map<String,Integer> map = new LinkedHashMap<String,Integer>();
		
		for(int i=0;i<arr.length;i++) {
			String word= arr[i];
			if(!map.containsKey(word)) {
				map.put(word, 1);
			}
			else {
				int count= map.get(word);
				map.put(word, count+1);
			}
		}
		return map;
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your string");
		
		String words= sc.nextLine();
		String[] arr= words.split(" ");
		
		Map<String,Integer> map=getFrequency(arr);
		System.out.println(map);
		sc.close();
	}
}
