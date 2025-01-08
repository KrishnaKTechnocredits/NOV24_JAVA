package siddharth;

import java.util.Arrays;

/*
Assignment - 74 : 8th Jan
Rotate all the numbers of an array to the right by one position. 
input : {10,20,30,40,50}
output : {50,10,20,30,40};
         {40,50,10,20,30}
 */
public class Assignment74 {
	
	int[] getArray(int[] arr) {
		int output[] = new int[arr.length];
			for(int i=0;i<arr.length-1;i++) {
				output[i+1]=arr[i];
				output[0]=arr[arr.length-1];
			}
			return output;
	}
	
	public static void main(String[] args) {
		Assignment74 assignment74 = new Assignment74();
		int[] input = {10,20,30,40,50};
		System.out.println("Output:");
		int[] ans1 = assignment74.getArray(input);
		System.out.println(Arrays.toString(ans1));
		int[] ans2 = assignment74.getArray(ans1);
		System.out.println(Arrays.toString(ans2));
		
	}
}
