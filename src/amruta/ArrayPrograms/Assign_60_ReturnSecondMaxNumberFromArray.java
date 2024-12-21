/*
Assignment - 60 : 21st Dec'2024 [20 min]
return second maximum number from given array.

input = {33,33,19,55,53,11};
output : 53 
*/

package amruta.ArrayPrograms;

public class Assign_60_ReturnSecondMaxNumberFromArray {

	int returnSecondMaxNumber(int[] arr) {
		int maxNumber = 0;
		int secondMaxNumber = 0;

		for (int index = 0; index < arr.length; index++) {
			if (arr[index] > maxNumber) {
				secondMaxNumber = maxNumber;
				maxNumber = arr[index];
			} else {
				if (arr[index] >= secondMaxNumber) {
					secondMaxNumber = arr[index];
				}
			}
		}
		return secondMaxNumber;
	}

	public static void main(String[] args) {
		int[] input = { 33, 33, 19, 55, 53, 11 };
		Assign_60_ReturnSecondMaxNumberFromArray a60 = new Assign_60_ReturnSecondMaxNumberFromArray();
		int num = a60.returnSecondMaxNumber(input);
		System.out.println("Second Maximum Number in given Array is ---> " + num);
	}
}