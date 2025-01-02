/*Challenge - 1: replace each element in the array with the sum of all other elements 
 * in the array. The resulting array should be stored in a new array output.

Example:
Input: int[] input = {3, 5, 7, 1, 9};
Output: int[] output = {22, 20, 18, 24, 16};*/


package harshada;

import java.util.Arrays;

public class Test1 {
	
	int[] sumOfOtherElementArray(int[] arr) {	
		int[]output=new int[arr.length];	
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(i!=j) {
					output[i]=output[i]+arr[j];
				}
			}
		}
		return output;
	}
	
	public static void main(String[] args) {
		Test1 test1=new Test1();
		int[] input = {3, 5, 7, 1, 9};
		int[] output=test1.sumOfOtherElementArray(input);
		System.out.println(Arrays.toString(output));
	}

}
