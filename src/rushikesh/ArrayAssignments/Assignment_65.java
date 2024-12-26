//input : {"Te1Ch", "A2as3Hvi", "CrE45di555ts", "ANSH"}
//output : [HSNa,StidErc, IvHsaa, HCet]

package rushikesh.ArrayAssignments;

import java.util.Arrays;

public class Assignment_65 {

	String getStringInRevOrder(String str) {
		String word = "";
		for (int index = str.length() - 1; index >= 0; index--) {
			word = word + str.charAt(index);
		}
		return word;
	}

	String gtStringWithoutDigit(String str) {
		String word = "";
		for (int index = 0; index < str.length(); index++) {
			if (!Character.isDigit(str.charAt(index))) {
				word = word + str.charAt(index);
			}
		}
		return word;
	}

	String getFirstLetinUcaseandLastInLcase(String str) {
		return str.substring(0, 1).toUpperCase() + str.substring(1, str.length() - 1)
				+ str.substring(str.length() - 1).toLowerCase();
	}

	String[] getArrayInRevOrder(String[] input) {
		String[] output = new String[input.length];
		for (int index = 0, outerIndex = input.length - 1; index < input.length; index++, outerIndex--) {
			String word = getStringInRevOrder(input[index]);
			word = gtStringWithoutDigit(word);
			word = getFirstLetinUcaseandLastInLcase(word);
			output[outerIndex] = word;
		}
		return output;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment_65 assignment_65 = new Assignment_65();
		String[] arr = { "Te1Ch", "A2as3Hvi", "CrE45di555ts", "ANSH" };
		String[] str = assignment_65.getArrayInRevOrder(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(str));
	}
}
