package siddharth;

import java.util.Scanner;

/*
Assignment - 101 : 1st Feb'2025
On user defined numbers, find out the second largest number. 
Hint : Use scanner.
*/
public class Assignment101 {
	
	void printSecondLargestNumber(Integer[] input) {
		int largest=input[0];
		int secondLargest=input[1];
		
		if(largest<secondLargest) { //validate largest and secondLargest
			int temp = largest;
			largest=secondLargest;
			secondLargest=temp;
		}
		
		for(int i=2;i<input.length;i++) { //start loop with 2
			if(input[i]>largest) {
				secondLargest=largest;
				largest=input[i];
			}else if(input[i]<largest && input[i]>secondLargest) {
				secondLargest=input[i];
			}
		}
		System.out.println("SecondLargest Value: "+secondLargest);
		System.out.println("Largest Value: "+largest);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter your numbers seperated by spaces");
		String numberString = sc.nextLine();
		String[] arr = numberString.split(" ");
		Integer[] numbers = new Integer[arr.length];
		for(int i=0;i<arr.length;i++) {
			numbers[i]=Integer.parseInt(arr[i]);
		}
		Assignment101 assignment101 = new Assignment101();
		assignment101.printSecondLargestNumber(numbers);
		
		sc.close();
	}
}
