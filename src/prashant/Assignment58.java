/*Assignment - 58 : 21th Dec'2024 [15 mins]
Return the second maximum length string from given array.
If you find multiple string as second maximum, return the last second maximum.

input : {"Tech", "Tech", "Technocredits", "aashvi","GlobantPune","Ashvik", "PuneGlobant","Pune", "PuGlobantne"}
ouput : PuGlobantne*/

package prashant;
public class Assignment58 {
	
	String getSecondMaxLengthString(String[] input) 
	{
		String MaxStr = input[0];
		String SecMaxStr = input[1];
		
		if(input[1].length()>input[0].length()) 
		{
			MaxStr=input[1];
			SecMaxStr=input[0];
		}
		
		for(int i=2; i<input.length; i++) 
		{
			if(input[i].length()>MaxStr.length())
			{
				SecMaxStr = MaxStr;
				MaxStr = input[i];
			}
			else if(input[i].length()>=SecMaxStr.length()) 
			{
				SecMaxStr = input[i];
			}
		}
		return SecMaxStr;
	}

	public static void main(String[] args) {
		
		Assignment58 assignment58=new Assignment58();
		
		String[] input = {"Tech", "Tech", "Technocredits", "aashvi","GlobantPune","Ashvik", "PuneGlobant","Pune", "PuGlobantne"};
		String secMAxString=assignment58.getSecondMaxLengthString(input);
		System.out.println("Second max string in given array is:"+secMAxString);
		
	}

}
