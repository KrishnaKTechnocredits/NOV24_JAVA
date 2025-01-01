/*Assignment - 62 : 22nd Dec'2024 [20 min] [IMP]
reverse each string in array and place at in reverse order.

input : {"tech", "aashvi", "Credits", "Ansh"}
output : [hsnA,stiderC, ivhsaa, hcet]*/

package prashant;
import java.util.Arrays;
public class Assignment62 {
	
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
		for(int j=input.length-1,k=0;j>=0; j--,k++ ) 
		{
			String str = input[j];
			String strng = getRevArrayOfStringMethod(str);
			output1[k]= strng;
		}
		return output1;
	}

	public static void main(String[] args) 
	{
		Assignment62 Assignment62=new Assignment62();
		String[] input = {"tech", "aashvi", "Credits", "Ansh"};
		String[] output =Assignment62.callRevArrayOfStringMethod(input);
		System.out.println(Arrays.toString(output));
		

	}

}
