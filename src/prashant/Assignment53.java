/*Assignment - 53 : 16th Dec'2024 [5-7 mins]

print the array in reverse order. 

input : {10,34,22,16,19,99}
output : 99
         19
		 16
		 22
		 34
		 10*/

package prashant;
public class Assignment53 {
	
	void printArrayReverse(int[] num)
	{
		for(int index=num.length-1;index>=0;index--)
		{
			System.out.println(num[index]);
		}
		
	}
	

	public static void main(String[] args)
	{
		int[] num= {10,34,22,16,19,99};
		Assignment53 assignment53=new Assignment53();
		assignment53.printArrayReverse(num);
		

	}

}
