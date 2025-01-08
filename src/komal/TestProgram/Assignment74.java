package komal.TestProgram;

//Assignment - 74 : 8th Jan
//Rotate all the numbers of an array to the right by one position. 
//input : {10,20,30,40,50}
//output : {50,10,20,30,40};
//     {40,50,10,20,30}

import java.util.Arrays;

public class Assignment74 {
	static int count = 0;

	int[] getRotateArray(int[] input) {
		count++;
		int output[] = new int[input.length];
		int last = input[input.length - 1];
		// 1st logic
		for (int i = input.length - 1; i > 0; i--) {
			output[i] = input[i - 1];
		}
//2nd logic
//		for (int i = 0; i < input.length - 1; i++) {
//			output[i + 1] = input[i];
//		}
		output[0] = last;
		return output;
	}

	public static void main(String[] args) {
		Assignment74 a74 = new Assignment74();
		int[] input = { 10, 20, 30, 40, 50 };
		int[] output = a74.getRotateArray(input);
		if (Assignment74.count == 1) {
			output = a74.getRotateArray(output);
		}
		System.out.println("output Array is : " + Arrays.toString(output));
	}
}
