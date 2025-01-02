package kishor;
//reverse each string in array at the same place.

//input : {"tech", "aashvi", "credits"

import java.util.Arrays;

public class Assignment61_ReverseStringArray {

	String getRevString(String input) {
		String str = "";
		for (int i = input.length() - 1; i >= 0; i--) {
			char ch = input.charAt(i);
			str = str + ch;
		}
		return str;
	}

	String[] getStringRevArray(String input[]) {
		String[] obj = new String[input.length];
		// no need of two object as all action happened on same index
		for (int k = 0; k < input.length; k++) {
			obj[k] = getRevString(input[k]);
		}
		return obj;
	}

	public static void main(String[] args) {
		String[] input = { "tech", "aashvi", "credits" };

		Assignment61_ReverseStringArray assignment60 = new Assignment61_ReverseStringArray();
		String[] ans = assignment60.getStringRevArray(input);
		System.out.println(Arrays.toString(ans));
	}
}
