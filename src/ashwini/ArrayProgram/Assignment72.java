package ashwini.ArrayProgram;

import java.util.Arrays;

/*
Assignment - 72 : 6th Jan'2024

Shift all the zeros at the end of an array.

int[] arr = {5,0,22,44,0,0,55,0,12,19};
output : {5,22,44,55,12,19,0,0,0,0}

*/

public class Assignment72 {

	void getZeroAtEnd(int[] arr) {
		int [] output=new int[arr.length];   //new array
		for(int i=0,j=0;i<arr.length;i++) {
			if(arr[i]!=0) {
				output[j]=arr[i];
				j++;
			}
		}
		System.out.println("Output: "+Arrays.toString(output));
	}
	public static void main(String[] args) {
		Assignment72 a72=new Assignment72();
		int[] arr = {5,0,22,44,0,0,55,0,12,19};
		System.out.println("Input: "+Arrays.toString(arr));
		a72.getZeroAtEnd(arr);
	}

}
