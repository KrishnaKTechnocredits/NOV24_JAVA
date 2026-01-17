/*
Assignment - 60 : 21st Dec'2024 [20 min] [IMP]
return second maximum number from given array.

input = {33,33,19,55,53,11};
output : 53 
*/
package ajay_ArrayAssignments;

public class Assignment60 {

	int getMaxNumber(int[] input) {
		int maxNumber = 0;
		for (int i = 0; i < input.length; i++) {
			if (input[i] > maxNumber) {
				maxNumber = input[i];
			}
		}
		return maxNumber;

	}

	int getsecondMaxNumber(int[] input) {
		int maxNumber = getMaxNumber(input);
		int secondMaxNum = 0;
		for (int i = 0; i < input.length; i++) {
			if (input[i] < maxNumber) {
				if (input[i] > secondMaxNum) {
					secondMaxNum = input[i];
				}
			}
		}
		return secondMaxNum;
	}

	public static void main(String[] args) {
		Assignment60 assignment60 = new Assignment60();
		int[] input = { 33, 33, 19, 55, 53, 11 };
		int result = assignment60.getsecondMaxNumber(input);
		System.out.println("Second Maximum Number from Given String is = " + result);

	}

}
