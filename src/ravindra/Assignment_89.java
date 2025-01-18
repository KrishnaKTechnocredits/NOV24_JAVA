package ravindra;

import java.util.LinkedHashSet;
import java.util.Set;

public class Assignment_89 {
	public static void main(String[] args) {
		Integer[] arr = {10,20,20,20,30,30,40,50,40,10};	
		Set<Integer> numbers=new LinkedHashSet<>();
		for(int i=0;i<arr.length;i++) {
			numbers.add(arr[i]);
		}System.out.println(numbers);
	}
}
