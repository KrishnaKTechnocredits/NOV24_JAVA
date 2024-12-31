/*Assignment - 54 : 18th Dec'2024 [20 mins]
return the array having elements in reverse order of original array.*/

package prashant;
public class Assignment54 {
	
	int[] getReverseOrder(int[] input)
	{
		int[] output= new int[input.length];
		
		for(int i=input.length-1,j=0;i>=0;i--,j++)
		{
			output[j] = input[i];
		}
		
		return output;
	}
	

	public static void main(String[] args) 
	{
		int[] input= {10,99,76,84,34};
		
		Assignment54 assignment54=new Assignment54();
		int[] outputarray=assignment54.getReverseOrder(input);
		
		for(int i=0;i<outputarray.length;i++)
		{
			System.out.println(outputarray[i]);
		}
		
		

	}


}
