package anuja.anuja_interview;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//Find out frequency of each word on user defined input. 
//Hint : Use scanner class and Map.

public class Assignment100useScanner {
	
	public static void main(String[] args) {
		Assignment100useScanner obj = new Assignment100useScanner();

		Scanner sc = new Scanner(System.in);
		System.out.println("Input String is");
		String str = sc.nextLine().trim();
		System.out.println("------------------------");
		obj.findFreqUseMap(str);
		sc.close();
	}

	private void findFreqUseMap(String inputStr) {
		Map<Character , Integer> mapOfFreqAndChar = new HashMap<Character , Integer>();
		
		for(Character ch : inputStr.toCharArray()) {
		if(mapOfFreqAndChar.containsKey(ch)) {
			mapOfFreqAndChar.put(ch, mapOfFreqAndChar.get(ch)+1);
		}else{
			mapOfFreqAndChar.put(ch, 1);
		}
		}
		
		System.out.println("Output Map is "+"\n");
		for(Map.Entry<Character, Integer> entry : mapOfFreqAndChar.entrySet()) {
		System.out.println(entry.getKey()+"--->" +entry.getValue());
		}
	}

}
