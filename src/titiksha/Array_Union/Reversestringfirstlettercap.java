//reverse each string in array and place at in reverse order.
//input : {"Te1Ch", "A2as3Hvi", "CrE45di555ts", "ANSH"}
//output : [HSNa,StidErc, IvHsaa, HCet]
//Hint : First letter in Uppercase + last Letter in lowercase + all other characters in same case + exclude digits

package titiksha.Array_Union;

import java.util.Arrays;

public class Reversestringfirstlettercap {
	String reverseWord(String word) {
		String output = "";
		for (int i = word.length() - 1; i >= 0; i--) {
			output = output + word.charAt(i);
		}
		return output;
	}

	String getremoveDigit(String arr) {
		String digit = "";
		for (int i = 0; i < arr.length(); i++) {
			if (!Character.isDigit(arr.charAt(i))) {
				digit = digit + arr.charAt(i);
			}
		}
		return digit;
	}

	String getfirstletterCapital(String arr) {
		return arr.substring(0, 1).toUpperCase() + arr.substring(0).toLowerCase();
	}

	String[] getStringofarray(String[] arr) {
		String[] output = new String[arr.length];
		for (int i = 0, j = arr.length - 1; i < arr.length; i++) {
			String word = arr[i];
			word = reverseWord(word);
			word = getremoveDigit(word);
			word = getfirstletterCapital(word);
			output[j--] = word;
		}
		return output;
	}

	public static void main(String[] args) {
		Reversestringfirstlettercap reverseString2 = new Reversestringfirstlettercap();
		String[] result = { "Te1Ch", "A2as3Hvi", "CrE45di555ts", "ANSH" };
		System.out.println("The input array:" + Arrays.toString(result));
		String[] output1 = reverseString2.getStringofarray(result);
		System.out.println("The output array:" + Arrays.toString(output1));
	}
}
