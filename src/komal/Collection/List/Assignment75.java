
//
//Assignment - 75 : 11th Jan
//Return the list of all the prime numbers from given array. 
//input : {10,23,31,40,50}
//output : {23,31}

package komal.Collection.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Assignment75 {

	boolean getPrime(int num) {

		boolean isPrime = true;
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				isPrime = false;
				return isPrime;
			}
		}
		return isPrime;
	}

	void listOfPrimeNumber(Integer[] input) {

		List<Integer> list = new ArrayList<Integer>(Arrays.asList(input));
		List<Integer> prime_list = new ArrayList<Integer>();
		for (int num : list) {

			boolean primeFlag = getPrime(num);
			if (primeFlag) {
				prime_list.add(num);
			}
		}
		System.out.println("Prime Number List :" + prime_list);
	}

	public static void main(String[] args) {

		Integer[] input = { 10, 23, 31, 40, 50 };
		Assignment75 a75 = new Assignment75();
		a75.listOfPrimeNumber(input);
	}
}
