/*
Assignment - 49 : 16th Dec'2024 [15 mins] [imp]

return the maximum number from given array. 

input : {44,45,22,25,47,29,46}
output : 47

input : {-44,-45,-22,-25,-47,-29,-46}
output : -22
*/

package amruta.ArrayPrograms;

public class Assign_49_FindMaximumNumInArray {

	static int findMaxNum(int[] arr) {
		int maxNum = arr[0];
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] > maxNum)
				maxNum = arr[index];
		}
		return maxNum;
	}

	public static void main(String[] args) {
		int[] arr = { 44, 45, 22, 25, 47, 29, 46 };
		int[] arr1 = { -44, -45, -22, -25, -47, -29, -46 };
		int num = findMaxNum(arr);
		System.out.println("Maximum Number In Given Array --> " + num);
		int num2 = findMaxNum(arr1);
		System.out.println("Maximum Number In Given Array --> " + num2);
	}
}