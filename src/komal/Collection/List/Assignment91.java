
//Assignment - 91 : 16th jan
//Remove all duplicates and return the set having all number in natural order.   treeset
//
//Integer[] arr = {66,33,44,12,99,22,33,33,66};
//output : [12,22,33,44,66,99] 	

package komal.Collection.List;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Assignment91 {

	Set<Integer> getList() {
		Integer[] arr = { 66, 33, 44, 12, 99, 22, 33, 33, 66 };
		Set<Integer> set = new TreeSet<Integer>(Arrays.asList(arr));
		return set;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> set = new Assignment91().getList();
		System.out.print("set having all number in natural order => " + set);
	}
}
