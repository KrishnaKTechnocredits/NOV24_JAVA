package prem;

import java.util.*;

public class Assignment75 {
	
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

	ArrayList<Integer> getPrimeNumberCount(int[] input) {
	
		ArrayList<Integer> output = new ArrayList<Integer>();
		for (int i = 0; i < input.length; i++) {
			boolean flag = isPrimeNumber(input[i]);
			if (flag) {
				output.add(input[i]);
			}
		}
		return output;
	}

	public static void main(String[] args) {
		Assignment75 rough1 = new Assignment75();
		int[] input = { 10, 23, 31, 40, 50 };
		ArrayList<Integer> output = rough1.getPrimeNumberCount(input);
		System.out.println(output);
	}
}
