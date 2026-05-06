//Assignment - 84: 12th Jan
//Return the list of unique names from given Array. [IMP]
//
//String[] arr = {"Harish", "Pramod","Harish", "Krishna", "Jeet", "Krishna"};
//output : ["Harish", "Pramod", "Krishna", "Jeet"]

package komal.Collection.List;

import java.util.ArrayList;
import java.util.Arrays;

public class Assignment84 {

	ArrayList<String> getUniqueNumbers() {
		String[] arr = { "Harish", "Pramod", "Harish", "Krishna", "Jeet", "Krishna" };
		ArrayList<String> list = new ArrayList<String>(Arrays.asList(arr));
		ArrayList<String> uniqueList = new ArrayList<String>();
		for (int i = 0; i < list.size(); i++) {
			String name = list.get(i);
			if (list.indexOf(name) == i && !uniqueList.contains(name)) {
				uniqueList.add(name);
			}
		}
		return uniqueList;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> uniqueList = new Assignment84().getUniqueNumbers();
		System.out.print("The list of unique names from given Array => " + uniqueList);
	}

}
