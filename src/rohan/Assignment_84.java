/*
 * /*
* Assignment - 84: 12th Jan
Return the list of unique names from given Array. [IMP]
 
String[] arr = {"Harish", "Pramod","Harish", "Krishna", "Jeet", "Krishna"};
output : ["Harish", "Pramod", "Krishna", "Jeet"]
 
 
*/

package rohan;

import java.util.*;

public class Assignment_84 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment_84 assiagnment = new Assignment_84();
		String[] arr = { "Harish", "Pramod", "Harish", "Krishna", "Jeet", "Krishna" };
		assiagnment.getUniqueNameList(arr);
	}

	List<String> getUniqueNameList(String[] arr) {
		List<String> UniqueNameList = Arrays.asList(arr);
		List<String> TempList = new ArrayList<String>();
		for (int i = 0; i < UniqueNameList.size(); i++) {
			String A = UniqueNameList.get(i);
			if (UniqueNameList.indexOf(A) == i) {
				TempList.add(A);
			}
		}
		System.out.println(TempList);
		return TempList;

	}

}
