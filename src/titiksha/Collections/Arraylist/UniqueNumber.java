//Find unique number for given list
//int[] arr = {10,44,55,22,44,11,77,88,99,11};


package titiksha.Collections.Arraylist;

import java.util.ArrayList;
import java.util.List;

public class UniqueNumber {
	List<Integer> getuniquenumber(int[] arr){
		List<Integer> findthenumber=new ArrayList<Integer>();// creating object 
		for(int i=0;i<arr.length;i++) { // running for loop on array
			int num=arr[i];// assigning arr index value into num 
			if(!findthenumber.contains(num)) { //applying condition that in array if same num not present in new array
				findthenumber.add(num);//add num value 
			}
		}
		return findthenumber;
	}
	
	public static void main(String[] args) {
		UniqueNumber uniqueNumber=new UniqueNumber();
		int[] arr={10,44,55,22,44,11,77,88,99,11};
		List<Integer> output=uniqueNumber.getuniquenumber(arr);
		System.out.println(output);
		
	}
}
