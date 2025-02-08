/*Assignment - 65 : 22nd Dec'2024 [20 min]
reverse each string in array and place at in reverse order.

input : {"Te1Ch", "A2as3Hvi", "CrE45di555ts", "ANSH"}
output : [HSNa, StidErc, IvHsaa, HCet]

Hint : First letter in Uppercase + last Letter in lowercase + all other characters in same case + exclude digits*/

package nikita.arraysdemo;

import java.util.Arrays;

public class Assignment65 {
	
	String getRevOrder(String input) {
		String str = "";
		for(int i = input.length()-1; i>=0; i--)
		{
			char ch = input.charAt(i);
			if(!Character.isDigit(ch)) {
			str = str + ch;
			}
		}
		return str;
	}
	
	String getUpperLoweCombinationString(String str)
	{
		String output = str.substring(0,1).toUpperCase()+str.substring(1, str.length()-1)+str.substring(str.length()-1).toLowerCase();
		return output;
	}
	
	String[] getRevStringArray(String[] arr)
	{
		String[] obj = new String[arr.length];
		for(int i = 0, j=obj.length - 1; i<arr.length; i++, j--)
		{
			String output = getRevOrder(arr[i]);
			output = getUpperLoweCombinationString(output);
			obj[j] = output;
		}
		return obj;
	}

	public static void main(String[] args) {
		String[] str = {"Te1Ch", "A2as3Hvi", "CrE45di555ts", "ANSH"};
		System.out.println("Given Array is: " + Arrays.toString(str));
		Assignment65 a65 = new Assignment65();
		String[] ans =  a65.getRevStringArray(str);
		System.out.println("Reverse order string array where first letter is UC and last in LC are: " + Arrays.toString(ans));
	}
}
