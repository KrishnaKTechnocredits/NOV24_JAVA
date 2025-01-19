package prem;

import java.util.ArrayList;
import java.util.List;

public class Assignment79 {

	void getDuplicateElements(int[] input) {
		ArrayList<Integer> output = new ArrayList<Integer>();

		List<Integer> originalList = new ArrayList<Integer>();
		for (int i = 0; i < input.length; i++) {
			originalList.add(input[i]);
			
		}
		for (int i = 0; i < input.length; i++) {
			int num = input[i];
			int index = originalList.lastIndexOf(num);
			int firstIndex = originalList.indexOf(num);
			if (!output.contains(num)&& firstIndex!= index) {
				output.add(num);
				System.out.println(num + " is duplicate, at index " + firstIndex + " and " + index);
			}else{
				
			}
		}
	}

	public static void main(String[] args) {
		int[] input = { 10, 99, 10, 10, 77, 55, 46, 99 };
		Assignment79 assign79 = new Assignment79();
		assign79.getDuplicateElements(input);
	}
}
