package vrushali.collection;

import java.util.ArrayList;
import java.util.List;

//Assignment - 75 : 11th Jan
//Return the list of all the prime numbers from given array. 
//input : {10,23,31,40,50}
//output : {23,31}

public class ReturnTheLstOfPrimeNumFromArray75 {
	
	boolean isNumberPrime(int num)
	{
		boolean flag=true;
		for(int i=2;i<num/2;i++)
		{
			if(num%i==0)
			{
				flag=false;
				break;
			}
		}
		return flag;
	}
	List<Integer> returnTheListOfPrimeNumFromArrayList(int[] numArray)
	{
		List<Integer> listOfPrimeNo=new ArrayList<Integer>();
		int num=0;
		boolean isNumPrime=false;
		for(int i=0;i<numArray.length;i++)
		{
			num=numArray[i];
			isNumPrime=isNumberPrime(num);
			if(isNumPrime)
			{
				listOfPrimeNo.add(num);
			}
		}
		return listOfPrimeNo;
	}
	public static void main(String[] args) {
		ReturnTheLstOfPrimeNumFromArray75 returnTheLstOfPrimeNumFromList75=new ReturnTheLstOfPrimeNumFromArray75();
		int[] numArray={10,23,31,40,50};
		List<Integer> listOfPrimeNo=returnTheLstOfPrimeNumFromList75.returnTheListOfPrimeNumFromArrayList(numArray);
		System.out.println(listOfPrimeNo);
	}
}
