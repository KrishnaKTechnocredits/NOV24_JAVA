/*
 Assignment - 81 : 12th Jan
Return the unique list of numbers from given Array. [IMP]

int[] arr = {10,44,55,22,44,11,77,88,99,11};


List<Integer> getUniqueNumberList(int[] input){
	List<Integer> listOfNumbers = new ArrayList<Integer>();
}
output : [10,44,55,22,11,77,88,99]

Hint : contains method of ArrayList.
 */

package imran.CollectionFramework.ArrayList;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class Assignment81_ReturnUniqueLIstOfNumbersFromArrayList {

	List<Integer> getUniqueNumberList(Integer[] data)
	{
		List<Integer> arr = Arrays.asList(data);
		List<Integer> ListOfUniqueNumber = new ArrayList<Integer>();
		for(int i=0; i<arr.size();i++)
		{
			int temp = arr.get(i);
			if(!ListOfUniqueNumber.contains(temp))
			{
				ListOfUniqueNumber.add(temp);
			}
		}
		return ListOfUniqueNumber;
		
	}
	public static void main(String[] args) {
		Assignment81_ReturnUniqueLIstOfNumbersFromArrayList assignment81_ReturnUniqueLIstOfNumbersFromArrayList_1 = new Assignment81_ReturnUniqueLIstOfNumbersFromArrayList();
		Integer[] arr = {10,44,55,22,44,11,77,88,99,11};
		System.out.println("The Given Array is :" + Arrays.toString(arr));
		List<Integer>uniqueNumberList = assignment81_ReturnUniqueLIstOfNumbersFromArrayList_1.getUniqueNumberList(arr);
		System.out.println(" The Unique Number Are: " + uniqueNumberList);
	}
}
