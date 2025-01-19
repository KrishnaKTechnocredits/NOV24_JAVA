/*
 * Assignment - 54 : 18th Dec'2024 [20 mins]
return the array having elements in reverse order of original array.

int[] getReverseArray(int[] arr){
	
}
 */

package amruta.ArrayPrograms;

public class Assign_54_ReturnArrayInReverseOrder {

	static int[] getReverseArray(int[] arr) {
		int[] op = new int[arr.length];
		int opIndex = 0;
		for (int index = arr.length - 1; index >= 0; index--) {
			op[opIndex] = arr[index];
			opIndex++;
		}
		return op;
	}

	public static void main(String[] args) {
		int[] input = { 10, 34, 22, 16, 19, 99 };
		System.out.println("Original Array :");
		for (int index = 0; index <= input.length - 1; index++) {
			System.out.print(input[index] + " ");
		}
		System.out.println("\n");
		int[] output = getReverseArray(input);
		System.out.println("Reverse Array :");
		for (int index = 0; index <= output.length - 1; index++) {
			System.out.print(output[index] + " ");
		}
	}
}
