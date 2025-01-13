package harish.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Assignment - 84: 12th Jan
 * 
 * Return the list of unique names from given Array. [IMP]
 * 
 * Input : String[] arr = {"Harish", "Pramod","Harish", "Krishna", "Jeet",
 * "Krishna"};
 * 
 * Output : ["Harish", "Pramod", "Krishna", "Jeet"]
 */

public class ListOfUniqueNames {

	private static List<String> getUniqueNamesList(String[] input) {

		// placing elements from String array to List of String to leverage features of
		// List/ArrayList
		List<String> originalList = new ArrayList<String>(Arrays.asList(input));

		List<String> uniqueNamesList = new ArrayList<String>();

		// use of enhanced for loop to iterate all elements from originalList
		for (String name : originalList) {
			if (!uniqueNamesList.contains(name)) {
				uniqueNamesList.add(name);
			}
		}
		return uniqueNamesList;
	}

	public static void main(String[] args) {
		String[] input = { "Harish", "Pramod", "Harish", "Krishna", "Jeet", "Krishna" };
		System.out.println("Input : " + Arrays.toString(input));
		System.out.println("Output : " + ListOfUniqueNames.getUniqueNamesList(input));
	}
}