package swapnil;

import java.util.Arrays;

public class Assignment75 {
	
	boolean isPrimeNumber(int num) {
		boolean flag = true;
		for(int i=2;i<Math.sqrt(num);i++) {
			if(num % i ==0) {
			flag = false;
			break;
		}
		
		}
		return flag;
	}
	int[] getPrimeNumbers(int[] arr) {
		int count=0;
		for(int i=0;i<arr.length;i++) {
			boolean flag = isPrimeNumber(arr[i]);
			if(flag) {
				count++;
			}
			
		}
		int[] allPrimeNumbers=new int [count];
		int outputIndex =0;
		for(int i=0;i<arr.length;i++) {
			boolean flag = isPrimeNumber(arr[i]);
			if(flag) {
				allPrimeNumbers[outputIndex++]=arr[i];
			}
		}
		return allPrimeNumbers;
	}
	
	public static void main(String[] args) {
		int[] arr = {10,23,31,40,50};
		Assignment75 a = new Assignment75();
		int[] A=a.getPrimeNumbers(arr);
		System.out.println(Arrays.toString(A));
	}
}
