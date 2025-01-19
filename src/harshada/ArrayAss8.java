//Assignment - 55 : 18th Dec'2024 [15-20 mins]
//
//return union of given two array.
//
//input : 
//{10,19,18}
//{99,8}
//
//output :  {10,19,18,99,8}

package harshada;

import java.util.Arrays;

public class ArrayAss8 {

	int[] getUnionOfArrays(int[] arr1, int[] arr2) {
		int count = 0;
		int[] output = new int[arr1.length + arr2.length];
		for (int i = 0; i < output.length; i++) {
			if (i < arr1.length)// checking first array length
				output[i] = arr1[i];// assigning values from first array
			else if (i >= arr1.length)// checking first array conversed or not
			{
				output[i] = arr2[count];// starting second array from 0
				count++;
			}
		}
		return output;
	}

	public static void main(String[] args) {
		ArrayAss8 arrayAss8 = new ArrayAss8();
		int[] input1 = { 10, 19, 18 };
		int[] input2 = { 99, 8 };
		int[] output = arrayAss8.getUnionOfArrays(input1, input2);
		System.out.println(Arrays.toString(output));
	}

}
