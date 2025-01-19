/*Return the list of all the prime numbers from given array. 
input : {10,23,31,40,50}
output : {23,31}*/

package sindhu.Array;

import java.util.*;

public class Assignment75 {
	
	static boolean isPrime(int num) {
		if (num <= 1) {
			return false;
		}

		for (int i = 2; i <= Math.sqrt(num); i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		List<Integer> ipArr = Arrays.asList(10,23,31,40,50);
		List<Integer> outArr = new ArrayList<Integer>();

		for (int num : ipArr) {
			if (isPrime(num)) {
				outArr.add(num);
			}
		}
		System.out.println("The prime Numbers are : "+outArr);
	}
}
