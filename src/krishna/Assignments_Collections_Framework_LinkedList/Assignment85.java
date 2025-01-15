package Assignments_Collections_Framework_LinkedList;

import java.util.LinkedList;
import java.util.List;

public class Assignment85 {
	
	List<Integer> getUnionOfLists(int[] arr1 , int[] arr2){
		List<Integer> listOfNumbers = new LinkedList<Integer>();
		List<Integer> listOfNumbers2 = new LinkedList<Integer>();
		
		for(int num : arr1) {
			listOfNumbers.add(num);
		}
		
		for(int num : arr2) {
			listOfNumbers2.add(num);
		}
		
		listOfNumbers2.removeAll(listOfNumbers);
		listOfNumbers.addAll(listOfNumbers2);
		
		return listOfNumbers;
		
	}

	public static void main(String[] args) {
		Assignment85 assignment85 = new Assignment85();
		int[] arr1 = {10, 20, 30, 40};
		int[] arr2 =  {20,30,60,70,80,90,100,101,44,55,66,77};
		System.out.println(assignment85.getUnionOfLists(arr1, arr2));
	}
}
