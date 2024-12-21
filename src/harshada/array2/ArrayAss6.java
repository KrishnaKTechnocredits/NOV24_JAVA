//Assignment - 51 : 16th Dec'2024 [15 mins]
//
//print maximum and minimum number from given array.

package harshada.array2;

public class ArrayAss6 {

	void printMaxMinNum(int[] input) {
		int maxNum = input[0], minNum = input[0];

		for (int i = 1; i < input.length; i++) {
			if (maxNum < input[i]) {
				maxNum = input[i];
			}

			if (input[i] < minNum) {
				minNum = input[i];
			}
		}
		System.out.println("Max number from Array is " + maxNum + " and Min number is " + minNum);
	}

	public static void main(String[] args) {
		ArrayAss6 arrayAss6 = new ArrayAss6();
		int[] arr2 = { -44, -45, -22, -25, -47, 29, 46 };
		arrayAss6.printMaxMinNum(arr2);
	}
}
