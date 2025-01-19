package harish.collections;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Assignment - 75 : 11th Jan
 * 
 * Return the list of all the prime numbers from given array.
 * 
 * Input : {10,23,31,40,50}
 * 
 * Output : {23,31}
 */

public class PrimeNumbers {

	private boolean isPrimeNumber(int num) {
		// since 0 & 1 are not considered as prime numbers
		if (num == 0 || num == 1) {
			return false;
		}
		for (int i = 2; i < Math.sqrt(num); i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	private ArrayList<Integer> getPrimeNumbers(int[] input) {
		ArrayList<Integer> primeNumbersList = new ArrayList<Integer>();
		for (int i = 0; i < input.length; i++) {
			if (isPrimeNumber(input[i])) {
				primeNumbersList.add(input[i]);
			}
		}
		return primeNumbersList;
	}

	public static void main(String[] args) {
		int[] input = { 10, 23, 31, 40, 50 };
		System.out.println("Input : " + Arrays.toString(input));
		PrimeNumbers primeNumbers = new PrimeNumbers();
		System.out.println("Output : " + primeNumbers.getPrimeNumbers(input));
	}
}