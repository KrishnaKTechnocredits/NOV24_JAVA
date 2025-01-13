package Assignments_Collections_Framework_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Assignment84 {

	List<String> getUniqueNamesList(String[] arr) {
		List<String> listOfUniqueNames = new ArrayList<String>();
		for (String name : arr) {
			if (!listOfUniqueNames.contains(name)) {
				listOfUniqueNames.add(name);
			} 
		}
		return listOfUniqueNames;

	}

	public static void main(String[] args) {
		String[] arr = { "Harish", "Pramod", "Harish", "Krishna", "Jeet", "Krishna" };
		System.out.println(new Assignment84().getUniqueNamesList(arr));
	}
}
