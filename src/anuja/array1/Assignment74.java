package anuja.array1;

import java.lang.reflect.Array;
import java.util.Arrays;

//rotate array to right by one position
public class Assignment74 {

	public static void main(String[] args) {
		Assignment74 assignment74 = new Assignment74();
		int [] arr = {10,20,30,40,50};
		System.out.println("Input array is:\n " +Arrays.toString(arr));
		assignment74.rotateArrayToRight(arr);
		
	}

	private void rotateArrayToRight(int[] arr) {
		int[] newArr = new int[arr.length];
		newArr[0] = arr[arr.length-1];
		for (int i = 0 , j =1 ; i<arr.length-1 ;i++ , j++) {
			newArr[j] = arr[i]	;
			//System.out.println(newArr[j]);
		}
		System.out.println("Roatted input array to right is:\n " +Arrays.toString(newArr) );
	}
}
