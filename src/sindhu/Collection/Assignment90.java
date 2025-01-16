/*I am having students name in the array, I want to get the unique set of names and wants to print first and last name of the list.

String[] arr = {"Maulik", "Kanani", "Maulik", "Pune", "India", "Pune"};
output : [Maulik, Kanani, Pune, India]
          First name of the list is -> Maulik
          Last name of the list is -> India	*/

package sindhu.Collection;

import java.util.*;

public class Assignment90 {
	public static void main(String[] args) {
		Assignment90 a90 = new Assignment90();
		String[] arr = {"Maulik", "Kanani", "Maulik", "Pune", "India", "Pune"};
		System.out.println("Input array is: "+Arrays.toString(arr));
		
		LinkedHashSet<String> lhs = new LinkedHashSet<String>(Arrays.asList(arr));
		System.out.println("Unique string list from input array: "+lhs);
		
		a90.getFirstLastNames(lhs);
	}

	public void getFirstLastNames(LinkedHashSet<String> lhs) {
		ArrayList<String> al = new ArrayList<String>(lhs);
		String firstName = al.get(0);
		String lastName = al.get(al.size()-1);
		System.out.println("The first name is the list is: "+firstName);
		System.out.println("The last name is the list is: "+lastName);
	}
}
