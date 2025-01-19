package anuja.collection;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

/*Remove all duplicates and return the set having all number in natural order. 
Integer[] arr = {66,33,44,12,99,22,33,33,66};
output : [12,22,33,44,66,99] 	*/
public class Assignment91 {
	
	public static void main(String[] args) {
		Assignment91 assignment91 = new Assignment91();
		//what if int[] arr is used and not Integer[]
		Integer[] arr = {66,33,44,12,99,22,33,33,66};
		System.out.println("Input array is: " +Arrays.toString(arr) +"\n");
		assignment91.getUniqueNumbersInNaturalOrder(arr);
		
	}

	private void getUniqueNumbersInNaturalOrder(Integer[] arr) {
		//use only tree set which maintain unique as well as ascending order.
		Set<Integer> uniqueAscendingOrderSet = new TreeSet<Integer>(Arrays.asList(arr));
		System.out.println("Unique and ascending order list of element is: " +uniqueAscendingOrderSet);
		
	}
}	
