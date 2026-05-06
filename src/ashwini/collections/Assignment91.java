package ashwini.collections;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/*Assignment - 91 : 16th jan
Remove all duplicates and return the set having all number in natural order. 

Integer[] arr = {66,33,44,12,99,22,33,33,66};
output : [12,22,33,44,66,99] */
public class Assignment91 {
	public static void main(String[] args) {
		Integer[] arr = { 66, 33, 44, 12, 99, 22, 33, 33, 66 };
		List<Integer> list = Arrays.asList(arr);
		System.out.println("Input: " + list);

		Set<Integer> ts = new TreeSet<Integer>(list);
		System.out.println("Output: " + ts);
	}
}
