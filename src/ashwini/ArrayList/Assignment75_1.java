package ashwini.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

/*Prime Number return using Array List
 Assignment - 75_1 : 11th Jan
Return the list of all the prime numbers from given array. 
input : {10,23,31,40,50}
output : {23,31}

 */
public class Assignment75_1 {
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

	ArrayList<Integer> getPrimeNumbers(int[] arr) {
		ArrayList<Integer> allPrimeNumbers = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			boolean flag = isPrimeNumber(arr[i]);
			if (flag) {
				allPrimeNumbers.add(arr[i]);
			}
		}
		return allPrimeNumbers;
	}

	public static void main(String[] args) {
		Assignment75_1 aa75 = new Assignment75_1();
		int[] input = { 10, 23, 31, 40, 50 };
		System.out.println("Input: " + Arrays.toString(input));
		ArrayList<Integer> output = aa75.getPrimeNumbers(input);
		System.out.println("Output: " + output);
	}
}
