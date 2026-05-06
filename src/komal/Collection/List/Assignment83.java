//Assignment - 83: 12th Jan
//Return the list of duplicate names from given Array. [IMP]
//
//String[] arr = {"Harish", "Pramod","Harish", "Krishna", "Jeet", "Krishna"};
//output : ["Harish", "Krishna"]

package komal.Collection.List;

import java.util.ArrayList;
import java.util.Arrays;

public class Assignment83 {

	ArrayList<String> getDuplicateNames() {
		String[] arr = { "Harish", "Pramod", "Harish", "Krishna", "Jeet", "Krishna" };

		ArrayList<String> list = new ArrayList<String>(Arrays.asList(arr));
		ArrayList<String> duplicateList = new ArrayList<String>();

		for (int i = 0; i < list.size(); i++) {
			String name = list.get(i);
			if (list.indexOf(name) != i && !duplicateList.contains(name)) {
				duplicateList.add(name);
			}
		}

		return duplicateList;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> duplicateList = new Assignment83().getDuplicateNames();
		System.out.println("list of duplicate names from given Array => " + duplicateList);

	}

}
