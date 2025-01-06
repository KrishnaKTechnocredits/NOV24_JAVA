package rushikesh.ArrayAssignments;

import java.util.Arrays;

public class Assignment_73 {

	int[] getArrayWithShiftAllZeroInBeg(int[] input) {
		int[] output = new int[input.length];
		int count = 0;
		for (int index = 0; index < input.length; index++) {
			if (input[index] == 0) {
				count++;
			}
		}
		for (int index = 0; index < input.length; index++) {
			if (input[index] != 0) {
				output[count] = input[index];
				count++;
			}
		}
		return output;
	}

	public static void main(String[] args) {
		Assignment_73 assignment_73 = new Assignment_73();
		int[] arr = { 5, 0, 22, 44, 0, 0, 55, 0, 12, 19 };
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(assignment_73.getArrayWithShiftAllZeroInBeg(arr)));
	}
}
