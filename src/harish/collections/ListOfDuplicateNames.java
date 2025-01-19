package harish.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Assignment - 83: 12th Jan
 * 
 * Return the list of duplicate names from given Array. [IMP]
 * 
 * Input : String[] arr = {"Harish", "Pramod","Harish", "Krishna", "Jeet",
 * "Krishna"};
 * 
 * Output : ["Harish", "Krishna"]
 */

public class ListOfDuplicateNames {

	private static List<String> getDuplicateNames(String[] input) {

		// placing elements from String array to List of String to leverage features of
		// List/ArrayList
		List<String> originalList = new ArrayList<String>(Arrays.asList(input));

		List<String> duplicateNamesList = new ArrayList<String>();

		// use of enhanced for loop to iterate all elements from originalList
		for (String name : originalList) {
			if (originalList.indexOf(name) != originalList.lastIndexOf(name) && !duplicateNamesList.contains(name)) {
				duplicateNamesList.add(name);
			}
		}
		return duplicateNamesList;
	}

	public static void main(String[] args) {
		String[] input = { "Harish", "Pramod", "Harish", "Krishna", "Jeet", "Krishna" };
		System.out.println("Input : " + Arrays.toString(input));
		System.out.println("Output : " + ListOfDuplicateNames.getDuplicateNames(input));
	}
}