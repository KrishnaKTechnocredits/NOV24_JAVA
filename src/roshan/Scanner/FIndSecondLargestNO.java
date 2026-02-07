package roshan.Scanner;

import java.util.Scanner;

public class FIndSecondLargestNO {

	static void usrinput() {
		System.out.println("Give how many no you want");
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		int arr[] = new int[length];

		for (int i = 0; i < arr.length; i++) {
			System.out.println("enter no: ");
			arr[i] = sc.nextInt();

		}

		sc.close(); // mistake closed scanner in for loop
		getSecondMaxNo(arr);// mistake write this inside loop should be out side of loop
	}

	public static void getSecondMaxNo(int[] arr) {
		int maxNo = arr[0];
		int SecondmaxNo = arr[1];
		if (maxNo < SecondmaxNo) {
			maxNo = SecondmaxNo;
			SecondmaxNo = maxNo;

		}

		for (int i = 2; i < arr.length; i++) {// mistake made not max no with i directly compare with Second max which
												// give error
			if (arr[i] > maxNo) {
				SecondmaxNo = maxNo;
				maxNo = arr[i];
			} else if (arr[i] > SecondmaxNo && arr[i] != maxNo) {
				SecondmaxNo = arr[i];
			}
		}

		System.out.println("second max no is:" + SecondmaxNo);

	}

	public static void main(String[] args) {
		usrinput();
	}
}


/*note for mistake
 * Your logic is wrong because the way you’re updating SecondmaxNo is actually
 * moving toward finding the minimum, not the second largest. Let’s break it
 * down: What your code does int maxNo = arr[0]; int SecondmaxNo = arr[1]; if
 * (maxNo < SecondmaxNo) { SecondmaxNo = maxNo; }
 * 
 * 
 * - This part is already flawed: if arr[0] < arr[1], you should swap them so
 * that maxNo is the larger and SecondmaxNo is the smaller. But your code
 * overwrites SecondmaxNo incorrectly. for (int i = 2; i < arr.length; i++) { if
 * (arr[i] < SecondmaxNo) { SecondmaxNo = arr[i]; } }
 * 
 * 
 * - Here you’re checking if the current element is less than SecondmaxNo. -
 * That condition will keep replacing SecondmaxNo with smaller values, so you’re
 * actually finding something close to the minimum, not the second maximum.
 * 
 * Correct logic for second largest You need to check for numbers greater
 */


/*
 * Good catch — that && arr[i] != maxNo part is important. Let’s break down what
 * happens if you remove it: Current condition else if (arr[i] > secondMaxNo &&
 * arr[i] != maxNo)
 * 
 * 
 * - This ensures that the candidate for second largest is less than the maximum
 * (so you don’t accidentally assign the same value as the maximum again). -
 * Example: If your array is [30, 30, 25], the largest is 30. Without the !=
 * maxNo check, the second largest would also be set to 30, which is wrong. With
 * the check, it correctly picks 25.
 */



