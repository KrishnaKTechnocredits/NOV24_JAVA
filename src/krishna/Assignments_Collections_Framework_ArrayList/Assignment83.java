package Assignments_Collections_Framework_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Assignment83 {

	List<String> getDuplicateNamesList(String[] arr) {
		List<String> listOfUniqueNames = new ArrayList<String>();
		List<String> listOfDuplicateNames = new ArrayList<String>();
		for (String name : arr) {
			if (!listOfUniqueNames.contains(name)) {
				listOfUniqueNames.add(name);
			}
			else if(!listOfDuplicateNames.contains(name)) {
				listOfDuplicateNames.add(name);
			}
		}
		return listOfDuplicateNames;

	}

	public static void main(String[] args) {
		String[] arr = {"Harish", "Pramod","Harish", "Krishna", "Jeet", "Krishna"};
		System.out.println(new Assignment83().getDuplicateNamesList(arr));
	}
}
