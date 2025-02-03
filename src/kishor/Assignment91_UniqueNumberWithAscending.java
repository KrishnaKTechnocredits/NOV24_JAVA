package kishor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

//Remove all duplicates and return the set having all number in natural order. 
//
//Integer[] arr = {66,33,44,12,99,22,33,33,66};
//output : [12,22,33,44,66,99] 
public class Assignment91_UniqueNumberWithAscending {

	public static void main(String[] args) {
		Integer[] arr = { 66, 33, 44, 12, 99, 22, 33, 33, 66 };
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(arr));

		// TreeSet will not conatin any duplicate and maintained in assending order
		Set<Integer> set = new TreeSet<Integer>(list);
		System.out.println(set);

	}
}
