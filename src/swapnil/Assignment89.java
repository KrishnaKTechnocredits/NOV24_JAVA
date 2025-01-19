package swapnil;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Assignment89 {

	Set<Integer> duplicateNum(Integer[] arr){
		List<Integer> list = Arrays.asList(arr);
		
		 Set<Integer> Array = new LinkedHashSet<Integer>(list);
		
			 
		return Array;
	}
	public static void main(String[] args) {
		Integer[] arr = {10,20,20,20,30,30,40,50,40,10};
		Assignment89 a = new Assignment89();
		 System.out.println(a.duplicateNum(arr));
		
	}
}