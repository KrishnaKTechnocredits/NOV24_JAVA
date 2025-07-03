package roshan.ChallangeTest;

import java.util.Arrays;

public class Test1 {
	static int [] arraySum(int [] num) {
		int [] output = new int [num.length];
		for (int i = 0; i<num.length ;i++) {
		int sum =0;
		for (int j = 0; j<num.length ;j++) {
			sum = sum  + num[j];
			if( num[i]==num[j]) {
			sum =sum  - num[j];
			}
			
		
		}
		output [i] = sum;
		}
		return output ;
	}
public static void main(String[] args) {
	int [] num = {1,2,3,4,5};
	System.out.println(Arrays.toString(Test1.arraySum(num)));
}
		


}


/*challenge - 1: replace each element in the array with the sum of all other elements in the array. The resulting array should be stored in a new array output.

Example:
Input: int[] input = {3, 5, 7, 1, 9};
Output: int[] output = {22, 20, 18, 24, 16};*/



