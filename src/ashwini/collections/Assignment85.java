package ashwini.collections;

import java.util.ArrayList;
import java.util.Arrays;

/*
 Assignment - 85: 14th Jan

Remove duplicate from 2 list, and return all the unique elements from both list. 

input : [10, 20, 30, 40]
        [20,30,60,70,80,90,100,101,44,55,66,77]
output : [10,20,30,40,60,70,80,90,100,101,44,55,66,77]		

 */
public class Assignment85 {
	ArrayList<Integer> getUniqueList(ArrayList<Integer> numList1,ArrayList<Integer> numList2){
		System.out.println("NumList1: " + numList1);
		System.out.println("NumList2: " + numList2);
		numList2.removeAll(numList1);
		numList1.addAll(numList2);
		return numList1;
	}

	public static void main(String[] args) {
		Integer[] arr = { 10, 20, 30, 40 };
		ArrayList<Integer> numList1 = new ArrayList<Integer>(Arrays.asList(arr));
		Integer[] arr1 = { 20, 30, 60, 70, 80, 90, 100, 101, 44, 55, 66, 77 };
		ArrayList<Integer> numList2 = new ArrayList<Integer>(Arrays.asList(arr1));
		Assignment85 a85=new Assignment85();
		ArrayList<Integer> resultantNumList=a85.getUniqueList(numList1, numList2);
		System.out.println("Resultant NumList: " + resultantNumList);
	}
}
