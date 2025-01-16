//Challenge - 3
//Find all the missing numbers between 1 to 10 from given List.
//
//input : [9,7,6,2,1,5,3,10]
//output : [4,8]

package fazrana.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Challenge3 {
	List<Integer> getMissingNumber(Integer[] array) {
		List<Integer> list=new ArrayList<Integer>(Arrays.asList(array));
		List<Integer> output=new ArrayList<Integer>();
		for(int i=1;i<=10;i++) {
			if(!list.contains(i)) {
				output.add(i);
			}
		}
		
		return output;
	} 
	
	public static void main(String[] args) {
		Integer[] input = {9,7,6,2,1,5,3,10};
		System.out.println("Input:"+ Arrays.toString(input));
		Challenge3 challenge3=new Challenge3();
		System.out.println("Missing number array: "+challenge3.getMissingNumber(input));
	}
}
