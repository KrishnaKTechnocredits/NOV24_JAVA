package ashwini.ArrayList;

import java.util.ArrayList;
import java.util.List;
/*
 
Assignment - 83: 12th Jan
Return the list of duplicate names from given Array. [IMP]

String[] arr = {"Harish", "Pramod","Harish", "Krishna", "Jeet", "Krishna"};
output : ["Harish", "Krishna"]
 */

public class Assignment83 {

	List<String> getOriginalList(String[] arr) {
		List<String> originalList = new ArrayList<String>();
		for (int index = 0; index < arr.length; index++) {
			originalList.add(arr[index]);
		}
		return originalList;
	}

	List<String> getListOfDuplicateNames(List<String> originalList) {
		List<String> duplicateNameList = new ArrayList<String>();
		for (int index = 0; index < originalList.size(); index++) {
			String name = originalList.get(index);
			if (originalList.indexOf(name) != originalList.lastIndexOf(name)) {
				if (!duplicateNameList.contains(name)) {
					duplicateNameList.add(name);
				}
			}
		}
		return duplicateNameList;
	}

	public static void main(String[] args) {
		Assignment83 a83 = new Assignment83();
		String[] arr = { "Harish", "Pramod", "Harish", "Krishna", "Jeet", "Krishna" };
		List<String> ans = a83.getOriginalList(arr);
		List<String> ans1 = a83.getListOfDuplicateNames(ans);
		System.out.println(ans);
		System.out.println(ans1);
	}

}
