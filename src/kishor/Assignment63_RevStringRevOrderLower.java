package kishor;

import java.util.Arrays;

//input : {"TeCh", "Aashvi", "Credits", "AnsH"}
//output : [hsna,stiderC, ivhsaa, hcet]

public class Assignment63_RevStringRevOrderLower {

	String getRevString(String input) {
		String str = "";
		for (int i = input.length() - 1; i >= 0; i--) {
			str = str + input.charAt(i);
		}
		return str;
	}

	String[] getRevStringRevOrderLower(String[] arr) {
		String[] obj = new String[arr.length];
		for (int i = 0, j = obj.length - 1; i < arr.length; i++, j--) {
			String lower = getRevString(arr[i]).toLowerCase();
			obj[j] = lower;
		}
		return obj;
	}

	public static void main(String[] args) {
		String[] input = { "TeCh", "Aashvi", "Credits", "AnsH" };
		Assignment63_RevStringRevOrderLower assignment63 = new Assignment63_RevStringRevOrderLower();
		String[] ans = assignment63.getRevStringRevOrderLower(input);
		System.out.println(Arrays.toString(ans));
	}
}
