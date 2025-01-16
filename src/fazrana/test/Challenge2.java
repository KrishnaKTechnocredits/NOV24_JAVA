//Challenge - 2
//Find first Unique number from given list. 
//
//input : [66,12,69,12,77,66,69,5,8,14]
//output : First unique number is 77

package fazrana.test;

import java.util.*;

public class Challenge2 {
	int getFirstUniqueNumber(Integer[] array) {
		int firstUniqueValue=0;
		List<Integer> list=new ArrayList<Integer>(Arrays.asList(array));
		for(int i=0;i<list.size();i++) {
			int value=list.get(i);
			if(list.indexOf(value)==list.lastIndexOf(value)) {
				firstUniqueValue= value;
				break;
			}
			
		}
		return firstUniqueValue;
	}
	
	public static void main(String[] args) {
		Integer[] input = {66,12,69,12,77,66,69,5,8,14};
		System.out.println("Input:"+ Arrays.toString(input));
		Challenge2 challenge2=new Challenge2();
		System.out.println("First unique number is "+challenge2.getFirstUniqueNumber(input));
	}
}
