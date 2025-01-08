package anuja.array1;

import java.lang.reflect.Array;
import java.util.Arrays;

//rotate array to right by one position
public class Assignment74 {

	public static void main(String[] args) {
		Assignment74 assignment74 = new Assignment74();
		int [] arr = {10,20,30,40,50};
		System.out.println("Input array is:\n " +Arrays.toString(arr));
		System.out.println("-----Rotate to right by one method executed------");
		assignment74.rotateArrayToRight1(arr);
		System.out.println("-----Rotate to right by one method executed------" );
		assignment74.rotateArrayToRight2(arr);
		
	}
	//rotate to right by one position
	private void rotateArrayToRight1(int[] arr) {
		int[] newArr = new int[arr.length];
		newArr[0] = arr[arr.length-1];
		for (int i = 0 , j =1 ; i<arr.length-1 ;i++ , j++) {
			newArr[j] = arr[i]	;
			//System.out.println(newArr[j]);
		}
		System.out.println("Roatted input array to right is:\n " +Arrays.toString(newArr) +"\n" );
	}
	
	//rotate by two position to the right
	private void rotateArrayToRight2(int[] arr2) {
		int[] newArr2 = new int[arr2.length];
		newArr2[0] = arr2[arr2.length-2];
		newArr2[1] = arr2[arr2.length-1];
		for (int i = 0 , j =2 ; i<arr2.length-2 ;i++ , j++) {
			newArr2[j] = arr2[i]	;
			//System.out.println(newArr[j]);
		}
		System.out.println("Roatted input array to right is:\n " +Arrays.toString(newArr2) +"\n");
	}
}
