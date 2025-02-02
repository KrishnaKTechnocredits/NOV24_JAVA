package ashwini.collections;

import java.util.HashSet;
import java.util.Set;

/*
Assignment - 87 : 16th Jan
From given Set, return all the names which ends with Vowel. 

HashSet<String> hs = new HashSet<String>();
hs.add("techno");
hs.add("credits");
hs.add("rushikesh");
hs.add("krishna");

output : [techno, krishna]

for(String name : hs){
	
}
 */
public class Assignment87 {
	Set<String> getNames(Set<String> setOfNames) {
		Set<String> outputSet = new HashSet<String>();

		for (String name : setOfNames) {
			String currentchar = Character.toString(name.charAt(name.length() - 1));
			if ("aeiou".contains(currentchar)) {
				outputSet.add(name);
			}
		}
		
		return outputSet;
	}

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		hs.add("techno");
		hs.add("credits");
		hs.add("rushikesh");
		hs.add("krishna");
		Assignment87 a87=new Assignment87();
		Set<String> outputSet=a87.getNames(hs);
		System.out.println(hs);
		System.out.println(outputSet);
		
	}
}
