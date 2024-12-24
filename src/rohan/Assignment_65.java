/*
* input : {"Te1Ch", "A2as3Hvi", "CrE45di555ts", "ANSH"}
output : [HSNa,StidErc, IvHsaa, hCet]
 
*/
package rohan;

import java.util.Arrays;

public class Assignment_65 {
	public static void main(String[] args) {
		Assignment_65 assignment = new Assignment_65();
		String[] input = { "Te1Ch", "A2as3Hvi", "CrE45di555ts", "ANSH" };
		String[] str = assignment.StringReverseArray(input);
		System.out.println(Arrays.toString(str));
	}

	String StringRev(String str) {
		String word = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			char ch = str.charAt(i);
			if (Character.isAlphabetic(ch)) {
				word += str.charAt(i);
			}
		}
		return word;
	}

	String[] StringReverseArray(String[] input) {
		String[] Output = new String[input.length];
		for (int i = input.length - 1; i >= 0; i--) {
			Output[i] = StringRev(input[input.length - 1 - i]);
		}
		return Output;
	}

}
