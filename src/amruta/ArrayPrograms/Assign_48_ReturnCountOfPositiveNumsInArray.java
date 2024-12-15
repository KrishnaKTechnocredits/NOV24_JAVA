/*
Assignment - 48 : 15th Dec'2024 [15 mins]

From given int array, return count of positive numbers.

input : {10,30,-45,66,-10};
output : 3 
*/

package amruta.ArrayPrograms;

public class Assign_48_ReturnCountOfPositiveNumsInArray {

	static int getArray(int[] arr) {
		int count = 0;
		System.out.println("Positive Numbers in given array are : ");
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] > 0) {
				System.out.println(arr[index]);
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		int[] number = { 10, 30, -45, 66, -10 };
		int count = getArray(number);
		System.out.println("Count of Positive Numbers in given array is ---> " + count);
	}
}