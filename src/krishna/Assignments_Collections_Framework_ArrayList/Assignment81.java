package Assignments_Collections_Framework_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Assignment81 {
	
	List<Integer> getUniqueNumbersList(int[] arr){
		List<Integer> listOfUniqueNumbers = new ArrayList<Integer>();
		for(int num : arr) {
			if(!listOfUniqueNumbers.contains(num)) {
				listOfUniqueNumbers.add(num);
			}
		}
		return listOfUniqueNumbers;
		
	}

	public static void main(String[] args) {
		int[] arr = {10,44,55,22,44,11,77,88,99,11};
		System.out.println(new Assignment81().getUniqueNumbersList(arr));
	}
}
