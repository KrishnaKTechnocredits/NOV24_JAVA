package ashwini;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;
import java.util.ArrayList;
import java.util.List;

/*
 Challenge - 1 : 16th Jan'2025
Find out the 3rd largest number from given list.

Input : [55,44,55,12,99,99,36,24,8,23]
output : 44
 */
public class Jan16Challenge1 {

	public static void main(String[] args) {

		//Integer[] arr = { 55, 44, 55, 12, 99, 99, 36, 24, 8, 23 };
		// Set<Integer> ts=new TreeSet<Integer>(Arrays.asList(arr));
		Set<Integer> ts = new TreeSet<Integer>(Collections.reverseOrder());
		ts.add(55);
		ts.add(54);
		ts.add(55);
		ts.add(12);
		ts.add(99);
		ts.add(99);
		ts.add(36);
		ts.add(24);
		ts.add(8);
		ts.add(23);
		System.out.println(ts);
		List<Integer> al = new ArrayList<Integer>(ts);
		int num = al.get(2);
		System.out.println(num);
	}
}
