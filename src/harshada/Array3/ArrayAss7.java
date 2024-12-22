//Assignment - 54 : 18th Dec'2024 [20 mins]
//return the array having elements in reverse order of original array.
//
//int[] getReverseArray(int[] arr){
//	
//} 

package harshada.Array3;

import java.util.Arrays;

public class ArrayAss7 {

	int[] getReverseArray(int[] arr) {
		int[] output = new int[arr.length];
		for (int j = arr.length - 1, i = 0; j >= 0; j--, i++) {
			output[i] = arr[j];
		}
		return output;
	}

	public static void main(String[] args) {
		ArrayAss7 arrayAss7 = new ArrayAss7();
		int[] input = { 10, 55, 22, 77, 88 };
		int[] output = arrayAss7.getReverseArray(input);
		System.out.println(Arrays.toString(output));
	}
}
