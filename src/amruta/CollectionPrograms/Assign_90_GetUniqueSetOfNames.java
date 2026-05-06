/*
 Assignment - 90 : 16th jan
I am having students name in the array, I want to get the unique set of names and wants to print first and last name of the list.
String[] arr = {"Maulik", "Kanani", "Maulik", "Pune", "India", "Pune"};
output : [Maulik, Kanani, Pune, India]
          First name of the list is -> Maulik
          Last name of the list is -> India	
 */

package amruta.CollectionPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Assign_90_GetUniqueSetOfNames {
	public static void main(String[] args) {
		String[] arr = { "Maulik", "Kanani", "Maulik", "Pune", "India", "Pune" };
		List<String> listofNames = Arrays.asList(arr);
		System.out.println(listofNames);

		Set<String> hs = new LinkedHashSet<String>(listofNames); // Passing list into LinkedHashSet's Constructor
		System.out.println("\nSet of names --> " + hs);

		List<String> ListOfUniqueNames = new ArrayList<String>(hs); // Passing LinkedHashSet-- hs set into list's
																	// Constructor

		System.out.println("\nList of unique names --> " + ListOfUniqueNames);

		System.out.println("\nFirst name of the list is --> " + ListOfUniqueNames.get(0));
		System.out.println("\nLast name of the list is --> " + ListOfUniqueNames.get(ListOfUniqueNames.size() - 1));
	}
}