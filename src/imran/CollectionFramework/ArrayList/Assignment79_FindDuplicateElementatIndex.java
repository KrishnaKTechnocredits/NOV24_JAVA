/*
 Assignment - 79 : 11th Jan
Find out all the duplicate elements from given arrayList.

input : [10, 99, 10, 10, 77, 55, 46, 99]'
output : 10 is duplicate, at index 0 and 3 
         99 is duplicate , at index 1 and 7.
 */

package imran.CollectionFramework.ArrayList;
import java.util.*;

public class Assignment79_FindDuplicateElementatIndex {

	void getDuplicateElement(Integer[] data)
	{
		List<Integer> arr = Arrays.asList(data);
		for(int i =0; i<arr.size();i++)
		{
			int num = arr.get(i);
			int index = arr.indexOf(num);
			int lastIndex = arr.lastIndexOf(num);
			if(index!=lastIndex && i== index)
			{
				System.out.println(num + " is Duplicate, at the index "+ index +" and "+ lastIndex);
			}
		}
	}
	
	public static void main(String[] args) {
		Assignment79_FindDuplicateElementatIndex assignment79_FindDuplicateElementatIndex_1 = new Assignment79_FindDuplicateElementatIndex();
		Integer[] arr = {10, 99, 10, 10, 77, 55, 46, 99};
		System.out.println("The Given Array is :" + Arrays.toString(arr));
		assignment79_FindDuplicateElementatIndex_1.getDuplicateElement(arr);
	}
}
