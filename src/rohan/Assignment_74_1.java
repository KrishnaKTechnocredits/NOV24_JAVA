/*
 * Assignment - 74 : 8th Jan
Rotate all the numbers of an array to the right by n  position. 
input : {10,20,30,40,50}
output : {50,10,20,30,40};
 */

package rohan;

import java.util.Arrays;

public class Assignment_74_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment_74_1 assigment = new Assignment_74_1();
		int[] input = {10,20,30,40,50};
		int[] output = assigment.RotateRight(input);
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
	
	

}
