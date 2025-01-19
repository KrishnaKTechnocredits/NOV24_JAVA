/*Assignment - 65 : 22nd Dec'2024 [20 min]
reverse each string in array and place at in reverse order.

input : {"Te1Ch", "A2as3Hvi", "CrE45di555ts", "ANSH"}
output : [HSNa,StidErc, IvHsaa, HCet]

Hint : First letter in Uppercase + last Letter in lowercase + 
		all other characters in same case + exclude digits
*/
package harshada.Array3;

import java.util.Arrays;

public class Ass65_ReversStringAndReverseArrUpperLowerDigit {

	String reverseStringwith1stUpperLastLower(String str) {
		String output = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			output += str.charAt(i);
		}
		// System.out.println(output.substring(0,1).toUpperCase()+output.substring(1,str.length()-1)+output.substring(str.length()-1).toLowerCase());
		return output.substring(0, 1).toUpperCase() + output.substring(1, str.length() - 1)
				+ output.substring(str.length() - 1).toLowerCase();
	}

	String withoutDigitString(String str) {
		String output = "";
		for (int i = 0; i < str.length(); i++) {
			if (!Character.isDigit(str.charAt(i))) {
				output = output + str.charAt(i);
			}
		}
		return reverseStringwith1stUpperLastLower(output);
	}

	String[] reverseArray(String[] arr) {
		String[] output = new String[arr.length];
		for (int i = 0, j = arr.length - 1; i < arr.length; i++, j--) {
			output[j] = withoutDigitString(arr[i]);
		}
		return output;
	}

	public static void main(String[] args) {
		Ass65_ReversStringAndReverseArrUpperLowerDigit ass65 = new Ass65_ReversStringAndReverseArrUpperLowerDigit();

		String[] input = { "Te1Ch", "A2as3Hvi", "CrE45di555ts", "ANSH" };
		String[] output = ass65.reverseArray(input);
		System.out.println("Original Array is " + Arrays.toString(input));
		System.out.println(
				"Reversed Array with each string with First Later of word in Uppercase,Last in lower case and without digit "
						+ Arrays.toString(output));
	}
}
