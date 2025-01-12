/*Assignment - 74 : 8th Jan
Rotate all the numbers of an array to the right by one position. 
input : {10,20,30,40,50}
output : {50,10,20,30,40};
         {40,50,10,20,30}*/

package harshada.Array3;

import java.util.Arrays;

public class Ass74_RotateArraytoRight {

	// method to rotate array 1 time
	int[] rotateArray(int[] arr) {
		int[] arr2 = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			if (i < arr.length - 1) {
				arr2[i + 1] = arr[i];
			}
		}
		arr2[0] = arr[arr.length - 1];
		System.out.println(Arrays.toString(arr2));
		return arr2;
	}

	public static void main(String[] args) {
		Ass74_RotateArraytoRight ass74 = new Ass74_RotateArraytoRight();
		int[] input = { 10, 20, 30, 40, 50 };
		int[] output = ass74.rotateArray(input);
		output = ass74.rotateArray(output);
	}
}
