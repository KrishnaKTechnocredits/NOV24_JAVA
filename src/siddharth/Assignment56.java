package siddharth;

import java.util.Arrays;

/*
Assignment - 56 : 20th Dec'2024 [15 mins]
Return the array having maximum number from each index of given two array.

input : 
{10,55,22,77,88}
{5,102,28,77,18}

output : [10,102,28,77,88]

NOTE : Use sop(Arrays.toString(output)) to print the array without for loop
 */

public class Assignment56 {
	int[] getMaxNum(int[] arr1, int[] arr2) {
		int max[] = new int[arr1.length];
			for(int i=0;i<arr1.length;i++) {
				if(arr1[i]>arr2[i]) {
					max[i]=arr1[i];
				}else{
					max[i]=arr2[i];
				}
			}
			return max;
	}
	
	public static void main(String[] args) {
		Assignment56 assignment56 = new Assignment56();
		int[] input1 = {10,55,22,77,88};
		int[] input2 = {5,102,28,77,18};
		int[] ans = assignment56.getMaxNum(input1, input2);
		System.out.println("Output : "+Arrays.toString(ans));
	}
}
