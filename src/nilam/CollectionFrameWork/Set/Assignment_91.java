package nilam.CollectionFrameWork.Set;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

//Remove all duplicates and return the set having all number in natural order. 
public class Assignment_91 {
	
	public static void main(String[] args) {
		Integer[] arr = {66,33,44,12,99,22,33,33,66};
		Set<Integer> numbersList=new TreeSet<Integer>(Arrays.asList(arr));
		System.out.println(numbersList);
	}
}
