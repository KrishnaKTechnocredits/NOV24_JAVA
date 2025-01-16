package harish.test16january;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Challenge - 2
 * 
 * Find first Unique number from given list.
 * 
 * Input : [66,12,69,12,77,66,69,5,8,14]
 * 
 * Output : First unique number is 77
 */

public class Challenge2 {

	private static int getFirstUniqueNumber(Integer[] input) {

		ArrayList<Integer> numList = new ArrayList<Integer>(Arrays.asList(input));

		int firstUniqueNumber = numList.get(0);

		for (int i = 0; i < numList.size(); i++) {
			if (numList.indexOf(numList.get(i)) == numList.lastIndexOf(numList.get(i))) {
				firstUniqueNumber = numList.get(i);
				break;
			}
		}

		return firstUniqueNumber;
	}

	public static void main(String[] args) {
		Integer[] input = { 66, 12, 69, 12, 77, 66, 69, 5, 8, 14 };
		System.out.println("Input : " + Arrays.asList(input));
		System.out.println("First unique number in given list is : " + Challenge2.getFirstUniqueNumber(input));
	}
}