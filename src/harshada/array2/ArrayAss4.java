//Assignment - 49 : 16th Dec'2024 [15 mins] [imp]
//
//return the maximum number from given array. 
//
//input : {44,45,22,25,47,29,46}
//output : 47
//
//input : {-44,-45,-22,-25,-47,-29,-46}
//output : -22

package harshada.array2;

public class ArrayAss4 {

	int getMaxNum(int[] input) {
		int maxNum = input[0];
		for (int i = 1; i < input.length; i++) {
			if (maxNum < input[i]) {
				maxNum = input[i];
			}
		}
		return maxNum;
	}

	public static void main(String[] args) {
		ArrayAss4 arrayAss4 = new ArrayAss4();
		int[] arr1 = { 44, 45, 22, 25, 47, 29, 46 };
		System.out.println("Max number from array is : " + arrayAss4.getMaxNum(arr1));
		int[] arr2 = { -44, -45, -22, -25, -47, -29, -46 };
		System.out.println("Max number from array is : " + arrayAss4.getMaxNum(arr2));
	}
}
