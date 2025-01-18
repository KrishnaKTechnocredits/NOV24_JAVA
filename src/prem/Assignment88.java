package prem;

import java.util.*;

public class Assignment88 {

	public static void main(String[] args) {
		Integer[] arr = { 33, 22, 44, 33, 12, 15, 16, 22 };

		HashSet<Integer> input = new HashSet<Integer>();
		for (int num : arr) {
			if(!input.add(num)) {
			System.out.println(num);
			}
		}
	}
}
