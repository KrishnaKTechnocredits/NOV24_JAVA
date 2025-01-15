//Assignment - 87 : 16th Jan
//From given Set, return all the names which ends with Vowel. 
//
//HashSet<String> hs = new HashSet<String>();
//hs.add("techno");
//hs.add("credits");
//hs.add("rushikesh");
//hs.add("krishna");
//
//output : [techno, krishna]


package fazrana.hashset;

import java.util.*;

public class FAssignment87 {
	Set<String> getValueWithEndVowel(Set<String> set){
		Set<String> output=new HashSet<String>();
		for(String val:set) {
			char ch= val.charAt(val.length()-1);
			String str= Character.toString(ch);
			if("aeiou".contains(str)) {
				output.add(val);
			}
		}
		return output;
	}
	
	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		hs.add("techno");
		hs.add("credits");
		hs.add("rushikesh");
		hs.add("krishna");
		System.out.println("Input:"+hs);
		FAssignment87 fassignment87= new FAssignment87();
		System.out.println("Output: "+fassignment87.getValueWithEndVowel(hs));
	}
}
