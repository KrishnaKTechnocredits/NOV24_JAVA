package rushikesh.SetOfColleaction;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Assignment_90 {

	Set<Integer> getSetOfNumInNaturalOrder(Integer[] arr) {
		Set<Integer> setOfNumber = new TreeSet<Integer>(Arrays.asList(arr));
		return setOfNumber;
	}

	public static void main(String[] args) {
		Assignment_90 assignment_90 = new Assignment_90();
		Integer[] arr = { 66, 33, 44, 12, 99, 22, 33, 33, 66 };
		Set<Integer> setOfUniqNum = assignment_90.getSetOfNumInNaturalOrder(arr);
		System.out.println(setOfUniqNum);
	}
}
