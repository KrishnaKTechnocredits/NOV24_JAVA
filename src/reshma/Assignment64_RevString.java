package reshma;

import java.util.Arrays;

public class Assignment64_RevString {
	String getRevString(String input) {
		String output = "";
		for (int i = input.length() - 1; i >= 0; i--) {
			output += input.charAt(i);
		}
		return output;
	}
	String convertFirstLetterToUpperCase(String input) {
		input =getRevString(input);
		String input1 = input.substring(0, 1);
		input1 = input1.toUpperCase();
		String input2 = input.substring(1);
		input2 = input2.toLowerCase();
		input = input1 + input2;
	
		return input;
	}	

	void printRevStringArray(String[] input) {
		String[] output = new String[input.length];
		int count = 0;
		for (int i = input.length - 1; i >= 0; i--) {
			output[count] = convertFirstLetterToUpperCase(input[i]);
			count++;
		}
		System.out.println("String in array in rev order with First Letter in Uppercase is: " + Arrays.toString(output));
	}

	public static void main(String[] args) {
		Assignment64_RevString a64 = new Assignment64_RevString();
		String[] input =  {"Tech", "Aashvi", "Credits", "Ansh"};
		 a64.printRevStringArray(input);
	}
}
