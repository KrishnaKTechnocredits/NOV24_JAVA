package amruta.ArrayPrograms;

import java.util.Arrays;

public class Assign_73_ShiftAllZerosAtBeginingInArray {

	// Logic 1
	void shiftAllZerosAtBegining(int[] arr) {
		int[] output = new int[arr.length];
		int count = arr.length - 1;
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] != 0) {
				output[count] = arr[index];
				count--;
			}
		}
		System.out.println("Array after shifting all zeros at the start --> " + Arrays.toString(output));
	}

	// Logic 2
	void shiftAllZerosAtBegining1(int[] arr) {
		int[] output = new int[arr.length];
		int count = arr.length - 1;
		for (int index = arr.length - 1; index >= 0; index--) {
			if (arr[index] != 0) {
				output[count] = arr[index];
				count--;
			}
		}
		System.out.println("Array after shifting all zeros at the start --> " + Arrays.toString(output));
	}

	public static void main(String[] args) {
		int[] arr = { 5, 0, 22, 44, 0, 0, 55, 0, 12, 19 };
		System.out.println("Original Array --> " + Arrays.toString(arr));
		System.out.println("---------------------------------------------------------------------------------");
		Assign_73_ShiftAllZerosAtBeginingInArray a73 = new Assign_73_ShiftAllZerosAtBeginingInArray();
		a73.shiftAllZerosAtBegining(arr);
		System.out.println("---------------------------------------------------------------------------------");
		a73.shiftAllZerosAtBegining1(arr);
	}
}
