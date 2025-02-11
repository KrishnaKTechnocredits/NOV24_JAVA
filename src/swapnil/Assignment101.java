package swapnil;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment101 {
	
	void getSexMaxNum(int[] arr) {
	int maxNum=arr[0];
	int secMax=0;
	
	for(int i=1;i<arr.length;i++) {
		if(maxNum<arr[i]) {
			secMax=maxNum;
			maxNum=arr[i];
			}
		if(secMax<arr[i] && maxNum>arr[i]) {
			secMax=arr[i];
		}
	}
	System.out.println("Second highest number is:"+secMax);
	}
	public static void main(String[] args) {
		System.out.println("Please enter size of array:");
		Scanner sc = new Scanner(System.in);
		int arrayLength = sc.nextInt();
		int[] arr = new int[arrayLength];
		System.out.println("Enter the numbers:");
		for(int i=0;i<arr.length;i++){
		arr[i]=sc.nextInt();
	}
	System.out.println("Given Array: " +Arrays.toString(arr));
	new Assignment101().getSexMaxNum(arr);
	sc.close();
	}
}
