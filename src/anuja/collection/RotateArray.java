package anuja.collection;

import java.util.*;

public class RotateArray {

	public static void main(String[] args) {
		RotateArray a = new RotateArray();
		int[] arr = { 1,2,3,4,5,6};
		int count = 2;
		a.rotateArrayByGivenNnumbers(arr, count);

	}

	void rotateArrayByGivenNnumbers(int[] arr, int num) {
		if(arr.length <=1) {
			System.out.println("Please enter valid array \n");
			return;
		}
		System.out.println("Rotate given array " + Arrays.toString(arr) + " By " + num + " position \n ");
		for (int i = 1; i <= num; i++) {
			rotateArrayLogic(arr, i==2);// i==2 used to print only for 2nd time, means do not print always for each
											// for loop index.
			// if you want to print always then send true,second method accept array adn
			// boolean type only.
		}

	}

	static void rotateArrayLogic(int[] arr, boolean shouldPrint) {
		int temp = arr[arr.length - 1];
		for (int i = arr.length - 1; i >= 1; i--) {
			arr[i] = arr[i - 1];
		}
		arr[0] = temp;
		if (shouldPrint)// logic to handle when to print.
			System.out.print(Arrays.toString(arr) +"\n");
	}
}