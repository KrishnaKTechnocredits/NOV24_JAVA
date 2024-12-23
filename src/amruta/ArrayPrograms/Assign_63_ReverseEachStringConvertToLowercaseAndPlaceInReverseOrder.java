/*
 * Assignment - 63 : 22nd Dec'2024 [20 min] [IMP]
reverse each string in array and place at in reverse order.

reverse
convert to lowercase 
place in reverse order

input : {"TeCh", "Aashvi", "Credits", "AnsH"}
output : [hsna,stiderc, ivhsaa, hcet]
 */
package amruta.ArrayPrograms;

import java.util.Arrays;

public class Assign_63_ReverseEachStringConvertToLowercaseAndPlaceInReverseOrder {

	String returnReverseString(String str) {
		String reverseString = "";
		for (int index = str.length() - 1; index >= 0; index--) {
			reverseString += str.charAt(index);
		}
		//reverseString = reverseString.toLowerCase();
		return reverseString;
	}

	void takeArray(String[] arr) {
		String[] op = new String[arr.length];
		int count = 0;
		for (int index = arr.length - 1; index >= 0; index--) {
			op[count] = returnReverseString(arr[index].toLowerCase());
			count++;
		}
		System.out.println("Array after string reversing and converting to lowercase and placed in reverse order ---> "
				+ Arrays.toString(op));
	}

	public static void main(String[] args) {
		String[] input = { "TeCh", "Aashvi", "Credits", "AnsH" };
		System.out.println("Given Array --> " + Arrays.toString(input));
		System.out.println("------------------------------------------------");
		new Assign_63_ReverseEachStringConvertToLowercaseAndPlaceInReverseOrder().takeArray(input);
	}
}

