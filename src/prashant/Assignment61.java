/*Assignment - 61 : 22nd Dec'2024 [20 min] [IMP]
reverse each string in array at the same place.

input : {"tech", "aashvi", "credits"}
output : [hcet, ivhsaa, stiderc]*/

package prashant;
import java.util.Arrays;
public class Assignment61 
{
		String getRevArrayOfStringMethod(String word) 
		{
			String output = "";
			for(int i=word.length()-1; i>=0; i--) 
			{
				output = output + word.charAt(i);
			}
			return output;
		}
		
		String[] callRevArrayOfStringMethod(String[] input)
		{
			String[] output1 = new String[input.length];
			for(int j=0; j<input.length; j++) 
			{
				String str = input[j];
				String strng = getRevArrayOfStringMethod(str);
				output1[j]= strng;
			}
			return output1;
		}

		public static void main(String[] args)
		{
			Assignment61 assignment61=new Assignment61();
			String[] input = {"tech", "aashvi", "credits"};
			String[] output=assignment61.callRevArrayOfStringMethod(input);
			System.out.println(Arrays.toString(output));
			

		}


}
