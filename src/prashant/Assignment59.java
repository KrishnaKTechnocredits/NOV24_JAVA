/*Assignment - 59 : 21th Dec'2024 [25 mins]
print all the second maximum length string from given array.

input : {"Tech", "Tech", "Technocredits", "aashvi","GlobantPune","Ashvik", "PuneGlobant","Pune", "PuGlobantne"}
ouput : GlobantPune
        PuneGlobant
		PuGlobantne*/

package prashant;
public class Assignment59 {
	
	void getAllSecMaxString(String[] input) 
	{
		String MaxStr = input[0];
		String SecMaxStr  = input[1];
		
		if(SecMaxStr.length()>MaxStr.length()) 
		{
			MaxStr = input[1];
			SecMaxStr = input[0];
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
		displayAllSecMax(input, SecMaxStr.length());
	}
	
	void displayAllSecMax(String[] input, int targetLength) 
	{
		for(int j=0; j<input.length; j++) 
		{
			if(input[j].length()== targetLength)
			{
				System.out.println(input[j]);
			}
		}
	}

	public static void main(String[] args) 
	{
		String[] input = {"Tech", "Tech", "Technocredits", "aashvi","GlobantPune","Ashvik", "PuneGlobant","Pune", "PuGlobantne"};
		Assignment59 assignment59=new Assignment59();
		System.out.println("All secondmax String in given array: ");
		assignment59.getAllSecMaxString(input);
		
	}


}
