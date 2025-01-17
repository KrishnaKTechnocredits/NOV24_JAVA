//Challenge - 3
//Find all the missing numbers between 1 to 10 from given List.
//
//input : [9,7,6,2,1,5,3,10]
//output : [4,8]
package komal.TestProgram;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class Challenge3 {

	void getMissingNumber(Integer[] input) {
		HashSet<Integer> missingNum = new HashSet<Integer>();

		HashSet<Integer> list = new HashSet<Integer>(Arrays.asList(input));
		System.out.println(list.size());
		int max = Collections.max(Arrays.asList(input));
		for (int i = 1; i <= max; i++) {
			if (!list.contains(i)) {
				missingNum.add(i);
			}
		}
		System.out.println(missingNum);
	}

	public static void main(String[] args) {

		Integer[] input = { 8, 7, 6, 2, 1, 5, 3, 10 };
		Challenge3 c3 = new Challenge3();
		c3.getMissingNumber(input);
	}
}
