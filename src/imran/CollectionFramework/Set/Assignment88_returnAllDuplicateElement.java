/*
Assignment - 88 : 16th Jan
From given array, return all duplicate elements.

int[] arr = {33,22,44,33,12,15,16,22};
output : [33,22]
*/
package imran.CollectionFramework.Set;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Assignment88_returnAllDuplicateElement {

	List<Integer> returnDuplicateElement(Integer[] data)
	{
		List<Integer> list1 = Arrays.asList(data);
		List<Integer> list2 = new ArrayList<Integer>();
		int firstindex=0;
		int lastindex =0;
		for(int i =0;i<data.length;i++)
		{
			int element = list1.get(i);
			firstindex = list1.indexOf(element);
			lastindex = list1.lastIndexOf(element);
			if(firstindex!= lastindex && i==firstindex)
			{
				list2.add(element);
			}
		}
		return list2;
	}
	
	public static void main(String[] args) {
		Integer[] arr = {33,22,44,33,12,15,16,22};
		Assignment88_returnAllDuplicateElement assignment88_1 = new Assignment88_returnAllDuplicateElement();
		System.out.println("The Given array is : " + Arrays.toString(arr));
		List<Integer> duplicateelementlist =assignment88_1.returnDuplicateElement(arr);
		System.out.println(" the Duplicate Element are : " + duplicateelementlist);
	}
}
