/*
Assignment - 87 : 16th Jan
From given Set, return all the names which ends with Vowel. 

HashSet<String> hs = new HashSet<String>();
hs.add("techno");
hs.add("credits");
hs.add("rushikesh");
hs.add("krishna");

output : [techno, krishna]
*/
package imran.CollectionFramework.Set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Assignment87_ReturnNameEndWithVowel {

	List<String> returnNameEndWithVowel(Set<String> data)
	{
		List<String> l1 = new ArrayList<String>();
		for(String name : data)
		{
			String ch = Character.toString(name.charAt(name.length()-1));
			if("aeiou".contains(ch))
			{
				l1.add(name);
			}
		}
		return l1;
	}
	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		hs.add("techno");
		hs.add("credits");
		hs.add("rushikesh");
		hs.add("krishna");
		System.out.println(" The Given HashSet is : " + hs);
		Assignment87_ReturnNameEndWithVowel assignment87_ReturnNameEndWithVowel_1 = new Assignment87_ReturnNameEndWithVowel();
		List<String> l1 = assignment87_ReturnNameEndWithVowel_1.returnNameEndWithVowel(hs);
		System.out.println(" The Resulting names end with vowel are " + l1);
	}
}
