package kishor;

import java.util.Arrays;

//input : {"Te1Ch", "A2as3Hvi", "CrE45di555ts", "ANSH"}
//output : [HSNa,StidErc, IvHsaa, HCet]
//Hint : First letter in Uppercase + last Letter in lowercase + all other characters in same case + exclude digits

public class Assignment65_RevStringRevOrderCombo {

	String getRevExcludeDigit(String input) {
		String str = "";
		for (int i = input.length() - 1; i >= 0; i--) {
			char ch = input.charAt(i);
			if (!Character.isDigit(ch)) {
				str = str + ch;
			}
		}
		return str;
	}

	String getUpperLowerCombinationString(String str) {
		String output = str.substring(0, 1).toUpperCase() + str.substring(1, str.length() - 1)
				+ str.substring(str.length() - 1).toLowerCase();
		return output;
	}

	String[] getRivStringRivOrder(String[] arr) {
		String[] obj = new String[arr.length];
		for (int i = 0, k = obj.length - 1; i < arr.length; i++, k--) {
			String output = getRevExcludeDigit(arr[i]);
			output = getUpperLowerCombinationString(output);
			obj[k] = output;
		}
		return obj;
	}

	public static void main(String[] args) {
		String[] input = { "Te1Ch", "A2as3Hvi", "CrE45di555ts", "ANSH" };
		Assignment65_RevStringRevOrderCombo assignment65 = new Assignment65_RevStringRevOrderCombo();
		String[] ans = assignment65.getRivStringRivOrder(input);
		System.out.println(Arrays.toString(ans));
	}
}
