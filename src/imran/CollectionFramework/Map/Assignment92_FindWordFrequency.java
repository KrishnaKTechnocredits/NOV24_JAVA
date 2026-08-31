/*
Assignment 89 : 17th Jan

Program 1: 

Find the word frequency of below string
String s = "hi hello good morning good evening hi bye hello"; 
Output: {hi=2, hello=2, evening=1, good=2, morning=1, bye=1}
*/

package imran.CollectionFramework.Map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Assignment92_FindWordFrequency {

	void getFrequency(String data)
	{
		String[] str = data.split(" ");
		List<String> list1 = Arrays.asList(str);
		Map<String,Integer> elementFrequency = new HashMap<String,Integer>();
		for(String ele : list1)
		{
			if(!elementFrequency.containsKey(ele))
			{
				elementFrequency.put(ele,1);
			}
			else
			{
				int value = elementFrequency.get(ele) + 1;
				elementFrequency.put(ele,value);
			}
		}
		System.out.println(" The Frequency of each word in string is : " + elementFrequency);
	}
	
	public static void main(String[] args) {
		
		Assignment92_FindWordFrequency assignment92_1 = new Assignment92_FindWordFrequency();
		Scanner sc = new Scanner(System.in);
		String s = "hi hello good morning good evening hi bye hello";
		System.out.println("The Given String is : " + s);
		assignment92_1.getFrequency(s);	
		System.out.println("Please Enter String to Calculate words Frequency");
		String data = sc.nextLine();
		assignment92_1.getFrequency(data);
	}
	
}
