package siddharth;

import java.util.Arrays;

/*
Assignment - 73 : 6th Jan'2024
Shift all the zeros at the begining of an array.

int[] arr = {5,0,22,44,0,0,55,0,12,19};
output : {0,0,0,0,5,22,44,55,12,19}
 */
public class Assignment73 {
	
	int[] getArrayWithZerosAtStart(int[] arr) {
		int[] output = new int[arr.length];
		for(int i=0,j=4;i<arr.length;i++) {
			if(arr[i]!=0) {
				output[j]=arr[i];
				j++;
			}
		}
		return output;
	}
	public static void main(String[] args) {
		Assignment73 assignment73 = new Assignment73();
		int[] input = {5,0,22,44,0,0,55,0,12,19};
		int[] ans = assignment73.getArrayWithZerosAtStart(input);
		System.out.println("Output : "+Arrays.toString(ans));
	}
}
