package pratiksha;

import java.util.Arrays;

public class Assignment62 {
/*
 //Assignment - 62 : 22nd Dec'2024 [20 min] [IMP]
//reverse each string in array and place at in reverse order.
//
//input : {"tech", "aashvi", "Credits", "Ansh"}
//output : [hsnA,stiderC, ivhsaa, hcet]
 */
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
			output[(array.length - 1) - i] = getReverseString(array[i]);
		}
		return Arrays.toString(output);
	}

	public static void main(String[] args) {
		String[] input = { "tech", "aashvi", "Credits", "Ansh" };
		System.out.println("Input Array:" + Arrays.toString(input));
		Assignment62 assignment62 = new Assignment62();
		System.out.println("Output Array:" + assignment62.getRevArray(input));
	}
}

