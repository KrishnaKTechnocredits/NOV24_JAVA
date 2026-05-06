//
//Assignment - 89 : 16th jan
//Remove all the duplicates from given array. 
//
//Integer[] arr = {10,20,20,20,30,30,40,50,40,10};

package komal.Collection.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Assignment89 {

	void removeDuplicates() {
		Integer[] arr = { 10, 20, 20, 20, 30, 30, 40, 50, 40, 10 };
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(arr));
		Set<Integer> set = new HashSet<Integer>(list);
		System.out.print("list : " + set);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		new Assignment89().removeDuplicates();
	}

}
