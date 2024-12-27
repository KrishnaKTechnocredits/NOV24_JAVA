package pratiksha;

import java.util.Arrays;

public class Assignment64 {
	/*
	 //Assignment - 64 : 22nd Dec'2024 [20 min]
//reverse each string in array and place at in reverse order, each word first letter capital and rest in lowercase.
//
//input : {"Tech", "Aashvi", "Credits", "Ansh"}
//output : [Hsna,Stiderc, Ivhsaa, Hcet]

	 */
	
	String getReverseSring(String str) {
		String revString = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			revString += str.charAt(i);
		}
		return revString;
	}

	String getFirstCapital(String str) {
		String revString = "";
		revString = str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
		return revString;
	}

	String getRevArray(String[] array) {
		String[] output = new String[array.length];
		for (int i = 0, j = array.length - 1; i < array.length; i++, j--) {
			output[j] = getReverseSring(array[i]);
			output[j] = getFirstCapital(output[j]);
		}
		return Arrays.toString(output);
	}
	public static void main(String[] args) {
		String[] input = { "TeCh", "Aashvi", "Credits", "AnsH" };
		System.out.println("Input Array:" + Arrays.toString(input));
		Assignment64 assignment64 = new Assignment64();
		System.out.println("Output Array:" + assignment64.getRevArray(input));
	}

}
