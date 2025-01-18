package anuja.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/*Remove all the duplicates from given array or array list, use hashset , convert list 
 *to arrya and then array to as list and pass list as constructor. 

Integer[] arr = {10,20,20,20,30,30,40,50,40,10};*/
public class Assiignment89 {
	
	public static void main(String[] args) {
		Assiignment89 assiignment89 = new Assiignment89();
		Integer[] arr = {10,20,20,20,30,30,40,50,40,10};
		System.out.println("Input array is: \n" +Arrays.toString(arr) +"\n");
		assiignment89.getUniqueSet(arr);
		assiignment89.getOrderedList(arr);
	}

	private void getUniqueSet(Integer[] arr) {
		List<Integer> arrayListInput = new ArrayList<Integer>();
		arrayListInput = Arrays.asList(arr);//created list from array.
		Set<Integer> uniqueSet = new HashSet<Integer>(arrayListInput);
		System.out.println("Proceesed inordered set with only unique element from given array is (Used Set): \n" +uniqueSet+"\n");
	}
	
	
	private void getOrderedList(Integer[] arr) {
		List<Integer> orderedListInput = new ArrayList<Integer>();
		orderedListInput = Arrays.asList(arr);//created list from array.
		Set<Integer> uniqueOrderedSet = new LinkedHashSet<Integer>(orderedListInput); //used Hashset to get ordered output
		System.out.println("Proceesed ordered set with only unique element from given array is (Used hashSet): \n" +uniqueOrderedSet);
	}
}
