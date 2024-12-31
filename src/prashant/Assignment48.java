/*Assignment - 48 : 15th Dec'2024 [15 mins]

From given int array, return count of positive numbers.

input : {10,30,-45,66,-10};
output : 3 */

package prashant;



public class Assignment48 {
	
	int positiveNumbers(int[] num)
	{
		int count=0;
		
		for(int index=0;index<num.length;index++)
		{
			if(num[index] > 0) 
			{
				count++;
				
			}
			
		}
		return count;
	}

	public static void main(String[] args) 
	{
		
		int[] num= {10,30,-45,66,-10};
		
		Assignment48 assignment48=new Assignment48();
		int totalcount=assignment48.positiveNumbers(num);
		System.out.println(totalcount);
	}


}
