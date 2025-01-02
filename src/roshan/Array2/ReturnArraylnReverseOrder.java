resultpackage roshan.Array2;

public class ReturnArraylnReverseOrder {
	int[] returnReverseArray(int[] number) { // note add int [] only int will give array
		int[] revArray = new int[number.length]; // Used to store the elements of the number array in reverse order.

		for (int i = number.length - 1, j = 0; i >= 0; i--, j++) { // add loop carefully
			revArray[j] = number[i];
		}
		return revArray;

	}

	public static void main(String[] args) {
		int[] number = { 10, 34, 22, 16, 19, 99 };
		ReturnArraylnReverseOrder returnarrayinreverseorder = new ReturnArraylnReverseOrder();
		int[] output = returnarrayinreverseorder.returnReverseArray(number);
		System.out.println("Reverse order is : ");
		for (int i = 0; i < output.length; i++) { // to iterate through each element of the output array to print its
													// contents in reverse order.
			System.out.println(output[i]);
		}

	}
}

/*Assignment - 54 : 16th Dec'2024 [5-7 mins]

 * return the array in reverse order.
 * 
 * input : {10,34,22,16,19,99} output : 99 19 16 22 34 10
 */

/*
 * note:-Implicit Relationship: j does not need a separate ending condition
 * because it directly depends on i.
 *
 * Controlled by i: As i covers all elements of number, j covers all elements of
 * revArray.
 * 
 * Same Length: Both arrays have the same length, ensuring all elements are
 * processed
 */