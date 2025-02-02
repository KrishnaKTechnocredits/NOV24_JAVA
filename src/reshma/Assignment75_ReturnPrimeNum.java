package reshma;
/* Return the list of all the prime numbers from given array.
  Input : {10,23,31,40,50}
  Output : {23,31} */

import java.util.Arrays;

public class Assignment75_ReturnPrimeNum {
	boolean isPrimeNumber(int num) {
		boolean flag =true;
		for(int i = 2; i < Math.sqrt(num); i++) {
			if(num%i==0) {
				flag=false;
				break;
			}
		}
		return flag;
	}
	int[] getPrimeNumber(int[] arr) {
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(isPrimeNumber(arr[i])) {
				count++;
			}
		}
		int[] allPrimeNumbers = new int[count];
		int outputIndex=0;
		for(int i=0;i<arr.length;i++) {
			if(isPrimeNumber(arr[i])) {
				allPrimeNumbers[outputIndex]=arr[i];
				outputIndex++;
			}
		}
		return allPrimeNumbers;
	}
	
	public static void main(String[] args) {
		int[] input = {10,23,31,40,50};
		Assignment75_ReturnPrimeNum a75 = new Assignment75_ReturnPrimeNum();
		int[]ans=a75.getPrimeNumber(input);
		System.out.println("Prime numbers from given array: " +Arrays.toString(ans));
		}
}
