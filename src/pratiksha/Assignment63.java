package pratiksha;

import java.util.Arrays;

public class Assignment63 {
	/*
	 //Assignment - 63 : 22nd Dec'2024 [20 min] [IMP]
//reverse each string in array and place at in reverse order.
//
//input : {"TeCh", "Aashvi", "Credits", "AnsH"}
//output : [hsna,stiderc, ivhsaa, hcet]
	 */

	String getReverseString(String str) {
		str = str.toLowerCase();
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
		String[] input = { "TeCh", "Aashvi", "Credits", "AnsH" };
		System.out.println("Input Array:" + Arrays.toString(input));
		Assignment63 assignment63 = new Assignment63();
		System.out.println("Output Array:" + assignment63.getRevArray(input));
	}
}
