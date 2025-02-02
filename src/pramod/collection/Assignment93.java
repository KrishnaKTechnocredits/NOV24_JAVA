/*
Assignment 93
Find the character frequency of below string
String s = "1234534622123"
Output: {1=2, 2=4, 3=3, 4=2, 5=1, 6=1}
*/

package pramod.collection;
import java.util.*;
class Assignment93{

	Map<Character, Integer> getFrequency(String s){
		Map<Character,Integer> map = new HashMap<Character, Integer>();
		List<Character> list = new ArrayList<Character>();
		for(int i=0; i<s.length(); i++){
			char ch = s.charAt(i);
			list.add(ch);
		}
		for(int i=0; i<list.size(); i++){
			char ch = list.get(i);
			if(i==list.indexOf(ch)){
				map.put(ch,1);
			}else
			{
				Integer value = map.get(ch);
				map.put(ch,(value+1));
			}
		}
		return map;
		
	}

	public static void main(String[] args){
		String s = "1234534622123";
		System.out.println("Given string is: "+ s);
		Map<Character, Integer> ans = new Assignment93().getFrequency(s);
		System.out.println("Frequency of each character is: "+ ans);
	}
}