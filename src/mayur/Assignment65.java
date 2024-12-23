/*
 * Assignment - 65 : 22nd Dec'2024 [20 min]
reverse each string in array and place at in reverse order.

input : {"Te1Ch", "A2as3Hvi", "CrE45di555ts", "ANSH"}
output : [HSNa,StidErc, IvHsaa, HCet]

Hint : First letter in Uppercase + last Letter in lowercase + all other characters in same case + exclude digits

 */

package mayur;

import java.util.Arrays;

public class Assignment65 {
	
	String[] getRevStringEleInRevArrayAsSpl2(String[] input) {
		String[] str = new String[input.length];
		for (int i =0 , j=input.length-1; i<input.length;i++,j--) {
			String revTemp = "";
			String temp = input[i];
			for (int index = temp.length()-1; index >= 0; index--) {
				if (Character.isLetter(temp.charAt(index))) {
					revTemp = revTemp + temp.charAt(index);
				}				
			}
			str[j]=revTemp.substring(0,1).toUpperCase()+revTemp.substring(1,revTemp.length()-1)+revTemp.substring(revTemp.length()-1,revTemp.length()).toLowerCase();			
		}
		return str;
	}
	
	public static void main(String[] args) {
		String[] input = {"Te1Ch", "A2as3Hvi", "CrE45di555ts", "ANSH"};
		Assignment65 obj = new Assignment65();
		String[] revInput = obj.getRevStringEleInRevArrayAsSpl2(input);
		System.out.println(Arrays.toString(revInput));
		
	}

}
