/*
 Assignment - 75 : 11th Jan
Return the list of all the prime numbers from given array. 
input : {10,23,31,40,50}
output : {23,31}
 */
package imran.CollectionFramework.ArrayList;
import java.util.*;

public class Assignment75_PrimeNumber {

	List<Integer> getPrimeNumber(Integer[] data)
	{
		List<Integer> arr = Arrays.asList(data);
		List<Integer> primeNumberList = new ArrayList<Integer>();
		for(int i=0; i<arr.size();i++)
		{
			int primeNumber = isPrimeNumber(arr.get(i));
			if(primeNumber==0)
			{
				primeNumberList.add(arr.get(i));
			}
		}
		return primeNumberList;
	}
	
	int isPrimeNumber(int num)
	{
		int count = 0;
		for (int i=2; i<= Math.sqrt(num); i++) 
		{
			if (num % i == 0)
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
		Integer[] arr = { 10, 23, 31, 40, 50 };
		System.out.println("The Given array is : " + Arrays.toString(arr));
		List<Integer> PrimeNumber = assignment75_PrimeNumber_1.getPrimeNumber(arr);
		System.out.println("The Prime Numbers are : " + PrimeNumber);
	}
}
