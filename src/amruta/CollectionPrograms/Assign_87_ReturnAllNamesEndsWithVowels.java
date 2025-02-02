/*
 * Assignment - 87 : 16th Jan
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

package amruta.CollectionPrograms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Assign_87_ReturnAllNamesEndsWithVowels {

	List<String> returnListOfNamesEndWithVowels_logic1(Set<String> hs) {

		ArrayList<String> listOfNames = new ArrayList<String>();

		// Iterate Set
		for (String name : hs) {

			int lastChar = name.length() - 1;
			if (name.charAt(lastChar) == 'A' || name.charAt(lastChar) == 'E' || name.charAt(lastChar) == 'I'
					|| name.charAt(lastChar) == 'O' || name.charAt(lastChar) == 'U') {
				listOfNames.add(name);
			} else if (name.charAt(lastChar) == 'a' || name.charAt(lastChar) == 'e' || name.charAt(lastChar) == 'i'
					|| name.charAt(lastChar) == 'o' || name.charAt(lastChar) == 'u') {
				listOfNames.add(name);
			}

		}
		return listOfNames;
	}
	
	List<String> returnListOfNamesEndWithVowels_logic2(Set<String> hs) {

		ArrayList<String> listOfNames = new ArrayList<String>();

		// Iterate Set
		for (String name : hs) {
			String vowel = "aeiou";
			String lastChar =  Character.toString(name.charAt(name.length() - 1));
			if(vowel.contains(lastChar))
				listOfNames.add(name);
		}
		return listOfNames;
	}

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		hs.add("techno");
		hs.add("credits");
		hs.add("rushikesh");
		hs.add("krishna");

		Assign_87_ReturnAllNamesEndsWithVowels a87 = new Assign_87_ReturnAllNamesEndsWithVowels();
		List<String> li = a87.returnListOfNamesEndWithVowels_logic1(hs);
		System.out.println("List of all the names which ends with Vowel" + li);
		
		List<String> li2 = a87.returnListOfNamesEndWithVowels_logic2(hs);
		System.out.println("List of all the names which ends with Vowel" + li2);
	}
}
