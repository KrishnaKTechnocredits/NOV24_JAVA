/*
 * Assignment - 75 : 11th Jan
Return the list of all the prime numbers from given array. 
input : {10,23,31,40,50}
output : {23,31}
 */

package rohan;

import java.util.*;

public class Assignment_75 {

	public static void main(String[] args) {
		Assignment_75 m = new Assignment_75();
		int[] input = { 10, 23, 31, 40, 50 };
		int[] Output = m.CountPrimeNum(input);
		System.out.println("Output : " + Arrays.toString(Output));
	}

	boolean GetPrimeNumber(int num) {
		boolean flag = true;
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				flag = false;
				break;
			}
		}
		return flag;
	}

	int[] CountPrimeNum(int[] arr) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (GetPrimeNumber(arr[i])) {
				count++;
			}
		}
		int[] PrimeNumArr = new int[count];
		int PrimeNumindex = 0;
		for (int i = 0; i < arr.length; i++) {
			if (GetPrimeNumber(arr[i])) {
				PrimeNumArr[PrimeNumindex++] = arr[i];
			}
		}
		return PrimeNumArr;
	}
}
