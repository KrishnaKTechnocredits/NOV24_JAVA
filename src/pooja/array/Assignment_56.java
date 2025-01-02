package pooja.array;

import java.util.Arrays;

/*Assignment - 56 : 20th Dec'2024 [15 mins]
Return the array having maximum number from each index of given two array.

input : 
{10,55,22,77,88}
{5,102,28,77,18}

output : [10,102,28,77,88]

NOTE : Use sop(Arrays.toString(output)) to print the array without for loop

*/
public class Assignment_56 {

	int[] getMaxNoFromIndex(int[] arr1, int[] arr2) {
		int[] ans = new int[arr1.length];
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] < arr2[i]) {
				ans[i] = arr2[i];
			} else {
				ans[i] = arr1[i];
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		int[] arr1 = { 10, 55, 22, 77, 88 };
		int[] arr2 = { 5, 102, 28, 77, 18 };
		Assignment_56 assignment_56 = new Assignment_56();
		int[] ans = assignment_56.getMaxNoFromIndex(arr1, arr2);
		System.out.println("The given arrays are : " + Arrays.toString(arr1) + " & " + Arrays.toString(arr2) + "\n"
				+ "Maximum numbers arrays is : " + Arrays.toString(ans));
	}
}