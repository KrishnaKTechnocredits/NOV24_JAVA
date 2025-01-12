package harish.arraysdemo;

import java.util.Arrays;

/**
 * Assignment - 72 : 6th Jan'2024
 * 
 * Shift all the zeros at the end of an array.
 * 
 * Input - int[] arr = {5,0,22,44,0,0,55,0,12,19};
 * 
 * Output : {5,22,44,55,12,19,0,0,0,0}
 */
public class Assignment72 {

	public static void main(String[] args) {
		int[] arr = { 5, 0, 22, 44, 0, 0, 55, 0, 12, 19 };
		System.out.println("Input : " + Arrays.toString(arr));

		int[] output = new int[arr.length];
		int currentIndex = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				output[currentIndex] = arr[i];
				currentIndex++;
			}
		}
		System.out.println("Output : " + Arrays.toString(output));
	}
}