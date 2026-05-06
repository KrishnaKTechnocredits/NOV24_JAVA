//Assignment - 75 : 11th Jan

//Return the list of all the prime numbers from given array. 
//input : {10,23,31,40,50}
//output : {23,31}

package pratiksha;

import java.util.Arrays;

public class Assignment75 {
	boolean isNumberPrime(int num) {
		boolean value = false;
		for (int i = 2; i < Math.sqrt(num); i++) {
			if (num % i == 0) {
				value = false;
				break;
			} else {
				value = true;
			}
		}
		return value;
	}

	int[] getPrimeArray(int[] array) {
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			if (isNumberPrime(array[i])) {
				count++;
			}
		}
		int[] outputArray = new int[count];
		for (int i = 0, j = 0; i < array.length; i++) {
			if (isNumberPrime(array[i])) {
				outputArray[j++] = array[i];
			}
		}
		return outputArray;
	}

	public static void main(String[] args) {
		int[] input = { 10, 23, 31, 40, 50 };
		System.out.println("Input Array:" + Arrays.toString(input));
		Assignment75 assignment75 = new Assignment75();
		System.out.println("Prime Number array: " + Arrays.toString(assignment75.getPrimeArray(input)));
	}

}
