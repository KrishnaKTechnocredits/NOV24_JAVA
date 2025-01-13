package anuja.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//Return the unique list of numbers from given Array. [IMP]
public class Assignment81 {

	public static void main(String[] args) {
		Assignment81 a = new Assignment81();
		int[] arr = {10,44,55,22,44,11,77,88,99,11};
		System.out.println("Input Array is: \n" +Arrays.toString(arr) +"\n");
		List<Integer> numUniqueList = new ArrayList<Integer>();//list is parent and Arryalist is child, reverse will not work 
		//as List is a interface and cant be instanciated.
		numUniqueList = a.getUniqueListOfNum(arr);
		System.out.println("Unique list is as below: \n");
		System.out.println(numUniqueList);

	}

	private ArrayList<Integer> getUniqueListOfNum(int[] arr) {
		ArrayList<Integer> numUniqueList = new ArrayList<Integer>();
		for(int i = 0 ; i<arr.length ; i++) {
			if(!numUniqueList.contains(arr[i])) {//imp check to avoid duplicate, if not contain
				numUniqueList.add(arr[i]);
			}
		}
		return numUniqueList;
		
	}
}
