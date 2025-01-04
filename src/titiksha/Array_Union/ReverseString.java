//Assignment - 61 : 22nd Dec'2024 [20 min] [IMP]
//reverse each string in array at the same place.
//input : {"tech", "aashvi", "credits"}
//output : [hcet, ivhsaa, stiderc]

package titiksha.Array_Union;

import java.util.Arrays;

public class ReverseString {
	String getStringReverse(String name) {
		String output = "";
		for (int j = name.length() - 1; j >= 0; j--) {
			output = output + name.charAt(j);
		}
		return output;
	}

	String[] getReverseArray(String[] arr) {
		String[] reverse = new String[arr.length];
		for (int i = 0; i < arr.length; i++) {
			reverse[i] = getStringReverse(arr[i]);
		}
		return reverse;
	}

	public static void main(String[] args) {
		ReverseString reverseString = new ReverseString();
		String[] result = { "tech", "aashvi", "credits" };
		System.out.println("The input array:" + Arrays.toString(result));
		String[] output1 = reverseString.getReverseArray(result);
		System.out.println("The output array:" + Arrays.toString(output1));
	}
}
