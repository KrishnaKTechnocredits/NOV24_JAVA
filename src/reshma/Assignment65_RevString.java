package reshma;

import java.util.Arrays;

public class Assignment65_RevString {
	String getRevString(String input) {
		String output = "";
		for (int i = input.length() - 1; i >= 0; i--) {
			output += input.charAt(i);
		}
		return output;
	}
	String convertFLetterToUCaseAndLletterToLCase(String input) {
		input =getRevString(input);
		String input1 = input.substring(0, 1);
		input1 = input1.toUpperCase();
		String input2 = input.substring(1, input.length() - 1);
		String input3 =  input.substring(input.length() - 1, input.length());
		input3= input3.toLowerCase();
		input = input1 + input2 + input3 ;
	
		return input;
	}	
	String removeDigitsFromString(String input) {
		String  stringname= "";
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (!Character.isDigit(ch))
				stringname += ch;
		}
		stringname = convertFLetterToUCaseAndLletterToLCase(stringname);
		return stringname;
	}

	void printRevStringArray(String[] input) {
		String[] output = new String[input.length];
		int count = 0;
		for (int i = input.length - 1; i >= 0; i--) {
			output[count] = removeDigitsFromString(input[i]);
			count++;
		}
		 System.out.println("String in array in rev order with First Letter in Uppercase & Last letter in lowercase is: " );

		System.out.println(Arrays.toString(output));
	}

	public static void main(String[] args) {
		Assignment65_RevString a65 = new Assignment65_RevString();
		String[] input =  {"Te1Ch", "A2as3Hvi", "CrE45di555ts", "ANSH"};
		 a65.printRevStringArray(input);
	}
}
