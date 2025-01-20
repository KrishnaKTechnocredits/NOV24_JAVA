/*
Assignment - 85: 14th Jan

Remove duplicate from 2 list, and return all the unique elements from both list. 

input : [10, 20, 30, 40]
        [20,30,60,70,80,90,100,101,44,55,66,77]
output : [10,20,30,40,60,70,80,90,100,101,44,55,66,77]
 */

package imran.CollectionFramework.Set;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Assignment85_RemoveDuplicateprovideUniqueList {

	List<Integer> getUniqueList(Integer[] data1, Integer[] data2)
	{
		List<Integer> list1= new ArrayList<Integer>(Arrays.asList(data1));
		List<Integer> list2= new ArrayList<Integer>(Arrays.asList(data2));
		for(int i=0; i<list2.size();i++)
		{
			int temp = list2.get(i);
			if(!list1.contains(temp))
			{
				list1.add(temp);
			}
		}
		return list1;
	}
	
	LinkedHashSet<Integer> getUniqueListBetweenArrays(Integer[] data1, Integer[] data2)
	{
		List<Integer> list1= new ArrayList<Integer>(Arrays.asList(data1));
		List<Integer> list2= new ArrayList<Integer>(Arrays.asList(data2));
		list1.addAll(list2);
		Set<Integer> hs = new LinkedHashSet<Integer>(list1);
		return (LinkedHashSet<Integer>) hs;
	}
	
	
	public static void main(String[] args) {
		Integer[] arr1 = {10, 20, 30, 40};
		Integer[] arr2 = {20,30,60,70,80,90,100,101,44,55,66,77};
		System.out.println(" The First list is : " + Arrays.toString(arr1));
		System.out.println(" The First list is : " + Arrays.toString(arr2));
		Assignment85_RemoveDuplicateprovideUniqueList assignment85_RemoveDuplicateprovideUniqueList_1 = new Assignment85_RemoveDuplicateprovideUniqueList();
		List<Integer> uniq1 = assignment85_RemoveDuplicateprovideUniqueList_1.getUniqueList(arr1, arr2);
		System.out.println(" The Unique list is : " + uniq1);
		LinkedHashSet<Integer> uniq2 = assignment85_RemoveDuplicateprovideUniqueList_1.getUniqueListBetweenArrays(arr1, arr2);
		System.out.println(" The Unique set is : " + uniq2);
	}
}
