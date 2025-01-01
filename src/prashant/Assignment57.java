/*Assignment - 57 : 21th Dec'2024 [15 mins]
Return the maximum length string from given array.

input : {"Tech", "Tech", "Technocredits", "aashvi","GlobantPune","Ashvik", "PuneGlobant","Pune", "PuGlobantne"}
ouput : Technocredits
*/

package prashant;
public class Assignment57 {
	
	String getMaxStringFromArray(String[] input) 
	{
		String str = input[0];//assume that index 0 String is greater initially 
		
		for(int i=1; i<input.length; i++)
		{			
			if(str.length()<input[i].length())
			{
				 str = input[i];			
			}
		}
		return str;
	}

	public static void main(String[] args) 
	{
		String[] input = {"Tech", "Tech", "Technocredits", "aashvi","GlobantPune","Ashvik", "PuneGlobant","Pune", "PuGlobantne"};
		Assignment57 assignment57 = new Assignment57();
		
		String result=assignment57.getMaxStringFromArray(input);
		System.out.println("Max length String in given array is:"+result);

	}


}
