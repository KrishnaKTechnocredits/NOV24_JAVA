/*
 * Assignment - 64 : 22nd Dec'2024 [20 min]
reverse each string in array and place at in reverse order, each word first letter capital and rest in lowercase.

input : {"Tech", "Aashvi", "Credits", "Ansh"}
output : [Hsna,Stiderc, Ivhsaa, Hcet]
 */

package mayur;

import java.util.Arrays;

public class Assignment64 {
	
	String[] getRevStringEleInRevArrayAsSpl1(String[] input) {
		String[] str = new String[input.length];
		for (int i =0 , j=input.length-1; i<input.length;i++,j--) {
			String revTemp = "";
			String temp = input[i].toLowerCase();
			for (int index = temp.length()-1; index >= 0; index--) {
				revTemp = revTemp + temp.charAt(index);
			}
			str[j]=revTemp.substring(0,1).toUpperCase()+revTemp.substring(1);			
		}
		return str;
	}
	
	public static void main(String[] args) {
		String[] input = {"Tech", "Aashvi", "Credits", "Ansh"};
		Assignment64 obj = new Assignment64();
		String[] revInput = obj.getRevStringEleInRevArrayAsSpl1(input);
		System.out.println(Arrays.toString(revInput));
		
	}

}
