package harish.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/**
 * Assignment - 90 : 16th jan
 * 
 * I am having students name in the array, I want to get the unique set of names
 * and wants to print first and last name of the list.
 * 
 * Input: String[] arr = {"Maulik", "Kanani", "Maulik", "Pune", "India",
 * "Pune"};
 * 
 * Output : [Maulik, Kanani, Pune, India]
 * 
 * First name of the list is -> Maulik
 * 
 * Last name of the list is -> India
 */

public class A90_UniqueSetOfNames {

	public static void main(String[] args) {
		String[] arr = { "Maulik", "Kanani", "Maulik", "Pune", "India", "Pune" };
		System.out.println("Input: " + Arrays.asList(arr));

		Set<String> uniqueNames = new LinkedHashSet<String>();

		for (String name : arr) {
			uniqueNames.add(name);
		}

		System.out.println("Unique set of names: " + uniqueNames);

		List<String> uniqueNamesList = new ArrayList<String>(uniqueNames);
		System.out.println("First name of the list is: " + uniqueNamesList.get(0));
		System.out.println("Last name of the list is: " + uniqueNamesList.get(uniqueNamesList.size() - 1));
	}
}