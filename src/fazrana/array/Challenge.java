//Challenge - 1: replace each element in the array with the sum of all other elements in the array. The resulting array should be stored in a new array output.
//
//Example:
//Input: int[] input = {3, 5, 7, 1, 9};
//Output: int[] output = {22, 20, 18, 24, 16};

package fazrana.array;

import java.util.Arrays;

public class Challenge {
	int sumArray(int[] array) {
		int sum=0;
		for (int i=0;i<array.length;i++) {
			sum= sum + array[i];
		}
		return sum;
	}
	
	int[] setArray(int[] array) {
		int[] output= new int[array.length];
		for (int i=0;i<array.length;i++) {
			output[i]= sumArray(array)- array[i];
		}
		return output;
	}
	
	public static void main(String[] args) {
		int[] input = {3, 5, 7, 1, 9};
		System.out.println(Arrays.toString(input));
		Challenge challenge=new Challenge();
		System.out.println(Arrays.toString(challenge.setArray(input)));
	}
}
