/*
Assignment 89 : 17th Jan

Program 1: 

Find the character frequency of below string
String s = "1234534622123"
Output: {1=2, 2=4, 3=3, 4=2, 5=1, 6=1}
*/

package imran.CollectionFramework.Map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Assignment93_FindCharacterFrequencyinString {

	void getFrequency(String data)
	{
		String[] str = data.split("");
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
		System.out.println(" The Frequency of each character in string is : " + elementFrequency);
	}
	
	public static void main(String[] args) {
		Assignment93_FindCharacterFrequencyinString assignment93_1 = new Assignment93_FindCharacterFrequencyinString();
		Scanner sc = new Scanner(System.in);
		String s = "1234534622123";
		System.out.println("The Given String is : " + s);
		assignment93_1.getFrequency(s);		
		System.out.println("Please Enter String to Calculate words Frequency");
		String data = sc.nextLine();
		assignment93_1.getFrequency(data);
	}
}
