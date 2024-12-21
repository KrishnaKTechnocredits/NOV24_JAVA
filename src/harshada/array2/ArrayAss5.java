//Assignment - 50 : 16th Dec'2024 [10 mins] [imp]
//
//return the minimum number from given array. 
//
//input : {44,45,22,25,47,29,46}
//output : 22
//
//
//input : {-44,-45,-22,-25,-47,29,46}
//output : -47

package harshada.array2;

public class ArrayAss5 {
	int getMinimunNum(int[] input) {
		int minNum = input[0];
		for (int i = 1; i < input.length; i++) {
			if (input[i] < minNum) {
				minNum = input[i];
			}
		}
		return minNum;
	}

	public static void main(String[] args) {
		ArrayAss5 arrayAss5 = new ArrayAss5();
		int[] arr1 = { 44, 45, 22, 25, 47, 29, 46 };
		int[] arr2 = { -44, -45, -22, -25, -47, 29, 46 };
		System.out.println("Minimum Num form given array is : " + arrayAss5.getMinimunNum(arr1));
		System.out.println("Minimum Num form given array is : " + arrayAss5.getMinimunNum(arr2));
	}
}
