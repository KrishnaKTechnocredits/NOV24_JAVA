//Assignment - 85: 14th Jan
//
//Remove duplicate from 2 list, and return all the unique elements from both list. 
//
//input : [10, 20, 30, 40]
//        [20,30,60,70,80,90,100,101,44,55,66,77]
//output : [10,20,30,40,60,70,80,90,100,101,44,55,66,77]		

package komal.Collection.List;

import java.util.ArrayList;
import java.util.Arrays;

public class Assignment85 {

	void getDuplicateList() {
		Integer[] arr = { 10, 20, 30, 40 };
		Integer[] arr1 = { 20, 30, 60, 70, 80, 90, 100, 101, 44, 55, 66, 77 };
		ArrayList<Integer> list1 = new ArrayList<Integer>(Arrays.asList(arr));
		ArrayList<Integer> list2 = new ArrayList<Integer>(Arrays.asList(arr1));
		list2.removeAll(list1);
		list1.addAll(list2);
		System.out.print(list1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new Assignment85().getDuplicateList();
	}

}
