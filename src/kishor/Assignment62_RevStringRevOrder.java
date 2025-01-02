package kishor;

import java.util.Arrays;

public class Assignment62_RevStringRevOrder {

	String getRevString(String input) {
		String str = "";
		for (int i = input.length() - 1; i >= 0; i--) {
			char ch = input.charAt(i);
			str = str + ch;
		}
		return str;
	}

	String[] getRevStringRevOrder(String[] input) {
		String[] obj = new String[input.length];
		// need of two object as we need to put our output in reverse order
		for (int i = 0, j = obj.length - 1; i < input.length; i++, j--) {
			obj[j] = getRevString(input[i]);
		}
		return obj;
	}

	public static void main(String[] args) {
		String[] input = { "tech", "aashvi", "Credits", "Ansh" };
		Assignment62_RevStringRevOrder assignment62 = new Assignment62_RevStringRevOrder();
		String[] ans = assignment62.getRevStringRevOrder(input);
		System.out.println(Arrays.toString(ans));
	}
}
