package swapnil;

import java.util.ArrayList;
import java.util.List;

public class Assignment82 {

	List<Integer> getListFromArray(int[] arr){
		List<Integer> originalList = new ArrayList<Integer>();
		for(int i=0;i<arr.length;i++) {
			originalList.add(arr[i]);
		}
		return originalList;
	}
	
	List<Integer> getListOfDuplicateNum(int[] arr){
		List<Integer> originalList = getListFromArray(arr);
		
		List<Integer> duplicateNum =  new ArrayList<Integer>();
		for(int i=0;i<arr.length;i++) {
			int num = arr[i];
			if(originalList.indexOf(num)!=originalList.lastIndexOf(num)) {
				if(!duplicateNum.contains(num)) {
					duplicateNum.add(num);
				}
			}
		}
		return duplicateNum;
	}
	public static void main(String[] args) {
		int[] arr = {10,44,55,22,44,11,77,88,99,11};
		Assignment82 a = new Assignment82();
		List<Integer> output=a.getListOfDuplicateNum(arr);
		System.out.println(output);
	}
}
