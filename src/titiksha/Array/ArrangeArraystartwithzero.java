//Assignment - 72 : 6th Jan'2024
//Shift all the zeros at the end of an array.
//int[] arr = {5,0,22,44,0,0,55,0,12,19};
//output : {5,22,44,55,12,19,0,0,0,0}

package titiksha.Array;

import java.util.Arrays;

public class ArrangeArraystartwithzero {
	int[] getZeroInEnd(int[] arr) {
		int j = 0;
		int[] output = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				output[j] = arr[i];
				j++;
			}
		}
		return output;
	}
//Assignment - 73 : 6th Jan'2024
//	Shift all the zeros at the begining of an array.
//	int[] arr = {5,0,22,44,0,0,55,0,12,19};
//	output : {0,0,0,0,5,22,44,55,12,19}
	int[] getZeroInStart(int[] arr) {
		int j=arr.length-1;
		int[] output = new int[arr.length];
		for (int i = arr.length-1; i>=0; i--) {
			if (arr[i] != 0) {
				output[j--] = arr[i];
				
			}
		}
		return output;
	}
	public static void main(String[] args) {
		ArrangeArraystartwithzero arrangeArray = new ArrangeArraystartwithzero();
		int[] array = { 5, 0, 22, 44, 0, 0, 55, 0, 12, 19 };
		int[] output = arrangeArray.getZeroInEnd(array);
		System.out.println("The input Array is:"+Arrays.toString(array));
		System.out.println("The inputof 1st Array is:"+Arrays.toString(output));
		int[] output1 = arrangeArray.getZeroInStart(array);
		System.out.println("The inputof 2st Array is:"+Arrays.toString(output1));
		
	}
}
