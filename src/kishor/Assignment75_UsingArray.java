package kishor;

import java.util.Arrays;

//Return the list of all the prime numbers from given array. 
//input : {10,23,31,40,50}
//output : {23,31}
public class Assignment75_UsingArray {
	
	boolean isPrimeNumber(int num) {
		boolean flag =true;
		for(int i=2;i<=num/2;i++) {
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
		int[] arr1 = new int[count];
		int j=0;
		for(int i=0;i<arr.length;i++) {
			if(isPrimeNumber(arr[i])) {
				arr1[j]=arr[i];
				j++;
			}
		}
		return arr1;
	}
	
	public static void main(String[] args) {
		int[] arr = {10,23,31,40,50};
		Assignment75_UsingArray assignment75 = new Assignment75_UsingArray();
		int[]ans=assignment75.getPrimeNumber(arr);
		System.out.println(Arrays.toString(ans));
	}
}
