/*
 * Assignment - 79 : 11th Jan
Find out all the duplicate elements from given arrayList.

input : [10, 99, 10, 10, 77, 55, 46, 99]
output : 10 is duplicate, at index 0 and 3 
         99 is duplicate , at index 1 and 7.
 */

package rohan;

import java.util.*;

public class Assignment_79 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment_79 assignment = new Assignment_79();
		int[] input = {10, 99, 10, 10, 77, 55, 46, 99};
		assignment.FindDuplicate(input);
	}

	List<Integer> getOriginalList(int[] arr){
		List<Integer> OriginalList = new ArrayList<Integer>();	
		for(int i=0;i<arr.length;i++) {
			OriginalList.add(arr[i]);
		}
		return OriginalList;
	}
	List<Integer> FindDuplicate(int[] arr) {
		List<Integer> Duplicate = getOriginalList(arr);
		for(int i=0;i<Duplicate.size();i++) {
			int A = Duplicate.get(i);
			if(Duplicate.indexOf(A)!=Duplicate.lastIndexOf(A) && i == Duplicate.indexOf(A) ) {
				System.out.println(Duplicate.get(i)+" is duplicate , at index "+Duplicate.indexOf(Duplicate.get(i))+" and "+Duplicate.lastIndexOf(Duplicate.get(i)));
			}
		}
		return Duplicate;
	}

}
