package siddharth;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Assignment - 85: 14th Jan
Remove duplicate from 2 list, and return all the unique elements from both list. 

input : [10, 20, 30, 40]
        [20,30,60,70,80,90,100,101,44,55,66,77]
output : [10,20,30,40,60,70,80,90,100,101,44,55,66,77]	
 */
public class Assignment85 {

	List<Integer> getUniqueElements(Integer[] input1,Integer[] input2){
		List<Integer> list1 = new ArrayList<Integer>(Arrays.asList(input1));
		List<Integer> list2 = new ArrayList<Integer>(Arrays.asList(input2));
		list2.removeAll(list1);
		list1.addAll(list2);
		return list1;
	}
	
	public static void main(String[] args) {
		Assignment85 assignment85 = new Assignment85();
		Integer[] input1 = {10, 20, 30, 40};
		Integer[] input2 = {20,30,60,70,80,90,100,101,44,55,66,77};
		System.out.println("Output : "+assignment85.getUniqueElements(input1,input2));
	}
}
