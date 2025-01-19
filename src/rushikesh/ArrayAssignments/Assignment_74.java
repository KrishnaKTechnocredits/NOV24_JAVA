package rushikesh.ArrayAssignments;

import java.util.Arrays;

public class Assignment_74 {

	int[] getRotateArray(int[] input) {
		int[] output = new int[input.length];
		output[0] = input[input.length - 1];
		for (int index = 0, j = 1; index < input.length - 1; index++, j++) {
			output[j] = input[index];
		}
		return output;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment_74 assignment_74 = new Assignment_74();
		int[] arr = { 10, 20, 30, 40, 50 };
		System.out.println(Arrays.toString(arr));
		int[] output = assignment_74.getRotateArray(arr);
		System.out.println(Arrays.toString(output));
		output = assignment_74.getRotateArray(output);
		System.out.println(Arrays.toString(output));
	}

}
