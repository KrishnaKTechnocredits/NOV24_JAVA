/*
 Assignment - 100 : 1st Feb'2025
Find out frequency of each word on user defined input. 
Hint : Use scanner class and Map.
 */

package imran.ScannerProgram;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Assignment100_FindFrequencyOfEachWord {

	void getFrequency(String data)
	{
		String[] arr = data.split(" ");
		Map<String, Integer> hm = new HashMap<String,Integer>();
		for(String word : arr)
		{
			if(!hm.containsKey(word))
			{
				hm.put(word,1);
			}
			else
			{
				int value = hm.get(word);
				value = value +1;
				hm.put(word,value);
			}
		}
		System.out.println("The Frequency of Words Present in given input string are as followes ");
		System.out.println(hm);
	}
	
	public static void main(String[] args) {
		Assignment100_FindFrequencyOfEachWord assignment100 = new Assignment100_FindFrequencyOfEachWord();
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter String you want to Count Frequency ");
		String str = sc.nextLine();
		assignment100.getFrequency(str);
		
	}

	
}
