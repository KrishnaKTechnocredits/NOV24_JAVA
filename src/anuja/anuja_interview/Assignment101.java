package anuja.anuja_interview;

import java.util.Arrays;
import java.util.Scanner;

//
////On user defined numbers, find out the second largetest number. 
////Hint : Use scanner.
////take multiple numbers from user, add in arrya and apply second large num logic. store in secodn temp variable and if any max there then update it
public class Assignment101 {
	public static void main(String[] args) {
		Assignment101 obj = new Assignment101();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the total count of input numbers you are going to enter");
		int size = sc.nextInt();
		System.out.println("Please keep on entering nums to process adn Enter any name to stop: ");
		int[] arr1 = new int[size]; // we got the new arrya of same size.

	for (int i = 0 ; i<arr1.length ; i++) {
			arr1[i] = sc.nextInt();
			System.out.println("Entered num: " + "\n" + arr1[i]);
		}

		System.out.println("Scanner stopped");
		sc.close();
		System.out.println("Input array is "+Arrays.toString(arr1)+"\n");
		obj.findMaxFromArray(arr1);
	}

	private void findMaxFromArray(int[] arr1) {
		int maxum =  arr1[0];
		int secondMax = arr1[1];
		if(secondMax > maxum) {
			maxum = secondMax;
		}
		for(int i = 2 ; i<arr1.length ; i++) {
			if(arr1[i]>maxum) {
				secondMax = maxum;
				maxum = arr1[i];
			}else if(arr1[i]<maxum && arr1[i]>secondMax) {
				secondMax = arr1[i];
			}
		}
		System.out.println("Second max from given input is: " +secondMax);
		
	}

}
