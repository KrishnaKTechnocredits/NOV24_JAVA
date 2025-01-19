/* Assignment - 62 : 22nd Dec'2024 [20 min] [IMP]
reverse each string in array and place at in reverse order.

input : {"tech", "aashvi", "Credits", "Ansh"}
output : [hsnA, stiderC, ivhsaa, hcet]
*/

package nikita;

import java.util.Arrays;

public class Assignment62 {
	
	String getRevString(String input) {
		String str = "";
		for(int i = input.length() - 1; i>=0; i--)
		{
			char ch = input.charAt(i);
			str = str + ch;
		}
		return str;
	}
	
	// need of two object as we need to put our output in reverse order
	String[] getRevStringInRevOrder(String []input)
	{
		String[] output = new String[input.length];
			{
				for(int i = 0, j = output.length - 1; i<input.length; i++, j--)
				{
					output[j] = getRevString(input[i]);
				}
			}
			return output;
	}
	
	public static void main(String[] args) {
		String[] input =  {"tech", "aashvi", "Credits", "Ansh"};
		System.out.println("Given Array is: " + Arrays.toString(input));
		Assignment62 a62 = new Assignment62();
		String[] ans = a62.getRevStringInRevOrder(input);
		System.out.println("Reverse Array is: " + Arrays.toString(ans));	
	}
}
