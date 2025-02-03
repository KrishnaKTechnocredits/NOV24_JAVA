package vrushali.collection;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

//Assignment - 90 : 16th jan
//I am having students name in the array, I want to get the unique set of names and wants to print first and last name of the list.
//
//String[] arr = {"Maulik", "Kanani", "Maulik", "Pune", "India", "Pune"};
//output : [Maulik, Kanani, Pune, India]
//          First name of the list is -> Maulik
//          Last name of the list is -> India

public class GetUniqueNameSetAndPrintFirstAndLast90 {

	Set<String> getUniqueNameSet(String[] nameArray) {
		Set<String> uniqueNameSet = new LinkedHashSet<String>(Arrays.asList(nameArray));
		return uniqueNameSet;
	}

	public static void main(String[] args) {
		GetUniqueNameSetAndPrintFirstAndLast90 getUniqueNameSetAndPrintFirstAndLast90 = new GetUniqueNameSetAndPrintFirstAndLast90();
		String[] arr = { "Maulik", "Kanani", "Maulik", "Pune", "India", "Pune" };
		Set<String> uniqueNameSet = getUniqueNameSetAndPrintFirstAndLast90.getUniqueNameSet(arr);
		System.out.println("Unique Name Set " + uniqueNameSet);
		Iterator<String> itr = uniqueNameSet.iterator();
		int i = 0;
		while (itr.hasNext()) {
			if (i == 0) {
				//TO print First Name
				System.out.println("First Name Of The Set is :-- " + itr.next());
			} else if (i == uniqueNameSet.size() - 1) {
				//To print Last name
				System.out.println("Last Name Of The Set is :-- " + itr.next());
			} else {
				//remaining names we dont want to print
				itr.next();
			}
			i++;
		}
	}
}
