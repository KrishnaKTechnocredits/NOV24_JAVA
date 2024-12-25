package pooja.array;

import java.util.Arrays;

/*
 Assignment - 53 : 16th Dec'2024 [5-7 mins]

print the array in reverse order. 

input : {10,34,22,16,19,99}
output : 99
         19
		 16
		 22
		 34
		 10
*/
public class Assignment_53 {

	void printReversedArray(int[] arr) {
		int[] ans = new int[arr.length];
		int cnt = 0;
		for (int i = arr.length - 1; i >= 0; i--) {
			ans[cnt] = arr[i];
			System.out.println(arr[i]);
			cnt++;
		}
		System.out.println("-------");
		System.out.println(
				"Given Array is : " + Arrays.toString(arr) + "\n" + "Reversed Arrays is : " + Arrays.toString(ans));
	}

	public static void main(String[] args) {
		int[] input = { 10, 34, 22, 16, 19, 99 };
		Assignment_53 assignment_53 = new Assignment_53();
		assignment_53.printReversedArray(input);
	}
}