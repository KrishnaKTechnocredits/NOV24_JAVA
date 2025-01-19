package rushikesh.ListOfCollection;

import java.util.ArrayList;
import java.util.List;

public class Assignment_76 {

	List<String> getListOfNameHavingMatchWithReq(String[] arr) {
		List<String> output = new ArrayList<String>();
		for (int index = 0; index < arr.length; index++) {
			String str = arr[index];
			if (isDigitinString(str) == true && isUpperCaseInString(str) == true && isLowerCaseInString(str) == true
					&& isSpecialCharInString(str) == true) {
				output.add(str);
			}
		}
		return output;
	}

	boolean isDigitinString(String str) {
		boolean flag = false;
		for (int index = 0; index < str.length(); index++) {
			if (Character.isDigit(str.charAt(index))) {
				flag = true;
			}
		}
		return flag;
	}

	boolean isUpperCaseInString(String str) {
		boolean flag = false;
		for (int index = 0; index < str.length(); index++) {
			if (Character.isUpperCase(str.charAt(index))) {
				flag = true;
			}
		}
		return flag;
	}

	boolean isLowerCaseInString(String str) {
		boolean flag = false;
		for (int index = 0; index < str.length(); index++) {
			if (Character.isLowerCase(str.charAt(index))) {
				flag = true;
			}
		}
		return flag;
	}

	boolean isSpecialCharInString(String str) {
		boolean flag = false;
		for (int index = 0; index < str.length(); index++) {
			if (!Character.isDigit(str.charAt(index)) && !Character.isUpperCase(str.charAt(index))
					&& !Character.isLowerCase(str.charAt(index))) {
				flag = true;
			}
		}
		return flag;
	}

	public static void main(String[] args) {
		Assignment_76 assignment_76 = new Assignment_76();
		String[] input = { "TechnOCrediTs", "TEch1n_o##", "Credits", "Tit1!iksHa", "PUNE1#" };
		List<String> output = assignment_76.getListOfNameHavingMatchWithReq(input);
		System.out.println(output);

	}

}
