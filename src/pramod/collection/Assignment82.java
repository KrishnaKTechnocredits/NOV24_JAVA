/*
Assignment - 82 : 12th Jan
Return the list of duplicate numbers from given Array. [IMP]

int[] arr = {10,44,55,22,44,11,77,88,99,11};
output : [44, 11]
*/

package pramod.collection;
import java.util.*;
class Assignment82{

	List<Integer> getDuplicateNumbers(int[] arr){
		List<Integer> myList = new ArrayList<Integer>();
		List<Integer> duplicatenumbersList = new ArrayList<Integer>();
		for(int i =0 ; i< arr.length; i++){
			boolean flag = myList.contains(arr[i]);
			if(!flag)
				myList.add(arr[i]);
			else{
				if(!duplicatenumbersList.contains(arr[i]))
				duplicatenumbersList.add(arr[i]);
			}
		}
		return duplicatenumbersList;
	}
	
	public static void main(String[] args){
		int[] arr = {10,44,55,22,44,11,77,88,99,11};
		System.out.println("Given array is : "+ Arrays.toString(arr));
		List<Integer> ans = new Assignment82().getDuplicateNumbers(arr);
		System.out.println("Duplicate Numbers in array is : "+ ans);
	}
}