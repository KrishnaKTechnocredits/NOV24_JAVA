/*
 * Assignment - 84: 12th Jan
Return the list of unique names from given Array. [IMP]

String[] arr = {"Harish", "Pramod","Harish", "Krishna", "Jeet", "Krishna"};
output : ["Harish", "Pramod", "Krishna", "Jeet"]
 */

package amruta.CollectionPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Assign_84_ReturnListOfUniqueNames {
	
	ArrayList<String> returnListOfUniqueNames(String[] arr) {
		List<String> list = Arrays.asList(arr); // Convert Array to List & list is Read-Only list

		ArrayList<String> listOfUniqueNames = new ArrayList<String>();

		for (int index = 0; index < list.size(); index++) {
			String str = list.get(index);
			int firstIndex = list.indexOf(str);
			int lastIndex = list.lastIndexOf(str);

			if (firstIndex == lastIndex) {
				listOfUniqueNames.add(str);
			}
		}
		return listOfUniqueNames;
	}

	public static void main(String[] args) {

		String[] arr = { "Harish", "Pramod", "Harish", "Krishna", "Jeet", "Krishna" };

		System.out.println("Original list - " + Arrays.toString(arr));

		Assign_84_ReturnListOfUniqueNames a84 = new Assign_84_ReturnListOfUniqueNames();
		List<String> listOfUniqueNames = a84.returnListOfUniqueNames(arr);
		System.out.println("\nList of unique Names - " + listOfUniqueNames);
	}
}
