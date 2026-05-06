package reshma;
/*  Return the list of names having at least one uppercase, one lowercase, one
 digit and one special character (_, !, #, $) in the name.
  Input : String[] arr = {"TechnOCrediTs", "TEch1n_o##", "Credits",
  "Tit!i1ksHa", "PUNE1#"};
  Output : {"TEch1n_o##", "Tit!i1ksHa"} */

import java.util.ArrayList;

public class Assignment76_ReturnStringName {
	boolean ArrayOfName(String input) {
		int UpperCaseCount = 0;
		int LowerCaseCount = 0;
		int DigitCount = 0;
		int SpecialCharCount = 0;
		for (int i = 0; i < input.length(); i++) {
			if (Character.isUpperCase(input.charAt(i))) {
				UpperCaseCount += 1;
			} else if (Character.isLowerCase(input.charAt(i))) {
				LowerCaseCount += 1;
			} else if (Character.isDigit(input.charAt(i))) {
				DigitCount += 1;
			} else {
				SpecialCharCount += 1;
			}
		}
		return (UpperCaseCount > 0 && LowerCaseCount > 0 && DigitCount > 0 && SpecialCharCount > 0);
	}

	ArrayList<String> getArrayOfName(String[] input) {
		ArrayList<String> output = new ArrayList<String>();
		for (int i = 0; i < input.length; i++) {
			if (ArrayOfName(input[i])) {
				output.add(input[i]);
			}
		}
		return output;
	}

	public static void main(String[] args) {
		Assignment76_ReturnStringName a76 = new Assignment76_ReturnStringName();
		String[] arr = { "TechnOCrediTs", "TEch1n_o##", "Credits", "Tit!i1ksHa", "PUNE1#" };
		ArrayList<String> ans = a76.getArrayOfName(arr);
		System.out.println("Output : " + ans);
	}
}
