/*
Assignment 92 : 17th Jan

Program 1: 

Find the word frequency of below string
String s = "hi hello good morning good evening hi bye hello"; 
Output: {hi=2, hello=2, evening=1, good=2, morning=1, bye=1}
*/

package pramod.collection;
import java.util.*;
class Assignment92{
	
	Map<String, Integer> getFrequency(String[] arr){
		List<String> list = new ArrayList<String>(Arrays.asList(arr));
		Map<String, Integer> map = new HashMap<String, Integer>();
		for(int i=0; i<list.size();i++){
			String name = list.get(i);
			if(i==list.indexOf(name)){
				map.put(name,1);
			}else
			{
				Integer value = map.get(name);
				map.put(name,(value+1));
			}
		}
		return map;
	}

	public static void main(String[] args){
		String s = "hi hello good morning good evening hi bye hello";
		System.out.println("Given String is : "+ s);
		String[] arr = s.split(" ");
		Map<String, Integer> ans = new Assignment92().getFrequency(arr);
		System.out.println("Frequency of each word is :" + ans);
	}
}