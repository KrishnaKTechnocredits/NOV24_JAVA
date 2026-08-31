package vrushali.collection;

import java.util.*;

//Assignment - 83: 12th Jan
//Return the list of duplicate names from given Array. [IMP]
//
//String[] arr = {"Harish", "Pramod","Harish", "Krishna", "Jeet", "Krishna"};
//output : ["Harish", "Krishna"]

public class ReturnTheListOfDuplicateNamesFromArray83 {

	List<String> returnListOfDuplicateNamesFromArray(String[] strArray) {
		List<String> strList = Arrays.asList(strArray);
		List<String> duplicateNameList = new ArrayList<String>();
		String name = "";
		for (int i = 0; i < strList.size(); i++) {
			name = strList.get(i);
			if (strList.indexOf(name) != strList.lastIndexOf(name) && i == strList.indexOf(name)) {
				duplicateNameList.add(name);
			}
		}
		return duplicateNameList;
	}

	public static void main(String[] args) {
		ReturnTheListOfDuplicateNamesFromArray83 returnTheListOfDuplicateNamesFromArray83 = new ReturnTheListOfDuplicateNamesFromArray83();
		String[] arr = { "Harish", "Pramod", "Harish", "Krishna", "Jeet", "Krishna" };
		List<String> duplicateNameList = returnTheListOfDuplicateNamesFromArray83
				.returnListOfDuplicateNamesFromArray(arr);
		System.out.println("Duplicate names from Array are : --> " + duplicateNameList);
	}
}
