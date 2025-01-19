/*
 * Assignment - 74 : 8th Jan
Rotate all the numbers of an array to the right by one position. 
input : {10,20,30,40,50}
output : {50,10,20,30,40};
         {40,50,10,20,30}
 */

package rohan;

import java.util.Arrays;

public class Assignment_74 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment_74 assignment = new Assignment_74();
		int[] input = { 10, 20, 30, 40, 50 };
//		int[] output = {50,10,20,30,40};
		System.out.println("Input->" + Arrays.toString(input));
		int[] output = assignment.RotateArray(input);
		System.out.println("Output->" + Arrays.toString(output));
	}

	int[] RotateArray(int[] input) {
		int temp = input[input.length - 1];
		int[] output = new int[input.length];

		for (int i = 0; i <= input.length; i++) {
			if (i < input.length - 1) {
				output[i + 1] = input[i];
			}
		}
		output[0] = temp;
		return output;
	}

}
