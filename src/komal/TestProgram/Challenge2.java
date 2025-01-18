//Challenge - 2
//Find first Unique number from given list. 
//
//input : [66,12,69,12,77,66,69,5,8,14]
//output : First unique number is 77

package komal.TestProgram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.TreeSet;

public class Challenge2 {
	int FirstUniqueNumber;

	void getFirstUniqueNumber(Integer[] input) {
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(input));
		TreeSet<Integer> treeSet = new TreeSet<Integer>(Collections.reverseOrder());
		treeSet.addAll(list);
		ArrayList<Integer> currentlist = new ArrayList<Integer>(treeSet);

		System.out.println("first unique Number From list : " + currentlist.get(0));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] Input = { 66, 12, 69, 12, 77, 66, 69, 5, 8, 14 };
		Challenge2 c2 = new Challenge2();
		c2.getFirstUniqueNumber(Input);
	}

}
