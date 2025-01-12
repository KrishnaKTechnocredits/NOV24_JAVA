
//Assignment - 62 : 22nd Dec'2024 [20 min] [IMP]  -------[myTime 25 min]
//reverse each string in array and place at in reverse order.
//
//input : {"tech", "aashvi", "Credits", "Ansh"}
//output : [hsnA,stiderC, ivhsaa, hcet]

package komal.Array;

import java.util.Arrays;

public class Assignment62 {

	String getReverseWord(String str) {
		String output = " ";
		for (int i = str.length() - 1; i >= 0; i--) {
			output = output + str.charAt(i);
		}
		return output;
	}

	String[] getReverseArray(String[] input) {
		String[] output = new String[input.length];
		String str = "";
		for (int i = 0, j = input.length - 1; i < input.length; i++, j--) {
			str = getReverseWord(input[i]);
			output[j] = str;
		}
		return output;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment62 a62 = new Assignment62();
		String[] input = { "tech", "aashvi", "Credits", "Ansh" };
		String[] output = a62.getReverseArray(input);
		System.out.println(Arrays.toString(output));
	}
}