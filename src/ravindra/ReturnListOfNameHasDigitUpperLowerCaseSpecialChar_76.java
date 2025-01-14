package ravindra;

import java.util.ArrayList;
import java.util.List;

public class ReturnListOfNameHasDigitUpperLowerCaseSpecialChar_76 {
	public static void main(String[] args) {
		String[] arr = { "TechnOCrediTs", "TEch1n_o##", "Credits", "Ti1t!iksHa", "PUNE1#" };
		List<String> list = listOfName(arr);
		System.out.println(list);
	}

	static List<String> listOfName(String[] arr) {
		List<String> listofnames = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			String name = arr[i];
			boolean digit = false;
			boolean uppercase = false;
			boolean lowercase = false;
			boolean specialChar = false;
			for (int j = 0; j < name.length(); j++) {
				char ch = name.charAt(j);

				if (Character.isDigit(ch)) {
					digit = true;
				} else if (Character.isUpperCase(ch)) {
					uppercase = true;
				} else if (Character.isLowerCase(ch)) {
					lowercase = true;
				} else if (ch == '_' || ch == '#' || ch == '$' || ch == '!') {
					specialChar = true;
				}
				if (digit && uppercase && lowercase && specialChar) {
					listofnames.add(name);
					break;
				}
			}
			
		}
		return listofnames;
	}
}
