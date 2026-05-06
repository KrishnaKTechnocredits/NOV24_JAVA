/*
Assignment - 75 : 11th Jan
Return the list of all the prime numbers from given array. 
input : {10,23,31,40,50}
output : {23,31}
*/
package amruta.CollectionPrograms;

import java.util.Arrays;

public class Assign_75_ReturnArrayOfAllPrimeNumbers {

	boolean isPrimeNumber(int num) {
		boolean flag = true;
		for (int index = 2; index <= num / 2; index++) {
			if (num % index == 0) {
				flag = false;
				break;
			}
		}
		return flag;
	}

	int[] getPrimeNumbers(int[] arr) {
		int count = 0;
		for (int index = 0; index < arr.length; index++) {
			boolean flag = isPrimeNumber(arr[index]);
			if (flag) {
				count++;
			}
		}
		int[] allPrimeNumber = new int[count];
		int outputIndex = 0;
		for (int index = 0; index < arr.length; index++) {
			boolean flag = isPrimeNumber(arr[index]);
			if (flag) {
				allPrimeNumber[outputIndex] = arr[index];
				outputIndex++;
			}
		}
		return allPrimeNumber;
	}

	public static void main(String[] args) {
		int[] input = {10,23,31,40,50};
		System.out.println("Given Array -- " + Arrays.toString(input));
		System.out.println("");
		int[] primeNumArray = new Assign_75_ReturnArrayOfAllPrimeNumbers().getPrimeNumbers(input);
		System.out.println("Array of Prime Numbers. -- \n" + Arrays.toString(primeNumArray));
	}
}
