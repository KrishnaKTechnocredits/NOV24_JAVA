/*
 * /*
* Return the list of duplicate names from given Array. [IMP]
 
String[] arr = {"Harish", "Pramod","Harish", "Krishna", "Jeet", "Krishna"};
output : ["Harish", "Krishna"]
 
*/

package rohan;

import java.util.*;

public class Assignment_83 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment_83 assignment = new Assignment_83();
		String[] arr = { "Harish", "Pramod", "Harish", "Krishna", "Jeet", "Krishna" };
		assignment.getOriginalList(arr);
	}

	List<String> getOriginalList(String[] arr) {
		List<String> OriginalList = Arrays.asList(arr);
		List<String> tempList = new ArrayList<String>(OriginalList);
		List<String> OutList = new ArrayList<String>();
		for (int i = 0; i < OriginalList.size(); i++) {
			String A = tempList.get(i);
			if (tempList.indexOf(A) != tempList.lastIndexOf(A) && i == tempList.indexOf(A)) {
				OutList.add(A);
			}
		}
		System.out.println(OutList);
		return tempList;
	}

}
