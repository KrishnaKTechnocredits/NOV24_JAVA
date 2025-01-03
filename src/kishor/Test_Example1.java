package kishor;

import java.util.Arrays;

//Challenge - 1: replace each element in the array with the sum of all other 
//elements in the array. The resulting array should be stored in a new array output.
//Example:
//Input: int[] input = {3, 5, 7, 1, 9};
//Output: int[] output = {22, 20, 18, 24, 16};

public class Test_Example1 {
	
	int getSumOfElements(int[] arr) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
		}
		return sum;
	}
	
	int[] getSumOfAllElementInArray(int[] arr) {
		int[] obj = new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			obj[i]=getSumOfElements(arr)-arr[i];
		}
		return obj;
	}
	
	public static void main(String[] args) {
		int arr[] = {3, 5, 7, 1, 9};;
		Test_Example1 test1 = new Test_Example1();
		int[] ans=test1.getSumOfAllElementInArray(arr);
		System.out.println(Arrays.toString(ans));
	}
	
}
