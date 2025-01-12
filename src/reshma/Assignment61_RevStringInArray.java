package reshma;

import java.util.Arrays;

/* reverse each string in array at the same place.

input : {"tech", "aashvi", "credits"}
output : [hcet, ivhsaa, stiderc] */

public class Assignment61_RevStringInArray {
	String getRevString(String input) {
		String output = "";
		for (int i = input.length() - 1; i >= 0; i--) {
			output += input.charAt(i);
		}
		return output;
	}
	 String []getRevStringArray(String []input){
		 String[] output = new String[input.length];
			for (int i = 0; i < input.length; i++) {
				output[i] = getRevString(input[i]);
			}
			return output;
	 }

	public static void main(String[] args) {
		Assignment61_RevStringInArray a61 = new Assignment61_RevStringInArray();
		String[] input = { "tech", "aashvi", "credits" };		
		String[] RevStringInArray = a61.getRevStringArray(input);
		System.out.println("Reverse strings in array is: " + Arrays.toString(RevStringInArray));
		}
}
