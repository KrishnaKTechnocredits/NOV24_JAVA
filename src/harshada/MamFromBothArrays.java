//Assignment - 56 : 20th Dec'2024 [15 mins]
//Return the array having maximum number from each index of given two array.
//
//input : 
//{10,55,22,77,88}
//{5,102,28,77,18}
//
//output : [10,102,28,77,88]

package harshada;

import java.util.Arrays;

public class MamFromBothArrays {

	int[] getMaxFromArrays(int[] arr1, int[] arr2) {
		// Checking if arrays have different lengths
				if (arr1.length != arr2.length) {
					System.out.println("Arrays must have the same length for comparision");
					return new int[0]; // Return an empty array as an error indicator
				}
		
		
		int[] output = new int[arr1.length];
		for (int i = 0; i < output.length; i++) {
			if (arr1[i] > arr2[i]) {
				output[i] = arr1[i];
			} else
				output[i] = arr2[i];
		}
		return output;
	}

	public static void main(String[] args) {
		MamFromBothArrays max = new MamFromBothArrays();
		int[] input1 = { 10, 55, 22, 77, 88 };
		int[] input2 = { 5, 102, 28, 77, 18 };
		int[] output = max.getMaxFromArrays(input1, input2);
		System.out.println(Arrays.toString(output));
	}
}
