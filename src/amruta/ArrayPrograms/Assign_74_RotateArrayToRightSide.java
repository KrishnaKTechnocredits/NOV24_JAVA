/*
 * Assignment - 74 : 8th Jan
Rotate all the numbers of an array to the right by one position. 
input : {10,20,30,40,50}
output : {50,10,20,30,40};
         {40,50,10,20,30}
 */
package amruta.ArrayPrograms;

import java.util.Arrays;

public class Assign_74_RotateArrayToRightSide {

	int[] shifArrayElementsToRight(int[] arr) {
		int[] op = new int[arr.length];
		op[0] = arr[arr.length - 1];

		for (int index = 0; index < arr.length - 1; index++) {
			op[index + 1] = arr[index];
		}
		return op;
	}

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };
		Assign_74_RotateArrayToRightSide a74 = new Assign_74_RotateArrayToRightSide();
		int[] op1 = a74.shifArrayElementsToRight(arr);
		System.out.println(Arrays.toString(op1));
		int[] op2 = a74.shifArrayElementsToRight(op1);
		System.out.println(Arrays.toString(op2));
		int[] op3 = a74.shifArrayElementsToRight(op2);
		System.out.println(Arrays.toString(op3));
	}
}
