package kishor;

import java.util.ArrayList;
import java.util.List;

//Return the list of unique names from given Array. [IMP]
//
//String[] arr = {"Harish", "Pramod","Harish", "Krishna", "Jeet", "Krishna"};
//output : ["Harish", "Pramod", "Krishna", "Jeet"]

public class Assignment84_ArrayListUniqueString {

	List<String> getUniqueList(String[] arr) {
		List<String> uniqueList = new ArrayList<String>();
		for (int i = 0; i < arr.length; i++) {
			String name = arr[i];
			if (!uniqueList.contains(name)) {
				uniqueList.add(name);
			}
		}
		return uniqueList;

	}

	public static void main(String[] args) {
		String[] arr = { "Harish", "Pramod", "Harish", "Krishna", "Jeet", "Krishna" };
		Assignment84_ArrayListUniqueString assignment84 = new Assignment84_ArrayListUniqueString();
		List<String> names = assignment84.getUniqueList(arr);
		System.out.println(names);
	}
}
