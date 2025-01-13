package siddharth;

import java.util.Arrays;

/*
Assignment - 75 : 11th Jan
Return the list of all the prime numbers from given array. 
input : {10,23,31,40,50}
output : {23,31}
 */
public class Assignment75 {

	boolean isPrimeNumber(int num) {
		boolean flag = true; // is a prime number
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				flag = false; // not a prime number
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
		int[] output = new int[count];
		int outputIndex = 0;
		for (int i = 0; i < arr.length; i++) {
			boolean flag = isPrimeNumber(arr[i]);
			if (flag) {
				output[outputIndex++] = arr[i];
			}
		}
		return output;
	}

	public static void main(String[] args) {
		Assignment75 assignment75 = new Assignment75();
		int[] input = { 10, 23, 31, 40, 50 };
		int[] ans = assignment75.getPrimeNumbers(input);
		System.out.println("Output : "+Arrays.toString(ans));
	}

}
