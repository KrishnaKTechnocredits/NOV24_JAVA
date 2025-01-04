package reshma;

import java.util.Arrays;

/* reverse each string in array and place at in reverse order.
input : {"TeCh", "Aashvi", "Credits", "AnsH"}
output : [hsna,stiderC, ivhsaa, hcet] */

public class Assignment63_RevArray {
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
			output[count] = getRevString(input[i].toLowerCase());
			count++;
		}
		return output;
	}

	public static void main(String[] args) {
		Assignment63_RevArray a63 = new Assignment63_RevArray();
		String[] input = { "tech", "aashvi", "Credits", "Ansh" };
		String[] RevArray = a63.printRevStringArray(input);
		System.out.println("String in array in rev order with lowercase is: " + Arrays.toString(RevArray));
	}
}
