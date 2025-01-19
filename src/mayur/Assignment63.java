/*
 * Assignment - 63 : 22nd Dec'2024 [20 min] [IMP]
reverse each string in array and place at in reverse order.

input : {"TeCh", "Aashvi", "Credits", "AnsH"}
output : [hsna,stiderC, ivhsaa, hcet]
 */

package mayur;

import java.util.Arrays;

public class Assignment63 {
	
	String[] getRevStringElementInRevArrayInLowCase(String[] input) {
		String[] str = new String[input.length];
		for (int i =0 , j=input.length-1; i<input.length;i++,j--) {
			String revTemp = "";
			String temp = input[i].toLowerCase();
			for (int index = temp.length()-1; index >= 0; index--) {
				revTemp = revTemp + temp.charAt(index);
			}
			str[j]=revTemp;
		}
		return str;
	}
	
	public static void main(String[] args) {
		String[] input = {"TeCh", "Aashvi", "Credits", "AnsH"};
		Assignment63 obj = new Assignment63();
		String[] revInput = obj.getRevStringElementInRevArrayInLowCase(input);
		System.out.println(Arrays.toString(revInput));
		
	}

}
