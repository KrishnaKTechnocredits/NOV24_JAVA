package ashwini.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/*
 Assignment - 90 : 16th jan
I am having students name in the array, I want to get the unique set of names and wants to print first and last name of the list.

String[] arr = {"Maulik", "Kanani", "Maulik", "Pune", "India", "Pune"};
output : [Maulik, Kanani, Pune, India]
          First name of the list is -> Maulik
          Last name of the list is -> India	

 */
public class Assignment90 {
	public static void main(String[] args) {
		String[] arr = { "Maulik", "Kanani", "Maulik", "Pune", "India", "Pune" };
		List<String> listofNames = Arrays.asList(arr);
		System.out.println(listofNames);

		Set<String> hs = new LinkedHashSet<String>(listofNames);
		System.out.println(hs);

		List<String> setOfUniqueNames = new ArrayList<String>(hs);
		System.out.println(" First name of the list is ->" + setOfUniqueNames.get(0));
		System.out.println(" Last name of the list is ->" + setOfUniqueNames.get(setOfUniqueNames.size() - 1));
	}
}
