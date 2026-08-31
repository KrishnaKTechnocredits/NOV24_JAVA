package kishor;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Assignment89_RemoveAllDuplicate {

	public static void main(String[] args) {

		Integer[] arr = { 10, 20, 20, 20, 30, 30, 40, 50, 40, 10 };
		Set<Integer> set = new LinkedHashSet<Integer>();
		//linkedHasSet maintain insertion order

		for (int i = 0; i < arr.length; i++) {
			int num = arr[i];
			if (set.add(num) == true) {
				set.add(num);
			}
		}
		
		System.out.println(set);

	}
}
