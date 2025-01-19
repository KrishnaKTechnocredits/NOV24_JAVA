/*
 * Assignment - 75 : 11th Jan
Return the list of all the prime numbers from given array. 
input : {10,23,31,40,50}
output : {23,31}
 */

package rohan;

import java.util.*;

public class Assignment_75_List {

	public static void main(String[] args) {
		Assignment_75_List m = new Assignment_75_List();
		int[] input = { 10, 23, 31, 25, 40, 50 };
		ArrayList<Integer> output = m.CountPrimeNum(input);
		System.out.println("Output : " + output);
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

	ArrayList<Integer> CountPrimeNum(int[] arr) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			if (GetPrimeNumber(arr[i]))
				al.add(arr[i]);
		}
		return al;
	}

}
