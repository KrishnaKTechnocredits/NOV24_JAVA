/*
 Assignment - 75 : 11th Jan
Return the list of all the prime numbers from given array. 
input : {10,23,31,40,50}
output : {23,31}
 */
package imran.ArrayPrograms;
import java.util.Arrays;

public class Assignment75_PrimeNumber {

	void getPrimeNumber(int[] data)
	{
		int index = 0;
		for (int i = 0; i < data.length; i++) 
		{
			int num = isPrimeNumber(data[i]);
			if (num == 0)
			{
				index++;
			}

		}
		int[] primeNumberArray = new int[index];
		int outputindex = 0;
		for (int i = 0; i < data.length; i++)
		{
			int primeNumber = isPrimeNumber(data[i]);
			if (primeNumber == 0) 
			{
				primeNumberArray[outputindex] = data[i];
				outputindex++;
			}
		}
		System.out.println(" The Prime Number are " + Arrays.toString(primeNumberArray));
	}

	int isPrimeNumber(int data)
	{
		int count = 0;
		for (int i = 2; i <= Math.sqrt(data); i++) 
		{
			if (data % i == 0)
			{
				count++;
				break;
			}
		}
		return count;
	}

	public static void main(String[] args)
	{
		Assignment75_PrimeNumber assignment75_PrimeNumber_1 = new Assignment75_PrimeNumber();
		int[] arr = { 10, 23, 31, 40, 50 };
		System.out.println("The Given array is : " + Arrays.toString(arr));
		assignment75_PrimeNumber_1.getPrimeNumber(arr);
	}
}
