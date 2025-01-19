/*
Assignment - 51 : 16th Dec'2024 [15 mins]

print maximum and minimum number from given array.

input : {44,45,22,25,47,29,46}
output : 22

input : {-44,-45,-22,-25,-47,29,46}
output : -47
*/

package amruta.ArrayPrograms;

public class Assign_51_FindMaximumMinimumNumInArray {

	void findMinimumAndMiximumNumber(int[] arr) {
		int minNum = arr[0];
		int maxNum = arr[0];
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] > maxNum)
				maxNum = arr[index];

			if (arr[index] < minNum)
				minNum = arr[index];
		}
		System.out.println("Maximum number in given array is --> " + maxNum);
		System.out.println("Minimum number in given array is --> " + minNum);
	}

	public static void main(String[] args) {
		int[] arr = { 44, 45, 22, 25, 47, 29, 46 };
		int[] arr1 = { -44, -45, -12, -25, -47, -29, -50 };

		Assign_51_FindMaximumMinimumNumInArray a51 = new Assign_51_FindMaximumMinimumNumInArray();
		a51.findMinimumAndMiximumNumber(arr);
		System.out.println("---------------------------------------");
		a51.findMinimumAndMiximumNumber(arr1);
	}
}