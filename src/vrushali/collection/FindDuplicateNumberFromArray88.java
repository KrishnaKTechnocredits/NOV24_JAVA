package vrushali.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//Assignment - 88 : 16th Jan
//From given array, return all duplicate elements.
//
//int[] arr = {33,22,44,33,12,15,16,22};
//output : [33,22]
//         
//		 
//Hint : hs.add() ---> returns false , it means that element is duplicate.

public class FindDuplicateNumberFromArray88 {
	List<Integer> returnDuplicateNumberSetFromArray(int[] numArray) {
		Set<Integer> numSet = new HashSet<Integer>();
		List<Integer> listOfDuplicateNum = new ArrayList<Integer>();
		for (Integer num : numArray) {
			if (!numSet.add(num)) {
				listOfDuplicateNum.add(num);
			}
		}
		return listOfDuplicateNum;
	}
	public static void main(String[] args) {
		FindDuplicateNumberFromArray88 findDuplicateNumberFromArray88=new FindDuplicateNumberFromArray88();
		int[] arr = {33,22,44,33,12,15,16,22};
		System.out.println("List of Duplicate Num From Array "+findDuplicateNumberFromArray88.returnDuplicateNumberSetFromArray(arr));
		
		
	}

}
