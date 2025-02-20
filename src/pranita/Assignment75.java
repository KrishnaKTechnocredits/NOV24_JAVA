package pranita;

import java.util.*;

class Assignment75 {

	boolean isPrimeNumber(int num) {
		boolean flag = true;
		for (int i = 2; i < Math.sqrt(num); i++) {
			if (num % i == 0) {
				flag = false;
				break;
			}
		}
		return flag;
	}

	int[] getPrimeNumbers(int[] input) {
		int count = 0;
		for (int i = 0; i < input.length; i++) {
			boolean flag = isPrimeNumber(input[i]);
			if (flag) {
				count++;
			}
		}
		int[] allPrimeNumbers = new int[count];
		int index = 0;
		for (int i = 0; i < input.length; i++) {
			boolean flag = isPrimeNumber(input[i]);
			if (flag) {
				allPrimeNumbers[index] = input[i];
				index++;
			}
		}
		return allPrimeNumbers;
	}

	public static void main(String[] args) {
		Assignment75 A75 = new Assignment75();
		int[] input = { 10, 23, 31, 40, 50 };
		System.out.println("Given array is : " + Arrays.toString(input));
		int[] answer = A75.getPrimeNumbers(input);
		System.out.println("All prime numbers are : " + Arrays.toString(answer));
	}
}