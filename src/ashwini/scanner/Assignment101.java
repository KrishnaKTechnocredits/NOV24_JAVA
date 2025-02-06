package ashwini.scanner;

import java.util.Scanner;

/*
 Assignment - 101 : 1st Feb'2025
On user defined numbers, find out the second largest number. 
Hint : Use scanner.

 */
public class Assignment101 {
	void secondLargestNum(int[] input) {
		 if (input.length < 2) {
	            System.out.println("Array must have at least two elements to find the second largest number.");
	            return;
	        }
		int maxNum=input[1];
		int secondMax=input[0];
		
		if(input[0]>input[1]) {
			maxNum=input[0];
			secondMax=input[1];
		}
		for(int i=2;i<input.length;i++) {
			if(maxNum<input[i]) {
				secondMax=maxNum;
				maxNum=input[i];
			}
			else if(secondMax<input[i]&& input[i] != maxNum) {
				secondMax=input[i];
			}
		}System.out.println("Second Max Number is: "+ secondMax);
		}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); 
		System.out.println("Please enter the number of elements: ");
		 int inputsize =sc.nextInt();
		 
		 if (inputsize < 2) {
	            System.out.println("Array must have at least two elements to find the second largest number.");
	            sc.close();
	            return;
	        }
		 
		 int[] num = new int[inputsize];
		 System.out.println("Please enter the numbers:");
	        for (int i = 0; i < inputsize; i++) {
	            num[i] = sc.nextInt();
	        }

	        Assignment101 a101 = new Assignment101();
	        a101.secondLargestNum(num);
		 
	        sc.close();
		
	}

	}

