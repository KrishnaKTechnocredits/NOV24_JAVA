//Assignment - 61 : 22nd Dec'2024 [20 min] [IMP]  ---- [my time 25min]
//reverse each string in array at the same place.
//
//input : {"tech", "aashvi", "credits"}
//output : [hcet, ivhsaa, stiderc]

package komal.Array;

import java.util.Arrays;

public class Assignment61 {
//	 static final String name = "komal";

	String getReverseWord(String currentWord) {
		String output = " ";
		for (int i = currentWord.length() - 1; i >= 0; i--) {
			output = output + currentWord.charAt(i);
		}
		return output;
	}

	String[] getReverseEachStr(String[] input) {
		String currentWord = " ";
		for (int i = 0; i < input.length; i++) {
			currentWord = input[i];
			input[i] = getReverseWord(currentWord);
		}

//		String[] output = new String[input.length];
//		for (int i = input.length - 1, j = 0; i >= 0; i--, j++) {
//			output[j] = input[i];
//		}

		return input;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] input = { "tech", "aashvi", "credits" };
		Assignment61 a61 = new Assignment61();
		String output[] = a61.getReverseEachStr(input);
		System.out.print(Arrays.toString(output));
	}

}
