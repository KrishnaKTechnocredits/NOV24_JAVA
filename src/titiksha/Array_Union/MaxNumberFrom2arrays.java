//Assignment - 56: 20th Dec'2024 [15 mins]
//Return the array having maximum number from each index of given two array.
//input: 
//{10,55,22,77,88}
//{5,102,28,77,18}
//output: [10,102,28,77,88]

package titiksha.Array_Union;

import java.util.Arrays;

public class MaxNumberFrom2arrays {
	int[] getmaxNumber(int[] arr1, int[] arr2) {
		int output[] = new int[arr1.length];
		for (int i = 0; i < arr1.length; i++) {

			if (arr1[i] > arr2[i]) {
				output[i] = arr1[i];
			} else {
				output[i] = arr2[i];
			}
		}
		return output;
	}

	public static void main(String[] args) {
		MaxNumberFrom2arrays maxNumberFrom2arrays = new MaxNumberFrom2arrays();
		int[] firstarr = { 10, 55, 22, 77, 88 };
		int[] secondarr = { 5, 102, 28, 77, 18 };

		int[] result = maxNumberFrom2arrays.getmaxNumber(firstarr, secondarr);
		System.out.println(Arrays.toString(result));
	}

}
