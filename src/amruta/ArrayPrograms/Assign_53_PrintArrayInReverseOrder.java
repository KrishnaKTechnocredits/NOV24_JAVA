/*
Assignment - 53 : 16th Dec'2024 [5-7 mins]

print the array in reverse order. 

input : {10,34,22,16,19,99}
output : 99
         19
		 16
		 22
		 34
		 10
*/

package amruta.ArrayPrograms;

public class Assign_53_PrintArrayInReverseOrder {

	static void printArrayInReverse(int[] arr) {
		System.out.println("Given Array in Reverse Order : ");
		for (int index = arr.length - 1; index >= 0; index--) {
			System.out.print(arr[index] + " ");
		}
	}

	public static void main(String[] args) {
		int[] input = { 10, 34, 22, 16, 19, 99 };
		System.out.println("Original Array :");
		for (int index = 0; index <= input.length - 1; index++) {
			System.out.print(input[index] + " ");
		}
		System.out.println("\n");
		printArrayInReverse(input);
	}
}