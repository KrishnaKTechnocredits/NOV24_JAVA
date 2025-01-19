//Find out all the duplicate elements from given arrayList.
//input : {10, 99, 10, 10, 77, 55, 46, 99}
//output : 10 is duplicate, at index 0 and 3 
 //        99 is duplicate , at index 1 and 7.

package titiksha.Collections.Arraylist;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class Duplicateintegerelement {

	List<Integer> getduplicatevalue(Integer[] arr) {// int is primitive datatype so we cannot covert primitive
													// datattype
													// into list .we nned to use wrapper class
		List<Integer> inputlist = Arrays.asList(arr);
		List<Integer> outputlist = new ArrayList<Integer>();
		for (Integer i : inputlist) {
			int index = inputlist.indexOf(i);
			int lastindex = inputlist.lastIndexOf(i);
			if (index != lastindex && !outputlist.contains(i)) {
				outputlist.add(i);
			}
		}
		return outputlist;

	}

	public static void main(String[] args) {
		Duplicateintegerelement duplicateintegerelement = new Duplicateintegerelement();
		Integer[] arr = {10,44,55,22,44,11,77,88,99,11};
		List<Integer> output = duplicateintegerelement.getduplicatevalue(arr);
		System.out.println("Inputlist: " + Arrays.toString(arr));
		System.out.println("Duplicate value in the input list: " + output);
	}
}
