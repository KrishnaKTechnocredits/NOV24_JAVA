package anuja.collection;

import java.util.ArrayList;

/*
Remove duplicate from 2 list, and return all the unique elements from both list. 

input : [10, 20, 30, 40]
        [20,30,60,70,80,90,100,101,44,55,66,77]
output : [10,20,30,40,60,70,80,90,100,101,44,55,66,77]
 * */
public class Assignment85 {

	public static void main(String[] args) {
		Assignment85 assignment85 = new Assignment85();
		
		ArrayList<Integer> list1 = new ArrayList<Integer> ();
		ArrayList<Integer> list2 = new ArrayList<Integer> ();

		int[] arr1 = {10, 20, 30, 40};
		int[] arr2 = {20,30,60,70,80,90,100,101,44,55,66,77};
		
		for(int arrNum1 :arr1) {
			list1.add(arrNum1); //get list1
		}
		System.out.println("1st list: \n" +list1);
		
		for(int arrNum2 :arr2) {
			list2.add(arrNum2);//get list2
		}
		
		System.out.println("2nd list: \n" +list2);

		
		assignment85.proccessArrayList(list1 , list2);
		
	}

	private void proccessArrayList(ArrayList<Integer> list1, ArrayList<Integer> list2) {
		list2.removeAll(list1);//list2 updated and removed common
		list1.addAll(list2);// list1 and list2 union 
		System.out.println("Processed list is: \n" +list1);
		
	}
}
