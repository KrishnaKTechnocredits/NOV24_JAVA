package nilam.CollectionFrameWork.Set;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

//Remove all the duplicates from given array. 
public class Assignment_89 {
	public static void main(String[] args) {
		Integer[] arr = { 10, 20, 20, 20, 30, 30, 40, 50, 40, 10 };
		Set<Integer> numA = new LinkedHashSet<Integer>(Arrays.asList(arr));
		System.out.println(numA);
	}
}
