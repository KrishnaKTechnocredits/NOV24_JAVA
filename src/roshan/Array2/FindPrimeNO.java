package roshan.Array2;

import java.util.*;

public class FindPrimeNO {
	List <Integer> selectOneNoFromList (int[] input){
		List <Integer> al = new ArrayList<>();  // create new list where we can save result
		for(int i=0;i<input.length;i++) {       // select one no from input
			if(isNoPrimeNo(input[i])) {         //call method and give boolean result
				al.add(input[i]);               // add prime no in list
			}
		}
		return al;
	}
	Boolean isNoPrimeNo (int input) {
		// since 0 & 1 are not considered as prime numbers
		if (input==0 ||input==1) {
			return false;
		}
		for (int i=2 ;i<Math.sqrt(input);i++) {
			if( input%2 == 0) {
				return false;

			}
		}
	
		return true ;
	}
	
public static void main(String[] args) {
	int[] input = {10,23,31,40,50};
	FindPrimeNO findprimenO = new FindPrimeNO ();
	List <Integer> primeNO = findprimenO.selectOneNoFromList (input);
	System.out.println(" Prime No are " + primeNO  );
	
	
	
}
}


/**
 * Assignment - 75 : 11th Jan
 * 
 * Return the list of all the prime numbers from given array.
 * 
 * Input : {10,23,31,40,50}
 * 
 * Output : {23,31}

 */




/*Explanation how math.sqart(input)works
 * To check if a number n is prime, you could try dividing it by every number from 2 to n - 1.
   But that’s slow. For example, to check if 997 is prime, you'd do 995 divisions!
 * Every number n that is not prime can be written as a multiplication of two
 * numbers: n = a \times b
 * 
 * Now here’s the key idea: - If both a and b were greater than \sqrt{n}, then:
 * - a \times b > \sqrt{n} \times \sqrt{n} = n - That’s impossible, because we
 * started with n = a \times b So at least one of the two numbers must be less
 * than or equal to \sqrt{n}
 * 
 * 🧪 Example: n = 49 - √49 = 7 - 49 = 7 × 7 → both factors are equal to √49 -
 * So we found a divisor ≤ √49 → ✅ not prime
 * 
 * 🧪 Example: n = 31 - √31 ≈ 5.56 - Try all numbers ≤ 5: 2, 3, 4, 5 - None
 * divide 31 → no divisor ≤ √31 - So 31 has no divisor pair → ✅ prime
 */
