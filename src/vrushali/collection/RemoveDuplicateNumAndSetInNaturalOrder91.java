package vrushali.collection;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

import anuja.collection.Assignment91;

//Assignment - 91 : 16th jan
//Remove all duplicates and return the set having all number in natural order. 
//
//Integer[] arr = {66,33,44,12,99,22,33,33,66};
//output : [12,22,33,44,66,99] 	

public class RemoveDuplicateNumAndSetInNaturalOrder91 {
	Set<Integer> removeDuplicateANdSetInNaturalOrderNumbers(Integer[] numArray) {
		Set<Integer> outputSet = new TreeSet<Integer>(Arrays.asList(numArray));
		// tree set maintain unique as well as ascending order.
		return outputSet;
	}

	public static void main(String[] args) {
		RemoveDuplicateNumAndSetInNaturalOrder91 removeDuplicateNumAndSetInNaturalOrder91 = new RemoveDuplicateNumAndSetInNaturalOrder91();

		Integer[] arr = { 66, 33, 44, 12, 99, 22, 33, 33, 66 };// we decalre int array as Integer array as Set is of
																// Integer or gives error
		System.out.println("Input array is: " + Arrays.toString(arr) + "\n");
		Set<Integer> outputSet=removeDuplicateNumAndSetInNaturalOrder91.removeDuplicateANdSetInNaturalOrderNumbers(arr);
		System.out.println("Unique and ascending order list of element is: "+outputSet);

	}

}
