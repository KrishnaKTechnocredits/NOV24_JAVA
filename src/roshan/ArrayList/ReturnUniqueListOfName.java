package roshan.ArrayList;

import java.util.*;

public class ReturnUniqueListOfName {
	List<String> grtUniqueName(String[] arr) {
		List<String> list = new ArrayList<>();
		List<String> orignalList = Arrays.asList(arr);
		for (String name : orignalList) {
			if (!list.contains(name)) {
				list.add(name);
			}

		}

		return list;

	}

	public static void main(String[] args) {
		String[] arr = { "Harish", "Pramod", "Harish", "Krishna", "Jeet", "Krishna" };
		ReturnUniqueListOfName returnuniquelistofname = new ReturnUniqueListOfName();
		System.out.println(returnuniquelistofname.grtUniqueName(arr));
	}

}

//Assignment - 84: 12th Jan
//Return the list of unique names from given Array. [IMP]
//
//String[] arr = {"Harish", "Pramod","Harish", "Krishna", "Jeet", "Krishna"};
//output : ["Harish", "Pramod", "Krishna", "Jeet"]
