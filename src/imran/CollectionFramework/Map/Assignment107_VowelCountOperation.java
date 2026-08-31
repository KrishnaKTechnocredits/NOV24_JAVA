package imran.CollectionFramework.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Assignment107_VowelCountOperation {

	void processVowel(String data)
	{
		String str = data.replace(" ", "");
		str = str.toLowerCase();
		Map<Character,Integer> hm = new HashMap<Character,Integer>();
		System.out.println(str);
		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			if(!hm.containsKey(ch))
			{
				hm.put(ch,1);
			}
			else
			{
				int value = hm.get(ch)+1;
				hm.put(ch,value);
			}
		}
		System.out.println(hm);
		Scanner sc = new Scanner(System.in);
		System.out.println("Press A: for Total number of Vowel count");
		System.out.println("Press B: for Total number of frequency of vowel present in the string");
		System.out.println("Press C: for Total number of unique Vowel present");
		String ch = sc.next();
		
		switch(ch)
		{
			case "A": 
					int totalVowel = countvowel(hm);
					System.out.println("Total Number of Vowel present is: "+ totalVowel);
					break;
					
			case "B":
					Map<Character,Integer> frequency = countfrequency(hm);;
					System.out.println(frequency);
					break;
					
			case "C":
					int uniquevowelcount = countuniquevowel(hm);
					System.out.println(uniquevowelcount);
					break;
					
			default :
					System.out.println(" wrong choice");
		}
	}
	
	int countvowel(Map<Character,Integer> map1)
	{
		int value=0;
		char[] arr = { 'a','e','i','o','u'};
		for(int i =0; i<arr.length;i++)
		{
			char ch = arr[i];
			if(map1.containsKey(ch))
			{
				int keyValue = map1.get(ch);
				value = value + keyValue;
			}
		}
		return value;
	}
	
	Map<Character,Integer> countfrequency(Map<Character,Integer> map1)
	{
		Map<Character,Integer> vowelmap = new HashMap<Character,Integer>();
		char[] arr = { 'a','e','i','o','u'};
		for(int i =0; i<arr.length;i++)
		{
			char ch = arr[i];
			if(map1.containsKey(ch))
			{
				int value = map1.get(ch);
				vowelmap.put(ch, value);
			}
		}
		return vowelmap;
	}
		
	int countuniquevowel(Map<Character,Integer> map1)
	{
		int value=0;
		char[] arr = { 'a','e','i','o','u'};
		for(int i =0; i<arr.length;i++)
		{
			char ch = arr[i];
			if(map1.containsKey(ch))
			{
				value = value+1;
			}
		}
		return value;
	}
	
	public static void main(String[] args) {
		Assignment107_VowelCountOperation assignment107 = new Assignment107_VowelCountOperation();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The String you want to process vowel");
		String str = sc.nextLine();
		assignment107.processVowel(str);
		sc.close();
	}
}
