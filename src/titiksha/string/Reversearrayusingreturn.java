//return the array having elements in reverse order of original array.
//{10,34,22,16,19,99}
package titiksha.string;

import java.util.Arrays;

public class Reversearrayusingreturn {
	int[] getreverseorder(int[] arr) {
		int[] output = new int[arr.length];

		for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
			output[j] = arr[i];
		}
		return output;
	}

	public static void main(String[] args) {
		Reversearrayusingreturn reverseorder = new Reversearrayusingreturn();
		int[] array = { 10, 34, 22, 16, 19, 99 };
		int[] output = reverseorder.getreverseorder(array);
		System.out.println(Arrays.toString(output));

	}
}
