package vrushali.collection;

import java.util.*;

//Assignment - 84: 12th Jan
//Return the list of unique names from given Array. [IMP]
//
//String[] arr = {"Harish", "Pramod","Harish", "Krishna", "Jeet", "Krishna"};
//output : ["Harish", "Pramod", "Krishna", "Jeet"]

public class ReturnListOfUniqueNamesFromArray84 {
	List<String> returnUniqueNameList(String[] strArray) {
		List<String> strList = Arrays.asList(strArray);
		List<String> uniqueNameList = new ArrayList<String>();
		String name = "";

		for (int i = 0; i < strList.size(); i++) {
			name = strList.get(i);
			if (!uniqueNameList.contains(name)) {
				uniqueNameList.add(name);
			}
		}
		return uniqueNameList;
	}

	public static void main(String[] args) {
		ReturnListOfUniqueNamesFromArray84 returnListOfUniqueNamesFromArray84 = new ReturnListOfUniqueNamesFromArray84();
		String[] arr = { "Harish", "Pramod", "Harish", "Krishna", "Jeet", "Krishna" };
		List<String> uniqueNameList = returnListOfUniqueNamesFromArray84.returnUniqueNameList(arr);
		System.out.println("Unique names from Array are : --> " + uniqueNameList);
	}
}
