package rushikesh.ListOfCollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Assignment_75 {

	List<Integer> getArrayListOfPrimeNumber(int[] input) {
		List<Integer> output = new ArrayList<Integer>();
		for (int index = 0; index < input.length; index++) {
			if (input[index] % 2 == 1) {
				output.add(input[index]);
			}
		}
		return output;
	}

	public static void main(String[] args) {
		Assignment_75 assignment_75 = new Assignment_75();
		int[] arr = { 10, 23, 31, 40, 50 };
		List<Integer> output = assignment_75.getArrayListOfPrimeNumber(arr);
		System.out.println(output);
	}
}
