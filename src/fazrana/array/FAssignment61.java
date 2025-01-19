//Assignment - 61 : 22nd Dec'2024 [20 min] [IMP]
//reverse each string in array at the same place.
//
//input : {"tech", "aashvi", "credits"}
//output : [hcet, ivhsaa, stiderc]

package fazrana.array;

import java.util.Arrays;

public class FAssignment61 {

	String getReverseString(String str) {
		String revString = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			revString += str.charAt(i);
		}
		return revString;
	}

	String getRevArray(String[] array) {
		String[] output = new String[array.length];
		for (int i = 0; i < array.length; i++) {
			output[i] = getReverseString(array[i]);
		}
		return Arrays.toString(output);
	}

	public static void main(String[] args) {
		String[] input = { "tech", "aashvi", "credits" };
		System.out.println("Input Array:" + Arrays.toString(input));
		FAssignment61 fassignment61 = new FAssignment61();
		System.out.println("Output array:" + fassignment61.getRevArray(input));
	}
}
