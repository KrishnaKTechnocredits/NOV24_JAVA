/*Assignment - 60 : 21st Dec'2024 [20 min]
return second maximum number from given array.

input = {33,33,19,55,53,11};
output : 53 
*/

package prashant;
public class Assignment60 {
	
	int getSecMaxNum(int[] input)
	{
		int MaxNum = input[0];
		int SecMaxNum = input[1];
		
		if(SecMaxNum>MaxNum) 
		{
			MaxNum = input[1];
			SecMaxNum = input[0];
		}
		
		for(int i=2; i<input.length; i++) 
		{
			if(input[i]>MaxNum) 
			{
				SecMaxNum = MaxNum;
				MaxNum = input[i];
			}
			else if(input[i]>SecMaxNum)
			{
				SecMaxNum = input[i];
			}
	   }
		return SecMaxNum;
	}

	public static void main(String[] args) 
	{
		int[] input = {33,33,19,55,53,11};
		Assignment60 assignment60=new Assignment60();
		int secMaxNum=assignment60.getSecMaxNum(input);
		System.out.println("Second Max Num in given array is: "+secMaxNum);
		
				
		

	}

}
