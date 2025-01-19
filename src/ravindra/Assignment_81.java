package ravindra;

import java.util.ArrayList;
import java.util.List;

public class Assignment_81 {
	public static void main(String[] args) {
		int[] arr = {10,44,55,22,44,11,77,88,99,11};
		Assignment_81 list=new Assignment_81();
		List<Integer> uniqList = list.getUniqNumbers(arr);
		System.out.println(uniqList);
	}
	
	List<Integer> getUniqNumbers(int [] input) {
		List<Integer> list=new ArrayList<>();
		for(int i=0;i<input.length;i++) {
			if(!list.contains(input[i])) {
				list.add(input[i]);
			}
		}return list;
	}
}
