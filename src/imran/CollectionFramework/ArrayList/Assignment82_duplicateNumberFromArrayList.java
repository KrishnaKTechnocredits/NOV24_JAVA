/*
 Assignment - 82 : 12th Jan
Return the list of duplicate numbers from given Array. [IMP]

int[] arr = {10,44,55,22,44,11,77,88,99,11};
output : [44, 11]
 */

package imran.CollectionFramework.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Assignment82_duplicateNumberFromArrayList {

	List<Integer> getDuplicateNumberList(Integer[] data)
	{
		List<Integer> arr = Arrays.asList(data);
		List<Integer> ListOfduplicateNumber = new ArrayList<Integer>();
		for(int i=0; i<arr.size();i++)
		{
			int temp = arr.get(i);
			int index = arr.indexOf(temp);
			int lastIndex = arr.lastIndexOf(temp);
			if(index!=lastIndex & i==index)
			{
				ListOfduplicateNumber.add(temp);
			}
		}
		return ListOfduplicateNumber;
		
	}
	
	public static void main(String[] args) {
		Assignment82_duplicateNumberFromArrayList assignment82_duplicateNumberFromArrayList_1 = new Assignment82_duplicateNumberFromArrayList();
		Integer[] arr = {10,44,55,22,44,11,77,88,99,11};
		System.out.println("The Given Array is :" + Arrays.toString(arr));
		assignment82_duplicateNumberFromArrayList_1.getDuplicateNumberList(arr);
		List<Integer>duplicateNumberList = assignment82_duplicateNumberFromArrayList_1.getDuplicateNumberList(arr);
		System.out.println(" The Duplicate Elements are:  " + duplicateNumberList);
	}
}
