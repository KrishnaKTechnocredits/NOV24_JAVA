package pooja.array;

import java.util.Arrays;

/*Assignment - 61 : 22nd Dec'2024 [20 min] [IMP]
reverse each string in array at the same place.

input : {"tech", "aashvi", "credits"}
output : [hcet, ivhsaa, stiderc]
*/
public class Assignment_61 {

	String getWordInReverseOrder(String word) {
		String str = "";
		for (int j = word.length() - 1; j >= 0; j--) {
			str += word.charAt(j);
		}
//		System.out.println(str);
		return str;
	}

	String[] reverseString(String[] input) {
		String[] arr = new String[input.length];
		for (int i = 0; i < input.length; i++) {
			arr[i] = getWordInReverseOrder(input[i]);
		}
//		System.out.println(Arrays.toString(str1));
		return arr;
	}

	public static void main(String[] args) {
		String[] input = { "tech", "aashvi", "credits" };
		Assignment_61 assignment_61 = new Assignment_61();
		System.out.println("The given array is : " + Arrays.toString(input));
		String[] ans = assignment_61.reverseString(input);
		System.out.println("The reversed array is : " + Arrays.toString(ans));
	}
}