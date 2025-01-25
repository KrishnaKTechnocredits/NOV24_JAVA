package harish.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Assignment - 87 : 16th Jan
 * 
 * From given Set, return all the names which ends with Vowel.
 * 
 * HashSet<String> hs = new HashSet<String>(); hs.add("techno");
 * hs.add("credits"); hs.add("rushikesh"); hs.add("krishna");
 * 
 * Output : [techno, krishna]
 */

public class Assignment87 {

	private static Set<String> getNamesEndingWithVowel(Set<String> setOfNames) {
		// declare a set to hold output
		Set<String> processedNames = new HashSet<String>();
		// create a list of all the vowels
		List<Character> vowels = new ArrayList<Character>();
		vowels.add('a');
		vowels.add('e');
		vowels.add('i');
		vowels.add('o');
		vowels.add('u');
		// iterate all the names in given set
		for (String name : setOfNames) {
			// check if last character of the given name is a vowel
			if (vowels.contains(Character.toLowerCase(name.charAt(name.length() - 1)))) {
				processedNames.add(name);
			}
		}
		return processedNames;
	}

	public static void main(String[] args) {
		Set<String> setOfNames = new HashSet<String>();
		setOfNames.add("techno");
		setOfNames.add("credits");
		setOfNames.add("rushikesh");
		setOfNames.add("krishna");

		System.out.println("Input - " + setOfNames);

		Set<String> namesEndingWithVowel = Assignment87.getNamesEndingWithVowel(setOfNames);

		System.out.println("Names ending with vowel are - " + namesEndingWithVowel);
	}
}