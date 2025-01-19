/*
Assignment - 50 : 16th Dec'2024 [10 mins] [imp]

return the minimum number from given array. 

input : {44,45,22,25,47,29,46}
output : 22

input : {-44,-45,-22,-25,-47,29,46}
output : -47
*/

package amruta.ArrayPrograms;

public class Assign_50_FindMinimumNumInArray {

	static int findMinimumNum(int[] arr) {
		int minNum = arr[0];
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] < minNum)
				minNum = arr[index];
		}
		return minNum;
	}

	public static void main(String[] args) {
		int[] arr = { 44, 45, 22, 25, 47, 29, 46 };
		int[] arr1 = { -44, -45, -22, -25, -47, -29, -46 };
		int num = findMinimumNum(arr);
		System.out.println("Minimum Number In Given Array --> " + num);
		int num2 = findMinimumNum(arr1);
		System.out.println("Minimum Number in Given Array--> " + num2);
	}
}