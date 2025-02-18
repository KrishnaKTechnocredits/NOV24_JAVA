package kishor;

import java.util.Scanner;

//On user defined numbers-array, find out the second largetest number. 
//Hint : Use scanner.

public class Assignment101_SecondLarget_Scanner {

	static void secondMaxNumber(int[] arr) {
		int max = arr[0];
		int second = arr[1];
		if (arr[1] > arr[0]) {
			max = arr[1];
			second = arr[0];
		}

		for (int i = 2; i < arr.length; i++) {
			int num = arr[i];
			if (num > max) {
				second = max;
				max = num;
			} else if (num > second) {
				second = num;
			}
		}
		System.out.println("second maximum number is:- "+second);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("How many numbers you want in array:-");

		int length = sc.nextInt();

		int arr[] = new int[length];

		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter the number:-");
			arr[i] = sc.nextInt();
		}
		secondMaxNumber(arr);
		sc.close();
	}
}
