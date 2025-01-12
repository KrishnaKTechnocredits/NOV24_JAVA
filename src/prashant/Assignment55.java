/*Assignment - 55 : 18th Dec'2024 [15-20 mins]

return union of given two array.

input : 
{10,19,18}
{99,8}

output :  {10,19,18,99,8} */

package prashant;
public class Assignment55 {
	
	int[] unionArray(int[] num1,int[] num2)
	{
		int outputIndex=0;
		
		int[] outputArray= new int[num1.length + num2.length];
		
		for(int inputindex1=0;inputindex1<num1.length;inputindex1++)
		{
			outputArray[outputIndex]=num1[inputindex1];
			outputIndex++;
			
		}
		for(int inputindex2=0;inputindex2<num2.length;inputindex2++)
		{
			outputArray[outputIndex]=num2[inputindex2];
			outputIndex++;
			
		}
		
		
		return outputArray;
	}

	public static void main(String[] args) 
	{
		int[] num1={10,19,18};
		int[] num2={99,8};
		Assignment55 assignment55=new Assignment55();
		int[] result=assignment55.unionArray(num1, num2);
		System.out.print("{");
		for(int i=0;i<result.length;i++)
		{
			System.out.print(result[i] +",");
		}
		System.out.print("}");
	}


}
