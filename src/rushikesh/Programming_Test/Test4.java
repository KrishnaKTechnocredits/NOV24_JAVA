package rushikesh.Programming_Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Test4 {

	void printMissingNumFromArray(Integer[] arr) {
		Set<Integer> hashSet = new TreeSet<Integer>(Arrays.asList(arr));
		List<Integer> listOfNum = new ArrayList<Integer>(hashSet);
		List<Integer> listOfMissingNum = new ArrayList<Integer>();

		for (int i = 0, j = 1; i < hashSet.size(); i++, j++) {
			if (!listOfNum.contains(j)) {
				listOfMissingNum.add(j);
			}
		}
		System.out.println(listOfNum);
		System.out.println("List of Missing num from list is " + listOfMissingNum);
	}

	public static void main(String[] args) {
		Test4 test4 = new Test4();
		Integer[] arr = { 9, 7, 6, 2, 1, 5, 3, 10 };
		test4.printMissingNumFromArray(arr);
	}
}
