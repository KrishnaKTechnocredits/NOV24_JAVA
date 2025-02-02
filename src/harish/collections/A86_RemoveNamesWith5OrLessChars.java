package harish.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * Assignment - 86: 14th Jan
 * 
 * Remove all the names from list having length less than or equal to 5
 * characters.
 * 
 * Input : ["Aaruhi","Ansh", "Akanksha", "Eva", "Kishor"]
 * 
 * Output : ["Aaruhi", "Akanksha", "Kishor"]
 */

public class A86_RemoveNamesWith5OrLessChars {

	private static List<String> getNamesWithFiveOrLessChars(String[] input) {
		// add all elements of a string array to List
		List<String> allNames = new ArrayList<String>(Arrays.asList(input));

		Iterator<String> iterator = allNames.iterator();
		// using an iterator to iterate over the list as during iteration it allows
		// removing elements
		while (iterator.hasNext()) {
			if (iterator.next().length() <= 5) {
				iterator.remove();
			}
		}
		return allNames;
	}

	public static void main(String[] args) {
		String[] input = { "Aaruhi", "Ansh", "Akanksha", "Eva", "Kishor" };
		System.out.println("Input : " + Arrays.toString(input));
		System.out.println("Names having length less than or equals to 5 are - "
				+ A86_RemoveNamesWith5OrLessChars.getNamesWithFiveOrLessChars(input));
	}
}