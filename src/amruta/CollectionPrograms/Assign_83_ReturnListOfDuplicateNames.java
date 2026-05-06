/*
 * Assignment - 83: 12th Jan
Return the list of duplicate names from given Array. [IMP]

String[] arr = {"Harish", "Pramod","Harish", "Krishna", "Jeet", "Krishna"};
output : ["Harish", "Krishna"]
 */

package amruta.CollectionPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Assign_83_ReturnListOfDuplicateNames {

	// Logic 1
	ArrayList<String> returnListOfDuplicateNames(String[] arr) {
		List<String> list = Arrays.asList(arr); // Convert Array to List & list is Read-Only list

		ArrayList<String> listOfDuplicateNames = new ArrayList<String>();

		for (int index = 0; index < list.size(); index++) {
			String str = list.get(index);
			int firstIndex = list.indexOf(str);
			int lastIndex = list.lastIndexOf(str);

			if (firstIndex != lastIndex && index == firstIndex) { // check num is duplicate or Not and It should
																	// processed only once
				listOfDuplicateNames.add(str);
			}
		}
		return listOfDuplicateNames;
	}

	// Logic 2
	void getListOfDuplicateElements(String[] arr) {
		ArrayList<String> uniqueList = new ArrayList<String>();
		ArrayList<String> duplicateList = new ArrayList<String>();

		for (int index = 0; index < arr.length; index++) {
			if (!uniqueList.contains(arr[index]))
				uniqueList.add(arr[index]);
			else if (!duplicateList.contains(arr[index]))
				duplicateList.add(arr[index]);
		}
		System.out.println("\nList of duplicate Names - " + duplicateList);
	}

	public static void main(String[] args) {

		String[] arr = { "Harish", "Pramod", "Harish", "Krishna", "Jeet", "Krishna" };

		System.out.println("Original list - " + Arrays.toString(arr));

		Assign_83_ReturnListOfDuplicateNames a83 = new Assign_83_ReturnListOfDuplicateNames();
		List<String> listOfDuplicateNames = a83.returnListOfDuplicateNames(arr);
		System.out.println("\nList of duplicate Names - " + listOfDuplicateNames);

		a83.getListOfDuplicateElements(arr);
	}
}
