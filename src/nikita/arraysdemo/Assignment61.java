/* Assignment - 61 : 22nd Dec'2024 [20 min] [IMP]
reverse each string in array at the same place.

input : {"tech", "aashvi", "credits"}
output : [hcet, ivhsaa, stiderc]
*/

package nikita.arraysdemo;

import java.util.Arrays;

public class Assignment61 {
	
	String getRevString(String input)
	{
		String str = "";
		for(int i = input.length() - 1; i>=0; i--)
		{
			char ch = input.charAt(i);
			str = str+ch;
		}
		return str;
	}

	String[] getRevOfStringArray(String[] input)
	{
		String[] output = new String[input.length];
		for(int i = 0; i<input.length; i++)
		{
			output[i] = getRevString(input[i]);
		}
		return output;
	}
	
	public static void main(String[] args) {
		String[] str = {"tech", "aashvi", "credits"};
		System.out.println("Given string array: " + Arrays.toString(str));
		Assignment61 a61 = new Assignment61();
		String[] ans = a61.getRevOfStringArray(str);
		System.out.println("Reverse strings in array: " + Arrays.toString(ans));
	}
}
