package ashwini.ArrayProgram;

import java.util.Arrays;

/*
 Assignment - 75 : 11th Jan
Return the list of all the prime numbers from given array. 
input : {10,23,31,40,50}
output : {23,31}

 */
public class Assignment75 {
	boolean isPrimeNumber(int num) {
		boolean flag = true;
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				flag = false;
				break;
			}
		}
		return flag;
	}

	int[] getPrimeNumbers(int[] arr) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			boolean flag = isPrimeNumber(arr[i]);
			if (flag) {
				count++;
			}
		}
		int[] allPrimeNumbers = new int[count];
		int outputIndex = 0;
		for (int i = 0; i < arr.length; i++) {
			boolean flag = isPrimeNumber(arr[i]);
			if (flag) {
				allPrimeNumbers[outputIndex++] = arr[i];
			}
		}
		return allPrimeNumbers;
	}

	public static void main(String[] args) {
		Assignment75 a75 = new Assignment75();
		int[] input = { 10, 23, 31, 40, 50 };
		int[] output = a75.getPrimeNumbers(input);
		System.out.println(Arrays.toString(output));
	}
}
