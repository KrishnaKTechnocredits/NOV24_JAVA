//Assignment - 48 : 15th Dec'2024 [15 mins]
//
//From given int array, return count of positive numbers.
//
//input : {10,30,-45,66,-10};
//output : 3 

package harshada.array;

public class ArrayAss3 {

	int getPositiveNum(int[] input) {
		int count = 0;
		for (int i = 0; i < input.length; i++) {
			if (input[i] > 0) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		ArrayAss3 arrayAss3 = new ArrayAss3();
		int[] input = { 10, 30, -45, 66, -10 };
		int positiveCount = arrayAss3.getPositiveNum(input);
		System.out.println("output : " + positiveCount);
	}
}
