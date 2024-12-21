/*Assignment - 56 : 20th Dec'2024 [15 mins]
Return the array having maximum number from each index of given two array.

input : 
{10,55,22,77,88}
{5,102,28,77,18}

output : [10,102,28,77,88]

NOTE : Use sop(Arrays.toString(output)) to print the array without for loop*/

package SheetalG;

import java.util.Arrays;

public class MaxNumArray {
	public static void main(String[] args) {
		int[] arr1 = {10,55,22,77,88};
		int[] arr2 = {5,102,28,77,18};
		int[] output =new int[arr1.length];
		int i=0;
		while(i<arr1.length) {
			if(arr1[i]>arr2[i]) {
				output[i]=arr1[i];
			
			}else {
				output[i]=arr2[i];
		}
			i++;
	}
		System.out.println(Arrays.toString(output));
	}

}
