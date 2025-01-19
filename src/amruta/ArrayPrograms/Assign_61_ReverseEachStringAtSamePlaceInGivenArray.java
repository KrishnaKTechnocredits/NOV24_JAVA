/*
Assignment - 61 : 22nd Dec'2024 [20 min] [IMP]
reverse each string in array at the same place.

input : {"tech", "aashvi", "credits"}
output : [hcet, ivhsaa, stiderc]
*/
package amruta.ArrayPrograms;

import java.util.Arrays;

public class Assign_61_ReverseEachStringAtSamePlaceInGivenArray {

	String reverseStringAtSamePlace(String str) {
		String reverseString = "";
		for (int index = str.length() - 1; index >= 0; index--) {
			reverseString += str.charAt(index);
		}
		return reverseString;
	}

	void takeArray(String[] arr) {
		for (int index = 0; index < arr.length; index++) {
			arr[index] = reverseStringAtSamePlace(arr[index]);
		}
		System.out.println("Array after reversing each string at same place ---> " + Arrays.toString(arr));
	}

	public static void main(String[] args) {
		String[] input = { "tech", "aashvi", "credits" };
		System.out.println("Given Array ---> " + Arrays.toString(input));
		System.out.println("------------------------------------------------");
		Assign_61_ReverseEachStringAtSamePlaceInGivenArray a61 = new Assign_61_ReverseEachStringAtSamePlaceInGivenArray();
		a61.takeArray(input);

	}
}