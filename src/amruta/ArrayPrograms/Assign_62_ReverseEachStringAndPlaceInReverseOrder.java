/*
Assignment - 62 : 22nd Dec'2024 [20 min] [IMP]
reverse each string in array and place at in reverse order.

input : {"tech", "aashvi", "Credits", "Ansh"}
*/
package amruta.ArrayPrograms;

import java.util.Arrays;

public class Assign_62_ReverseEachStringAndPlaceInReverseOrder {

	String reverseString(String str) {
		String reverseString = "";
		for (int index = str.length() - 1; index >= 0; index--) {
			reverseString += str.charAt(index);
		}
		return reverseString;
	}

	void takeArray(String[] arr) {
		String[] op = new String[arr.length];
		int count = 0;
		for (int index = arr.length - 1; index >= 0; index--) {
			op[count] = reverseString(arr[index]);
			count++;
		}
		System.out.println("Array after reversing each string in reverse order ---> " + Arrays.toString(op));
	}

	public static void main(String[] args) {
		String[] input = { "tech", "aashvi", "Credits", "Ansh" };
		System.out.println("Given Array ---> " + Arrays.toString(input));
		System.out.println("------------------------------------------------");
		Assign_62_ReverseEachStringAndPlaceInReverseOrder a62 = new Assign_62_ReverseEachStringAndPlaceInReverseOrder();
		a62.takeArray(input);

	}
}