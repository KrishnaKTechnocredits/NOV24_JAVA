//Shift all the zeros at the end of an array.
//int[] arr = {5,0,22,44,0,0,55,0,12,19};
//output : {5,22,44,55,12,19,0,0,0,0}

package rushikesh.ArrayAssignments;

import java.util.Arrays;

public class Assignment_72 {

	int[] getArrayWithShiftAllZeroAtEnd(int[] input) {
		int[] output = new int[input.length];
		for (int index = 0, j = 0; index < input.length; index++) {
			if (input[index] != 0) {
				output[j] = input[index];
				j++;
			}
		}
		return output;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment_72 assignment_72 = new Assignment_72();
		int[] arr = { 5, 0, 22, 44, 0, 0, 55, 0, 12, 19 };
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(assignment_72.getArrayWithShiftAllZeroAtEnd(arr)));
	}

}
