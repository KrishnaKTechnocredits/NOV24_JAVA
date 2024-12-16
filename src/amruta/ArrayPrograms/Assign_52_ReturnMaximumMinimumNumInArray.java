/*
Assignment - 52 : 16th Dec'2024 [15 mins]

return maximum and minimum number from given array.

int getMaxMinNum(int[] arr){
	
}
*/

package amruta.ArrayPrograms;

public class Assign_52_ReturnMaximumMinimumNumInArray {

	int getMaxNum(int[] arr) {
		int maxNum = arr[0];
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] > maxNum)
				maxNum = arr[index];
		}
		return maxNum;
	}

	int getMinNum(int[] arr) {
		int minNum = arr[0];
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] < minNum)
				minNum = arr[index];
		}
		return minNum;
	}

	public static void main(String[] args) {
		int[] arr = { 55, 14, 85, 36, 96, 24, 44, 62 };
		Assign_52_ReturnMaximumMinimumNumInArray a52 = new Assign_52_ReturnMaximumMinimumNumInArray();
		int maxNum = a52.getMaxNum(arr);
		System.out.println("Maximum number in given array is --> " + maxNum);
		int minNum = a52.getMinNum(arr);
		System.out.println("Minimum number in given array is --> " + minNum);
	}
}