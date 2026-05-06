/*
Assignment - 83: 12th Jan
Return the list of duplicate names from given Array. [IMP]

String[] arr = {"Harish", "Pramod","Harish", "Krishna", "Jeet", "Krishna"};
output : ["Harish", "Krishna"]
*/

package pramod.collection;
import java.util.*;
class Assignment83{

	List<String> getDuplicateNmaes(String[] arr){
		List<String> myList = new ArrayList<String>();
		List<String> duplicateList = new ArrayList<String>();
		for(int i = 0; i<arr.length; i++){
			boolean flag = myList.contains(arr[i]);
			if(!flag){
				myList.add(arr[i]);
			}
			else{
				if(!duplicateList.contains(arr[i]))
					duplicateList.add(arr[i]);
			}
		}
		return duplicateList;
	}	

	public static void main(String[] args){
		String[] arr = {"Harish", "Pramod","Harish", "Krishna", "Jeet", "Krishna"};
		System.out.println("Given string is :" + Arrays.toString(arr));
		List<String> ans = new Assignment83().getDuplicateNmaes(arr);
		System.out.println("Duplicate names in given string is :"+ans);
	}
}