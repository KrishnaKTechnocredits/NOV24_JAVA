/*
Assignment - 85: 14th Jan

Remove duplicate from 2 list, and return all the unique elements from both list. 

input : [10, 20, 30, 40]
        [20,30,60,70,80,90,100,101,44,55,66,77]
output : [10,20,30,40,60,70,80,90,100,101,44,55,66,77]
*/

package pramod.collection;
import java.util.*;
class Assignment85{

	List<Integer> getUniqueElement(Integer[] input1, Integer[] input2){
		List<Integer> myList1 = new ArrayList<Integer>();
		for(int num : input1){
			if(!myList1.contains(num))
			myList1.add(num);
		}
		for(int num1 : input2){
			if(!myList1.contains(num1))
			myList1.add(num1);
		}
		return myList1;
	}

	public static void main(String[] args){
		Integer[] input1 = {10, 20, 30, 40};
        Integer[] input2 = {20,30,60,70,80,90,100,101,44,55,66,77};
		System.out.println("First array elements are : "+Arrays.toString(input1));
		System.out.println("Second array elements are : "+Arrays.toString(input2));
		List<Integer> ans = new Assignment85().getUniqueElement(input1, input2);
		System.out.println("Unique values from both array are : "+ans);
	}
}