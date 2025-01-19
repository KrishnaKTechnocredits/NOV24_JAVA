package ashwini.ArrayProgram;

import java.util.Arrays;

/*
 Assignment - 73 : 6th Jan'2024

Shift all the zeros at the begining of an array.

int[] arr = {5,0,22,44,0,0,55,0,12,19};
output : {0,0,0,0,5,22,44,55,12,19}

 */
public class Assignment73 {
	void getZeroAtBegining(int[] arr) {
		//new Array
		int[] output =new int[arr.length];
		for(int i=arr.length-1,j=arr.length-1;i>=0;i--) {
			if(arr[i]!=0) {
			output[j]= arr[i];
			j--;
		}
		}
		System.out.println("Output: "+Arrays.toString(output));
	}
	public static void main(String[] args) {
		Assignment73 a73=new Assignment73();
		int[] arr = {5,0,22,44,0,0,55,0,12,19};
		System.out.println("Input: "+Arrays.toString(arr));
		a73.getZeroAtBegining(arr);	
		}
}
