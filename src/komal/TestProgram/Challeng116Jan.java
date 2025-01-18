//Challenge - 1 : 16th Jan'2025
//Find out the 3rd largest number from given list.
//
//Input : [55,44,55,12,99,99,36,24,8,23]
//output : 44

package komal.TestProgram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.TreeSet;

class Challeng116Jan {
	int getThirdLargestNumber;

	void getProcessedData(Integer[] input) {

		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(input));
		TreeSet<Integer> treeSet = new TreeSet<Integer>(Collections.reverseOrder());
		treeSet.addAll(list);
		ArrayList<Integer> currentlist = new ArrayList<Integer>(treeSet);
		for (int i = 0; i < currentlist.size(); i++) {
			getThirdLargestNumber = currentlist.get(2);
		}
		System.out.println("Largest Number From list : " + getThirdLargestNumber);
	}

	public static void main(String args[]) {

		Integer[] Input = { 55, 44, 55, 12, 99, 99, 36, 24, 8, 23 };
		Challeng116Jan c1 = new Challeng116Jan();
		c1.getProcessedData(Input);
	}
}
