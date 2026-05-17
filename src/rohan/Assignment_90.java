/*
 * Assignment - 90 : 16th jan
I am having students name in the array, I want to get the unique set of names and wants to print first and 
last name of the list.

String[] arr = {"Maulik", "Kanani", "Maulik", "Pune", "India", "Pune"};
output : [Maulik, Kanani, Pune, India]
          First name of the list is -> Maulik
          Last name of the list is -> India	

 */

package rohan;

import java.util.*;

public class Assignment_90 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr = { "Maulik", "Kanani", "Maulik", "Pune", "India", "Pune" };

		Set<String> getStr1 = new LinkedHashSet<>(Arrays.asList(arr));
		System.out.println(getStr1);

		List<String> getUniqueName = new ArrayList<String>(getStr1);
		System.out.println("First name of List is -> " + (getUniqueName.get(0)));
		int L = getUniqueName.size() - 1;
		System.out.println("Last name of List is -> " + (getUniqueName.get(L)));

	}

}
