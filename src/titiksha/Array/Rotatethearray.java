//Assignment - 74 : 8th Jan
//Rotate all the numbers of an array to the right by one position. 
//input : {10,20,30,40,50}
//output : {50,10,20,30,40};
     //    {40,50,10,20,30}

package titiksha.Array;

import java.util.Arrays;

public class Rotatethearray {
	void getRotateThearray(int[] arr) {
		int[] output = new int[arr.length];
		for (int i = 1; i < arr.length; i++) {
			output[i] = arr[i - 1];
			output[0] = arr[arr.length - 1];

		}
		System.out.println("Output array:"+(Arrays.toString(output)));
	}

	void rotatetillsecondlastindex(int[] arr) {
		int[] output = new int[arr.length];
		int j = 0;
		for (int i = 2; i < arr.length; i++) {
			output[i] = arr[j++];
			output[1] = arr[arr.length - 1];
			output[0] = arr[arr.length - 2];

		}
		System.out.println("Output array:"+(Arrays.toString(output)));
	}

	public static void main(String[] args) {
		Rotatethearray rotatethearray = new Rotatethearray();
		int[] array = { 10, 20, 30, 40, 50 };
		System.out.println("Input array : "+Arrays.toString(array));
		rotatethearray.getRotateThearray(array);
		rotatethearray.rotatetillsecondlastindex(array);

	}
}
