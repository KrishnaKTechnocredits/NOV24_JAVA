package ravindra;

import java.util.Arrays;

public class MaxIndexFromTwoArrayAssignment56 {

	int[] maxIndex(int[] input1, int[] input2) {
		int[] output = new int[input1.length];	
		for (int i = 0; i < input1.length; i++) {
			if(input1[i]>input2[i]) {
				output[i]=input1[i];
			}else {
				output[i]=input2[i];
			}
		}return output;
	}
	
	public static void main(String[] args) {
		int[] input1 = { 10, 55, 22, 77, 88 };
		int[] input2 = { 5, 102, 28, 77, 18 };
		MaxIndexFromTwoArrayAssignment56 Assignment56 = new MaxIndexFromTwoArrayAssignment56();
		int[] arry = Assignment56.maxIndex(input1, input2);
		System.out.println(Arrays.toString(arry));
	}
}
