//Assignment - 85: 14th Jan
//
//Remove duplicate from 2 list, and return all the unique elements from both list. 
//
//input : [10, 20, 30, 40]
//        [20,30,60,70,80,90,100,101,44,55,66,77]
//output : [10,20,30,40,60,70,80,90,100,101,44,55,66,77]	

package fazrana.arrayList;

import java.util.*;

public class FAssignment85 {
	public static void main(String[] args) {
		Integer[] array1= {10, 20, 30, 40};
		Integer[] array2= {20,30,60,70,80,90,100,101,44,55,66,77};
		
		List<Integer> list1=new ArrayList<Integer>(Arrays.asList(array1));
		List<Integer> list2=new ArrayList<Integer>(Arrays.asList(array2));
		System.out.print("Input:"+list1+",");
		System.out.println(list2);
		
		list2.removeAll(list1);
		list1.addAll(list2);
		System.out.println("Output: "+list1);
	}
}
