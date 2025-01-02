package rushikesh.Programming_Test;

import java.util.Arrays;

public class Test2 {

	String getWordInRevOrder(String str) {
		String word = "";
		for (int index = str.length() - 1; index >= 0; index--) {
			word = word + str.charAt(index);
		}
		return word;
	}

	boolean isOvelMoreThan1(String str) {
		boolean flag = false;
		char[] ch = { 'a', 'e', 'i', 'o', 'u' };
		int count = 0;
		int charIndex = 0;
		for (int index = 0; index < str.length(); index++) {
			if (ch[charIndex] == str.charAt(index)) {
				count++;
				charIndex++;
				if (count == 2) {
					flag = true;
					break;
				}
			}

		}
		return flag;
	}

	String[] getArray(String[] input) {
		String[] output = new String[input.length];
		for (int index = 0; index < input.length; index++) {
			if (isOvelMoreThan1(input[index]) == true) {
				String word = getWordInRevOrder(input[index]);
				output[index] = word;
			} else if (isOvelMoreThan1(input[index]) == false) {
				output[index] = input[index];
			}
		}
		return output;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test2 test2 = new Test2();
		String[] arr = { "apple", "sky", "orange", "try", "eagle" };
		String[] output = test2.getArray(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(output));
	}

}
