package anuja.array1;

import java.util.Arrays;

/*
 *

Shift all the zeros at the end of an array.

int[] arr = {5,0,22,44,0,0,55,0,12,19};
output : {5,22,44,55,12,19,0,0,0,0}

 * */
public class Assignment72 {
	
	public void getNewArray(int[] arr1) {
		//new arr 
		int[] newArr = new int[arr1.length];
		int count = 0;
		for(int i= 0 ; i<arr1.length ; i++) {
			if(arr1[i] != 0) {
				newArr[count] = arr1[i];
				count++;
			}
		}
		System.out.println(Arrays.toString(newArr));
	}

	public static void main(String[] args) {
		Assignment72 assignment72 = new Assignment72();
		int[] arr1 = { 5, 0, 22, 44, 0, 0, 55, 0, 12, 19 };
		assignment72.getNewArray(arr1);
	}
}
