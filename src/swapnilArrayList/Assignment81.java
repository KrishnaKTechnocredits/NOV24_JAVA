package swapnilArrayList;

import java.util.ArrayList;
import java.util.List;

public class Assignment81 {
	List<Integer> uniqueNum(int[] arr){
		List<Integer> listOfNumbers = new ArrayList<Integer>();
		for(int i=0;i<arr.length;i++) {
			int num = arr[i];
			if(!listOfNumbers.contains(num)) {
				listOfNumbers.add(num);
			}
		}
		
		return listOfNumbers;
	}
	
	public static void main(String[] args) {
		int[] arr = {10,44,55,22,44,11,77,88,99,11};
		Assignment81 a = new Assignment81();
		List<Integer> output = a.uniqueNum(arr);
		System.out.println(output);
				
	}
}
