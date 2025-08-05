package vrushali.collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

//Assignment - 89 : 16th jan
//Remove all the duplicates from given array. 
//
//Integer[] arr = {10,20,20,20,30,30,40,50,40,10};

public class RemoveAllDuplicatesFromGIvenArray89 {

	Set<Integer> removeAllDUplicateFromArray(Integer[] numArray) {
		// Set<Integer> uniqueNumSet=new
		// LinkedHashSet<Integer>(Arrays.asList(numArray));
		Set<Integer> setOfUniqueNumbers = new HashSet<>(Arrays.asList(numArray));
		return setOfUniqueNumbers;
	}

//	Set<Integer> removeAllDUplicateFromArray(int[] numArray)
//	{
//	Here while converting arralist into gives error beacause we passing int (primitive data type) array but Set is of Interger (wrapper class)type so it gives error
//		//Set<Integer> uniqueNumSet=new LinkedHashSet<Integer>(Arrays.asList(numArray));
//		Set<Integer> setOfUniqueNumbers = new HashSet<>(Arrays.asList(numArray));
//		return setOfUniqueNumbers;
//	}
	public static void main(String[] args) {
		RemoveAllDuplicatesFromGIvenArray89 removeAllDuplicatesFromGIvenArray89 = new RemoveAllDuplicatesFromGIvenArray89();
		Integer[] arr = { 10, 20, 20, 20, 30, 30, 40, 50, 40, 10 };
		Set<Integer> setOfUniqueNumbers = removeAllDuplicatesFromGIvenArray89.removeAllDUplicateFromArray(arr);
		System.out.println("Set Of Unique Num "+setOfUniqueNumbers);
	}
}
