/* Assignment - 64 : 22nd Dec'2024 [20 min]
reverse each string in array and place at in reverse order, each word first letter capital and rest in lowercase.

input : {"Tech", "Aashvi", "Credits", "Ansh"}
output : [Hsna,Stiderc, Ivhsaa, Hcet]
*/

package nikita;

import java.util.Arrays;

public class Assignment64 {
	
	String getRevOrder(String input) {
		String str = "";
		for(int i = input.length()-1; i>=0; i--)
		{
			char ch = input.charAt(i);
			str = str + ch;
		}
		return str;
	}
	
	String getFirstLetterInCapsString(String str)
	{
		String output = str.substring(0,1).toUpperCase()+str.substring(1).toLowerCase();
		return output;
	}
	
	String[] getRevStringArray(String[] arr)
	{
		String[] obj = new String[arr.length];
		for(int i = 0, j=obj.length - 1; i<arr.length; i++, j--)
		{
			String output = getRevOrder(arr[i]);
			output = getFirstLetterInCapsString(output);
			obj[j] = output;
		}
		return obj;
	}

	public static void main(String[] args) {
		String[] str = {"Tech", "Aashvi", "Credits", "Ansh"};
		System.out.println("Given Array is: " + Arrays.toString(str));
		Assignment64 a64 = new Assignment64();
		String[] ans =  a64.getRevStringArray(str);
		System.out.println("Reverse order string array where first letter is in UC are: " + Arrays.toString(ans));
	}
}
