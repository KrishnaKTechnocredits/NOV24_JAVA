package anuja.array1;

import java.util.Arrays;

/*
 Shift all the zeros at the begining of an array.

int[] arr = {5,0,22,44,0,0,55,0,12,19};
output : {0,0,0,0,5,22,44,55,12,19}
 * */
public class Assignment73 {

	public static void main(String[] args) {
		Assignment73 assignment73 = new Assignment73();
		int[] arr = { 5, 0, 22, 44, 0, 0, 55, 0, 12, 19 };
		System.out.println("Input array is: \n" +Arrays.toString(arr));
		assignment73.getUpdatedArray(arr);
	}

	public void getUpdatedArray(int[] arr) {
		int[] outputArr = new int[arr.length];
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				count++;
				outputArr[i] = 0;
			}
		}
		//re-used same count variable to add values onward
		for (int j = 0; j < arr.length; j++) {
			if (arr[j] != 0) {
				outputArr[count] = arr[j];
				count++;
			}
		}

		System.out.println("Input array is: \n" +Arrays.toString(outputArr));
	}
}
