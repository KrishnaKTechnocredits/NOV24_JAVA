package reshma;

import java.util.Arrays;
/* reverse each string in array and place at in reverse order.

input : {"tech", "aashvi", "Credits", "Ansh"}
output : [hsnA,stiderC, ivhsaa, hAssignment ] */

public class Assignment62_RevArray {
	String getRevString(String input) {
		String output = "";
		for (int i = input.length() - 1; i >= 0; i--) {
			output += input.charAt(i);
		}
		return output;
	}

	String[] printRevStringArray(String[] input) {
		String[] output = new String[input.length];
		int count = 0;
		for (int i = input.length - 1; i >= 0; i--) {
			output[count] = getRevString(input[i]);
			count++;
		}
		return output;
	}

	public static void main(String[] args) {
		Assignment62_RevArray a62 = new Assignment62_RevArray();
		String[] input = { "tech", "aashvi", "Credits", "Ansh" };
		String[] RevArray = a62.printRevStringArray(input);
		System.out.println("String in array in rev order is: " + Arrays.toString(RevArray));
	}
}
