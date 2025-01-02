package pooja.array;

import java.util.Arrays;

/*Assignment - 65 : 22nd Dec'2024 [20 min]
reverse each string in array and place at in reverse order.
reverse word in array at the same place provided word should not have any digit

input : {"Te1Ch", "A2as3Hvi", "CrE45di555ts", "ANSH"}
output : [HSNa,StidErc, IvHsaa, HCet]

Hint : First letter in Uppercase + last Letter in lowercase + all other characters in same case + exclude digits
*/
public class Assignment_65 {

	private String getReversedWord(String str) {
		String word = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			word = word + str.charAt(i);
		}
		return word;
	}

	private String[] getReversedArray(String[] arr) {
		String[] temp = new String[arr.length];
		int cnt = 0;
		for (int i = arr.length - 1; i >= 0; i--) {
			temp[cnt] = getReversedWord(arr[i]);
			cnt++;
		}
		return temp;
	}

	private String getStringWithoutDigit(String str) {
		String word = "";

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isDigit(ch) == false) {
				word = word + ch;
			}
		}
		return word;
	}

	private String[] getStringArrayWithFirstUpperLastLower(String[] arr) {
		String[] temp = new String[arr.length];
		for (int i = 0; i < arr.length; i++) {
			temp[i] = arr[i].substring(0, 1).toUpperCase() + arr[i].substring(1, arr[i].length() - 1)
					+ arr[i].substring(arr[i].length() - 1, arr[i].length()).toLowerCase();
		}
		return temp;
	}

	String[] getReverseStringWODigitFirstUpperLastlower(String[] input) {
		String[] temp1 = new String[input.length];
		String[] temp2 = new String[input.length];
		String[] temp3 = new String[input.length];
		for (int i = 0; i < input.length; i++) {
			temp1[i] = getStringWithoutDigit(input[i]);
		}
		temp2 = getReversedArray(temp1);
		temp3 = getStringArrayWithFirstUpperLastLower(temp2);
		return temp3;
	}

	public static void main(String[] args) {
		String[] input = { "Te1Ch", "A2as3Hvi", "CrE45di555ts", "ANSH" };
		Assignment_65 assignment_65 = new Assignment_65();
		System.out.println("The given array is : " + Arrays.toString(input));
		String[] ans = assignment_65.getReverseStringWODigitFirstUpperLastlower(input);
		System.out.println(
				"The reversed array without digit with first letter uppercase and last letter in lowercase is : "
						+ Arrays.toString(ans));
	}
}