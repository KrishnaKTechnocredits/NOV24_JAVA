
//Assignment - 88 : 16th Jan
//From given array, return all duplicate elements.
//
//int[] arr = {33,22,44,33,12,15,16,22};
//output : [33,22]
//         
//		 
//Hint : hs.add() ---> returns false , it means that element is duplicate.

package komal.Collection.List;

import java.util.HashSet;
import java.util.Set;

public class Assignment88 {

	void getDuplicates() {
		Integer[] arr = { 33, 22, 44, 33, 12, 15, 16, 22 };
//		Set<Integer> set = new HashSet<Integer>(Arrays.asList(arr));
		Set<Integer> duplicate = new HashSet<Integer>();

		for (int num : arr) {
			if (!duplicate.add(num)) {
				System.out.print(num);

			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new Assignment88().getDuplicates();

	}

}
