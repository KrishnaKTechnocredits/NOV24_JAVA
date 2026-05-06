//Assignment - 100 : 1st Feb'2025
//Find out frequency of each word on user defined input. 
//Hint : Use scanner class and Map.

package fazrana.scanner;

import java.util.*;
import java.util.Scanner;

public class FAssignment100 {
	
	Map<String, Integer> getFrequency(){
		Map<String,Integer> map=new HashMap<String,Integer>();
		Scanner scanner= new Scanner(System.in);
		
		System.out.println("Input value:");
		String str=scanner.nextLine();
		scanner.close();
		String[] array= str.split(" ");
		List<String> list=new ArrayList<String>(Arrays.asList(array));
		for(String s:list) {
			if(!map.containsKey(s)) {
				map.put(s, 1);
			}else {
				int i=map.get(s);
				map.put(s, i+1);
			}
		}
		return map;
	}
	public static void main(String[] args) {
		FAssignment100 fassignment100=new FAssignment100();
		System.out.println(fassignment100.getFrequency());
	}
}
