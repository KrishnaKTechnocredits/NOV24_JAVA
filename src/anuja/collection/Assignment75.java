package anuja.collection;

import java.util.*;

/*Return the list of all the prime numbers from given array. 
input : {10,23,31,40,50}
output : {23,31}*/
// as output size is not constant so use Arraylist to store the filtered value.

public class Assignment75 {
	// main method
	public static void main(String[] args) {
		Assignment75 assignment75 = new Assignment75();
		int[] arr = { 10, 23, 31, 40, 50 };
		ArrayList<Integer> ls = assignment75.getPrimeNumList(arr);
		System.out.println("All prime num from a given array " +Arrays.toString(arr)+" are :  \n" + ls);
	}

	// method to send one element from an array to new method where exactly logic is
	// written.
	public ArrayList<Integer> getPrimeNumList(int[] arr) {
		// return ArrayList of INteger class.
		ArrayList<Integer> list = new ArrayList<Integer>();// initialised new arrya list to store array element
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			boolean flag = isPrimeNum(arr[i]);// send number to new method

			if (flag) {
				list.add(arr[i]);// keep on adding the prime num if any.
				count++;
			}
		}

		if (count == 1) {
			System.out.println("Array having only one prime");
		} 

		return list;
	}

//original method to check is it prime or not, if devisible then no prime return false.
	public boolean isPrimeNum(int num) {
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}
}
