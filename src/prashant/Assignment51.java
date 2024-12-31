/*Assignment - 51 : 16th Dec'2024 [15 mins]

print maximum and minimum number from given array.

 
 */

package prashant;
public class Assignment51 {
	
	void MinMaxNumber(int[] num)
	{
		int minNum=num[0],maxNum=num[0];
		
		for(int index=0;index<num.length;index++)
		{
			if(num[index] > maxNum)
			{
				maxNum=num[index];
				//return maxNum;
				//System.out.println("Maximum number from given array is-: " + maxNum);
			}
			if(num[index] < minNum)
			{
				minNum=num[index];
				//return minNum;
				//System.out.println("Maximum number from given array is-: " + minNum);
			}
		}
		
		System.out.println("Maximum number from given array is-: " + maxNum);
		System.out.println("Maximum number from given array is-: " + minNum);
		
		//return 0;
	}

	public static void main(String[] args) {
		
		int[] num= {-44,-45,-22,-25,-47,29,46};
		
		Assignment51 assignment51=new Assignment51();
		assignment51.MinMaxNumber(num);
		//System.out.println(minMaxNumber);
		//int minMaxNumber=

	}

}
