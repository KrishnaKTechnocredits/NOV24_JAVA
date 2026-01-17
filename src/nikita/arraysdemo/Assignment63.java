/* Assignment - 63 : 22nd Dec'2024 [20 min] [IMP]
reverse each string in array and place at in reverse order in small caps.

input : {"TeCh", "Aashvi", "Credits", "AnsH"}
output : [hsna, stiderc, ivhsaa, hcet]
*/

package nikita.arraysdemo;

import java.util.Arrays;

public class Assignment63 {
	
	String getRevString(String input)
	{
		String str = "";
		for(int i = input.length() - 1; i>=0; i--)
		{
			char ch = input.charAt(i);
			str = str + ch;
		}
		return str;
	}
	
	String[] getStringInRevOrderLower(String[] input)
	{
		String[] output = new String[input.length];
		for(int i = 0, j = output.length - 1; i<input.length; i++, j--)
		{
			String lower = getRevString(input[i].toLowerCase());
			output[j] = lower;
		}
		return output;
	}

	public static void main(String[] args) {
		String[] input = {"TeCh", "Aashvi", "Credits", "AnsH"};
		System.out.println("Given Array is: " + Arrays.toString(input));
		Assignment63 a63 = new Assignment63();
		String[] ans  = a63.getStringInRevOrderLower(input);
		System.out.println("Reverse String array in lower case is: " + Arrays.toString(ans));
	}
}
