package Assignments_Collections_Framework_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Assignment75 {
	
	boolean getPrimeNumber(int num) {
		boolean flag = false;
		if(num <=1) {
			return false;
		}else {
			for(int i = 2;i<Math.sqrt(num);i++) {
				if(num%i==0) {
					return false;
				}else
					flag = true;
			}
		}
		return flag;
	}
	
	List<Integer> getPrimeNumberList(int[] arr){
		List<Integer> listOfPrimeNumbers = new ArrayList<Integer>();
		for(int i = 0;i<arr.length;i++) {
			if(getPrimeNumber(arr[i])== true) {
				listOfPrimeNumbers.add(arr[i]);
			}
		}
		return listOfPrimeNumbers;
	}

	public static void main(String[] args) {
		int[] input = {10,23,31,40,50};
		System.out.println(new Assignment75().getPrimeNumberList(input));
	}
}
