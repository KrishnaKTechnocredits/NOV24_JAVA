package ravindra;

import java.util.ArrayList;
import java.util.List;

public class Assignment_82 {
	public static void main(String[] args) {
		int[] arr = { 10, 44, 55, 22, 44, 11, 77, 88, 99, 11 };
		Assignment_82 assignment=new Assignment_82();
		List<Integer> listofduplicateNumbers = assignment.getDuplicateValue(arr);
		System.out.println(listofduplicateNumbers);
	}

	List<Integer> getDuplicateValue(int[] input) {
		List<Integer> list = new ArrayList<>();
		List<Integer> duplicatelist = new ArrayList<>();
		for (int i = 0; i < input.length; i++) {
			list.add(input[i]);
		}

		for (int i = 0; i < list.size(); i++) {

			if (list.indexOf(list.get(i)) != list.lastIndexOf(list.get(i))) {
				if(!duplicatelist.contains(list.get(i))) {
					duplicatelist.add(list.get(i));
				}
			}
		}return duplicatelist;
	}
}
