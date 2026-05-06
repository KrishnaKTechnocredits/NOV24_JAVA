//Assignment - 90 : 16th jan  liskedhashset
//I am having students name in the array, I want to get the unique set of names and wants to print first and last name of the list.
//
//String[] arr = {"Maulik", "Kanani", "Maulik", "Pune", "India", "Pune"};
//output : [Maulik, Kanani, Pune, India]
//          First name of the list is -> Maulik
//          Last name of the list is -> India	
package komal.Collection.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Assignment90 {

	void getName() {
		String[] arr = { "Maulik", "Kanani", "Maulik", "Pune", "India", "Pune" };

		List<String> list = Arrays.asList(arr);

		Set<String> set = new LinkedHashSet<String>(list);

		List<String> newlist = new ArrayList<String>(set);
		System.out.println("First name of the list is => " + newlist.get(0));
		System.out.println("Last name of the list is => " + newlist.get(newlist.size() - 1));

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new Assignment90().getName();

	}

}
