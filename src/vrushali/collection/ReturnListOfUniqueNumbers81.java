package vrushali.collection;
import java.util.*;
//Assignment - 81 : 12th Jan
//Return the unique list of numbers from given Array. [IMP]
//
//int[] arr = {10,44,55,22,44,11,77,88,99,11};
//
//
//List<Integer> getUniqueNumberList(int[] input){
//	List<Integer> listOfNumbers = new ArrayList<Integer>();
//	
//}
//
//output : [10,44,55,22,11,77,88,99]
//
//Hint : contains method of ArrayList.
public class ReturnListOfUniqueNumbers81 {
	
	List<Integer> getListOfuniqueNo(int[] numArray)
	{
		List<Integer> listOfuniqueNo=new ArrayList<Integer>();
		List<Integer> listOfNum=new ArrayList<Integer>();
		for(int i=0;i<numArray.length;i++)
		{
			listOfNum.add(numArray[i]);
		}
		
		for(int i=0;i<numArray.length;i++)
		{
			if(!listOfuniqueNo.contains(numArray[i]))
			{
				listOfuniqueNo.add(numArray[i]);
			}
		}
		return listOfuniqueNo;
	}
	public static void main(String[] args) {
		ReturnListOfUniqueNumbers81 returnListOfUniqueNumbers=new ReturnListOfUniqueNumbers81();
		int[] numArray= {10,44,55,22,11,22,44,77,88,99,11};
		List<Integer> listOfuniqueNo=returnListOfUniqueNumbers.getListOfuniqueNo(numArray);
		System.out.println("List Of Unique Numbers From Array : "+listOfuniqueNo);
	}
}
