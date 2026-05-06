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

package pramod.collection;
import java.util.*;
class Assignment81{
	
	List<Integer> getUniqueNumberList(Integer[] arr){
		List<Integer> listOfNumbers= new ArrayList<Integer>();
		for(int i = 0 ; i<arr.length; i++){
			boolean flag = listOfNumbers.contains(arr[i]);
			if(!flag){
				listOfNumbers.add(arr[i]);
			}
		}
		return listOfNumbers;
	}
	
	public static void main(String[] args){
		Integer[] arr = {10,44,55,22,44,11,77,88,99,11};
		System.out.println("Given array is : "+ Arrays.toString(arr));
		List<Integer> ans = new Assignment81().getUniqueNumberList(arr);
		System.out.println("Unique numbers are: " + ans);
	}
}