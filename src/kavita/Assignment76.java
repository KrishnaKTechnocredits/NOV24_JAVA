package kavita;

import java.util.Arrays;

/*return the list of names having atleast one uppercase, one lowercase, one digit and one special character (_, !, #, $) in the name.
String[] arr = {"TechnOCrediTs", "TEch1n_o##", "Credits", "Tit!iksHa", "PUNE1#"};
output : {"TEch1n_o##", "Tit!iksHa"}
Time: */
public class Assignment76 {
	boolean isNameHavingCases(String str) {
		int uCount = 0;
		int lCount = 0;
		int dCount = 0;
		int sCount = 0;
		boolean value = false;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isUpperCase(ch) && uCount == 0) {
				uCount++;
			} else if (Character.isLowerCase(ch) && lCount == 0) {
				lCount++;
			} else if (Character.isDigit(ch) && dCount == 0) {
				dCount++;
			} else if ((ch == '_' || ch == '!' || ch == '#' || ch == '$') && sCount == 0) {
				sCount++;
			}
		}
		if ((uCount + lCount + dCount + sCount) == 4) {
			value = true;
		}
		return value;
	}

	String[] getArray(String[] array) {
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			if (isNameHavingCases(array[i])) {
				count++;
			}
		}
		String[] outputArray = new String[count];
		for (int i = 0, j = 0; i < array.length; i++) {
			if (isNameHavingCases(array[i])) {
				outputArray[j++] = array[i];
			}
		}
		return outputArray;
	}

	public static void main(String[] args) {
		String[] arr = { "TechnOCrediTs", "TEch1n_o##", "Credits", "Tit!iksHa1", "PUNE1#" };
		System.out.println("Input:" + Arrays.toString(arr));
		Assignment76 assignment76 = new Assignment76();
		System.out.println("Output: " + Arrays.toString(assignment76.getArray(arr)));
	}
}


