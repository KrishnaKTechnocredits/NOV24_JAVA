package swapnil;

import java.util.HashSet;
import java.util.Set;

public class Assignment88 {
	
	Set<Integer> duplicateNum(int[] arr){
		 Set<Integer> Array = new HashSet<Integer>();
		 Set<Integer> Array1 = new HashSet<Integer>();
		 for(int a : arr) {
			 if(!Array.add(a)) {
				Array1.add(a);
			 }
		 }
			 
		return Array1;
	}
	public static void main(String[] args) {
		int[] arr = {33,22,44,33,12,15,16,22};
		Assignment88 a = new Assignment88();
		Set<Integer> output = a.duplicateNum(arr);
		System.out.println(output);
	}
}
