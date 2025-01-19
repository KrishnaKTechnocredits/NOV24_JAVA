package kishor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Remove duplicate from 2 list, and return all the unique elements from both list. 
//input : [10, 20, 30, 40]
//        [20,30,60,70,80,90,100,101,44,55,66,77]
//output : [10,20,30,40,60,70,80,90,100,101,44,55,66,77]
public class Assignment85_removeDuplicate {
	
	public static void main(String[] args) {
		Integer[] arr1= {10, 20, 30, 40};
		Integer[] arr2 ={20,30,60,70,80,90,100,101,44,55,66,77};
		
		List<Integer> list1 = new ArrayList<Integer>(Arrays.asList(arr1));
		List<Integer> list2 = new ArrayList<Integer>(Arrays.asList(arr2));
		
		list2.removeAll(list1);
		list1.addAll(list2);
		
		System.out.println(list1);
	}
}
