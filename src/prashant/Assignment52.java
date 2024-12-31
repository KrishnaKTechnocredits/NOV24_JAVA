/*Assignment - 52 : 16th Dec'2024 [15 mins]

return maximum and minimum number from given array.*/

package prashant;
public class Assignment52 {


	int[] MinMaxNumber(int[] num)
	{
		int[] output=new  int[2];
		
        int minNum=num[0],maxNum=num[0];
		
		for(int index=0;index<num.length;index++)
		{
			if(num[index] > maxNum)
			{
				maxNum=num[index];
				
			}
			if(num[index] < minNum)
			{
				minNum=num[index];
				
			}
		}
		
		
		output[0]=maxNum;
		output[1]=minNum;
		return output;
	}

	public static void main(String[] args) 
	{
		int[] num= {-44,-45,-22,-25,-47,29,46};
		Assignment52 assignment52=new Assignment52();
		int[] maxMin=assignment52.MinMaxNumber(num);
		
		System.out.println("Maximum number from given array is-: " + maxMin[0]);
		System.out.println("Maximum number from given array is-: " + maxMin[1]);

	}
}
