package Assignments_Collections_Framework_LinkedHashSet;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Assignment90 {
	
	Set<String> getSetOfUniqueNames(String[] arr){
		Set<String> setOfUniqueNames = new LinkedHashSet<String>(Arrays.asList(arr));
		
		boolean flag = false;
		String firstName = "";
		String lastName = "";
		for(String str : setOfUniqueNames) {
			if(!flag) {
				firstName = str;
				flag = true;
			}
			lastName = str;
		}
		
		System.out.println("First name of the set is -> " + firstName);
		System.out.println("Last name of the set is -> " + lastName);
		return setOfUniqueNames;
	}

	public static void main(String[] args) {
		Assignment90 assignment90 = new Assignment90();
		String[] arr = {"Maulik", "Kanani", "Maulik", "Pune", "India", "Pune"};
		System.out.println(assignment90.getSetOfUniqueNames(arr));
	}
}
