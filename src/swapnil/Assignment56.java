package swapnil;

import java.util.Arrays;

public class Assignment56 {
	
	int[] maxNumIndex(int[] arr1, int[]arr2) {
		
		int[] Array = new int[arr1.length];
		for(int i=0;i<arr2.length;i++) {
			if(arr1[i]>arr2[i]) {
				Array[i]=arr1[i];
			}
			else{
				Array[i]=arr2[i];
			}
		}
		return Array;
		
	}

	public static void main(String[] args) {
		int[] arr1 = {10,55,22,77,88};
		int[] arr2 = {5,102,28,77,18};
		Assignment56 a = new Assignment56();
		int[] Array = a.maxNumIndex(arr1, arr2);
		System.out.println(Arrays.toString(Array));

	}

}

//Assignment - 56 : 20th Dec'2024 [15 mins]
//Return the array having maximum number from each index of given two array.
//
//input : 
//{10,55,22,77,88}
//{5,102,28,77,18}
//
//output : [10,102,28,77,88]
//
//NOTE : Use sop(Arrays.toString(output)) to print the array without for loop