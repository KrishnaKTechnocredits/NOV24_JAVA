//Program 2:
//
//Find the character frequency of below string
//String s = "1234534622123"
//Output: {1=2, 2=4, 3=3, 4=2, 5=1, 6=1}

package fazrana.map;

import java.util.*;

public class FAssignment93 {
	Map<Character,Integer> getCharacterFrequency(String str) {
		Map<Character,Integer> map= new HashMap<Character,Integer>();
		for(int i=0;i<str.length();i++) {
//			String ch=Character.toString(str.charAt(i));
			char ch=str.charAt(i);
			if(str.indexOf(ch)==i){
				map.put(ch, 1);
			}else {
				Integer m=map.get(ch);
				map.put(ch, (m+1));
			}
		}
		return map;
	}
	
	public static void main(String[] args) {
		String s = "1234534622123";
		System.out.println("Input: "+s);
		FAssignment93 fassignment93=new FAssignment93();
		System.out.println("Frequency of character: "+fassignment93.getCharacterFrequency(s));
	}
}
