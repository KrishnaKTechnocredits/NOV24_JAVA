/*
 * Assignment - 74 : 8th Jan
Rotate all the numbers of an array to the right by n  position. 
input : {10,20,30,40,50}
n=3;
output : {30, 40, 50, 10, 20};
 */

package rohan;

import java.util.Arrays;

public class Assignment_74_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment_74_2 assigment = new Assignment_74_2();
		int[] input = {10,20,30,40,50};
		int[] output = assigment.RotateNTimes(input,3);
		System.out.println(Arrays.toString(output));
	}
	int[] RotateRight(int[] arr) {
		int temp = arr[arr.length-1];
		for(int i=arr.length-1;i>0;i--) {
			arr[i]=arr[i-1];
		}
		arr[0]= temp;
		return arr;
	}
	int[] RotateNTimes(int[] arr, int n) {
		for(int i=0;i<n;i++) {
			RotateRight(arr);
		}
		return arr;
	}
	
	

}
