/*
 * Assignment - 74 : 8th Jan
Rotate all the numbers of an array to the right by one position. 
input : {10,20,30,40,50}
output : {50,10,20,30,40};
         {40,50,10,20,30}
 */

package pramod.arraydemo;

import java.util.Arrays;

public class Assignment74 {

	int[] rotateAllNumerOfArray(int[] input) {
		int[] output = new int[input.length];
		for (int i = 0; i < input.length; i++) {
			if (i != input.length - 1) {
				output[i + 1] = input[i];
			}
			output[0] = input[i];
		}
		return output;
	}

	public static void main(String[] args) {
		int[] input = { 10, 20, 30, 40, 50 };
		System.out.println("Given array is: "+Arrays.toString(input));
		Assignment74 A74 = new Assignment74();
		int[] rotateFirst=A74.rotateAllNumerOfArray(input);
		System.out.println("Roteted arrays as: ");
		System.out.println(Arrays.toString(rotateFirst));
		int[] rotateTwo=A74.rotateAllNumerOfArray(rotateFirst);
		System.out.println(Arrays.toString(rotateTwo));
		
	}

}
