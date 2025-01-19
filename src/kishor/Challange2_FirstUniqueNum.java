package kishor;
//Find first Unique number from given list. 
//
//input : [66,12,69,12,77,66,69,5,8,14]
//output : First unique number is 77

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Challange2_FirstUniqueNum {
	
	void displayFirstUniqueNum(Integer[] arr) {
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(arr));
		for(int i=0;i<list.size();i++) {
			int num=list.get(i);
			if(list.indexOf(num)==list.lastIndexOf(num)) {
				System.out.println("First unique number is:-"+num);
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		Integer[] arr = {66,12,69,12,77,66,69,5,8,14};
		Challange2_FirstUniqueNum challange2 = new Challange2_FirstUniqueNum();
		challange2.displayFirstUniqueNum(arr);
	}
}
