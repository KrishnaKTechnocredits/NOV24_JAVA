/*
 * Assignment - 62 : 22nd Dec'2024 [20 min] [IMP]
reverse each string in array and place at in reverse order.

input : {"tech", "aashvi", "Credits", "Ansh"}
output : [hsnA, stiderC, ivhsaa, hcet]
 */

package mayur;

import java.util.Arrays;

public class Assignment62 {
	
	String[] getReversedStringElementInRevArray(String[] input) {
		String[] str = new String[input.length];
		for (int i =0 , j=input.length-1; i<input.length;i++,j--) {
			String revTemp = "";
			String temp = input[i];
			for (int index = temp.length()-1; index >= 0; index--) {
				revTemp = revTemp + temp.charAt(index);
			}
			str[j]=revTemp;
		}
		return str;
	}
	
	public static void main(String[] args) {
		String[] input = {"tech", "aashvi", "Credits", "Ansh"};
		Assignment62 obj = new Assignment62();
		String[] revInput = obj.getReversedStringElementInRevArray(input);
		System.out.println(Arrays.toString(revInput));
		
	}

}
