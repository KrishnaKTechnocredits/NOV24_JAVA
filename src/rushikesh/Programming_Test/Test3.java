package rushikesh.Programming_Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Test3 {

	void printThrdHihgestNumberFromArray(Integer[] input) {
		Set<Integer> hashSet = new TreeSet<Integer>(Arrays.asList(input));
		List<Integer> listOfNum = new ArrayList<Integer>(hashSet);
		System.out.println(listOfNum);
		System.out.println(listOfNum.get(listOfNum.size() - 3));
	}

	public static void main(String[] args) {
		Test3 test3 = new Test3();
		Integer[] arr = { 55, 44, 55, 12, 99, 99, 36, 24, 8, 23 };
		test3.printThrdHihgestNumberFromArray(arr);
	}

}
