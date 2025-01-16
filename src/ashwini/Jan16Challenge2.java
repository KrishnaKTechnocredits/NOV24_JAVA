package ashwini;

/*
Challenge - 2
Find first Unique number from given list. 

input : [66,12,69,12,77,66,69,5,8,14]
output : First unique number is 77
*/

import java.util.Collections;
import java.util.TreeSet;
import java.util.ArrayList;
import java.util.List;

public class Jan16Challenge2 {

	public static void main(String[] args) {
		//Integer[] arr = { 66, 12, 69, 12, 77, 66, 69, 5, 8, 14 };
		TreeSet<Integer> ts1 = new TreeSet<Integer>(Collections.reverseOrder());
		ts1.add(66);
		ts1.add(12);
		ts1.add(69);
		ts1.add(12);
		ts1.add(77);
		ts1.add(66);
		ts1.add(69);
		ts1.add(5);
		ts1.add(8);
		ts1.add(14);
		System.out.println(ts1);
		List<Integer> al = new ArrayList<Integer>(ts1);
		int num = al.get(0);
		System.out.println(num);
	}
}
