//Assignment - 76 : 11th Jan

//return the list of names having atleast one uppercase, one lowercase, one digit and one special character (_, !, #, $) in the name.
//
//String[] arr = {"TechnOCrediTs", "TEch1n_o##", "Credits", "Tit!iksHa", "PUNE1#"};
//output : {"TEch1n_o##", "Tit!iksHa"}


package pratiksha;

import java.util.Arrays;

public class Assignment76 {
	
	boolean isStringPresent(String str) {
		int UCount = 0;
		int LCount = 0;
		int DCount = 0;
		int SCount = 0;
		boolean value = false;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isUpperCase(ch) && UCount == 0) {
				UCount++;
			} else if (Character.isLowerCase(ch) && LCount == 0) {
				LCount++;
			} else if (Character.isDigit(ch) && DCount == 0) {
				DCount++;
			} else if ((ch == '_' || ch == '!' || ch == '#' || ch == '$') && SCount == 0) {
				SCount++;
			}
		}
		if ((UCount + LCount + DCount + SCount) == 4) {
			value = true;
		}
		return value;
	}

	String[] getArray(String[] array) {
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			if (isStringPresent(array[i])) {
				count++;
			}
		}
		String[] outputArray = new String[count];
		for (int i = 0, j = 0; i < array.length; i++) {
			if (isStringPresent(array[i])) {
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
