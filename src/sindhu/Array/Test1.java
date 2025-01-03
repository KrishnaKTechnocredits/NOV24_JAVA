/*Challenge - 1: replace each element in the array with the sum of all other elements in the array. The resulting array should be stored in a new array output.

Example:
Input: int[] input = {3, 5, 7, 1, 9};
Output: int[] output = {22, 20, 18, 24, 16};*/

package sindhu.Array;

import java.util.Arrays;

public class Test1 {
		
	int[] getSumOfOtherIndex(int[] inp){
		int[] output = new int[inp.length];
		for(int i=0; i<inp.length; i++) {
			int sum = 0;
			for(int j=0; j<inp.length; j++) {
				if(i!=j) {
					sum = sum + inp[j];
				}	
				output[i]=sum;
			}
		}
		return output ;
	}
	
	public static void main(String[] args) {
		int[] input = {3, 5, 7, 1, 9};
		Test1 test1 = new Test1();
		System.out.println("Input array is: "+Arrays.toString(input));
		int[] output = test1.getSumOfOtherIndex(input);
		System.out.println("Output Array is:"+Arrays.toString(output));
	}
}
