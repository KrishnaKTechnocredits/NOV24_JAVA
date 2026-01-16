/*
 * Assignment - 87 : 16th Jan
From given Set, return all the names which ends with Vowel. 

HashSet<String> hs = new HashSet<String>();
hs.add("techno");
hs.add("credits");
hs.add("rushikesh");
hs.add("krishna");

output : [techno, krishna]
 */

package rohan;

import java.util.*;

public class Assignment_87 {
	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		hs.add("techno");
		hs.add("credits");
		hs.add("rushikesh");
		hs.add("krishna");
		hs.add("krishna");
		// System.out.println(hs);
		Assignment_87 assignment = new Assignment_87();
		assignment.getStringSet(hs);

	}

	Set<String> getStringSet(Set<String> hs) {
		Set<String> outStringSet = new HashSet<String>();
		for (String name : hs) {
			// System.out.println(name);
			char ch = name.charAt(name.length() - 1);
			if ("aeiou".indexOf(ch) != -1) {
				outStringSet.add(name);
			}
		}
		System.out.println(outStringSet);
		return outStringSet;
	}
}
