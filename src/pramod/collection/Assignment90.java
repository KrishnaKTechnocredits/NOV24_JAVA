/*
Assignment - 90 : 16th jan
I am having students name in the array, I want to get the unique set of names and wants to print first and last name of the list.

String[] arr = {"Maulik", "Kanani", "Maulik", "Pune", "India", "Pune"};
output : [Maulik, Kanani, Pune, India]
          First name of the list is -> Maulik
          Last name of the list is -> India
		  
*/

package pramod.collection;
import java.util.*;
class Assignment90{

	void uniqueSetNames(String[] arr){
		Set<String> hs = new LinkedHashSet<String>();
		String lastName=null;
		for(String name : arr){
			if(!hs.contains(name)){
				hs.add(name);
				lastName=name;
			}
		}
		System.out.println("Unique names are: "+ hs);
		System.out.println("First name of the list is ->"+hs.iterator().next());
		System.out.println("Last name of the list is ->"+lastName);
	}

	public static void main(String[] args){
		String[] arr = {"Maulik", "Kanani", "Maulik", "Pune", "India", "Pune"};
		System.out.println("Given String array is: "+ Arrays.toString(arr));
		new Assignment90().uniqueSetNames(arr);
	}
}