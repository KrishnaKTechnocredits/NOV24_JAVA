//Assignment - 90 : 16th jan
//I am having students name in the array, I want to get the unique set of names and wants to print first and last name of the list.
//
//String[] arr = {"Maulik", "Kanani", "Maulik", "Pune", "India", "Pune"};
//output : [Maulik, Kanani, Pune, India]
//          First name of the list is -> Maulik
//          Last name of the list is -> India

package fazrana.hashset;

import java.util.*;

public class FAssignment90 {
	void getUniqueList(String[] array){
		Set<String> set= new LinkedHashSet<String>(Arrays.asList(array));
		System.out.println("Output array: "+set);
		List<String> list= new ArrayList<String>(set);
		
		System.out.println("First name of the list is "+list.get(0));
		System.out.println("Last name of the list is "+list.get(list.size()-1));
	}
	
	public static void main(String[] args) {
		String[] arr = {"Maulik", "Kanani", "Maulik", "Pune", "India", "Pune"};
		System.out.println("Input array: "+ Arrays.toString(arr) );
		FAssignment90 fassignment90=new FAssignment90();
		fassignment90.getUniqueList(arr);
	}
}
