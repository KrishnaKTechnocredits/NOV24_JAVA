package swapnil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Assignment85 {
	
	List<Integer> getUniqueNum(Integer[] arr1,Integer[] arr2){
		List<Integer> numList1 = new ArrayList<Integer>(Arrays.asList(arr1));
		List<Integer> numList2 = new ArrayList<Integer>(Arrays.asList(arr2));
		
		numList2.removeAll(numList1);
		numList1.addAll(numList2);
		
		return numList1;
		
	}

	
	public static void main(String[] str) {
		Integer[] arr1 = {10,20,30,40};
		Integer[] arr2 = {20,30,60,70,80};
		Assignment85 a = new Assignment85();
		List<Integer> abc=a.getUniqueNum(arr1, arr2);
		System.out.println(abc);

	}
}
