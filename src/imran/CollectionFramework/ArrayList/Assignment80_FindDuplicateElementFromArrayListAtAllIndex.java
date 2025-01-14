/*
 Assignment - 80 : 11th Jan
Find out all the duplicate elements from given arrayList and print them with their index.

input : [10, 99, 10, 10, 77, 55, 46, 99,99]
output : 10 is duplicate, at index [0, 2,3] 
         99 is duplicate , at index [1,7,8]
 */

package imran.CollectionFramework.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class Assignment80_FindDuplicateElementFromArrayListAtAllIndex {

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
				List<Integer> indexx = getIndexArray(num, Arrays.asList(data));
				System.out.println(num + " is Duplicate, at the index "+indexx);
			}
		}
	}
	
	List<Integer> getIndexArray(int data, List<Integer> arr)
	{
		List<Integer> indexCount = new ArrayList<Integer>();
		for(int i = 0;i<arr.size();i++)
		{
			if(arr.get(i)== data)
			{
				indexCount.add(i);
			}
		}
		return indexCount; 
	}
	
	public static void main(String[] args) {
		Assignment80_FindDuplicateElementFromArrayListAtAllIndex assignment80_FindDuplicateElementFromArrayListAtAllIndex_1 = new Assignment80_FindDuplicateElementFromArrayListAtAllIndex();
		Integer[] arr = {10, 99, 10, 10, 77, 55, 46, 99,99};
		System.out.println("The Given Array is :" + Arrays.toString(arr));
		assignment80_FindDuplicateElementFromArrayListAtAllIndex_1.getDuplicateElement(arr);
	}
}
