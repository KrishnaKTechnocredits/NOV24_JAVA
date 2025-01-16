package kishor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

//Find out the 3rd largest number from given list.
//Input : [55,44,55,12,99,99,36,24,8,23]
//output : 44

public class Challange1_ThirdLargestNum {
	
	public static void main(String[] args) {
		
		Integer[] arr= {55,44,55,12,99,99,36,24,8,23};
		
		Set<Integer> set = new TreeSet<Integer>(Collections.reverseOrder());
		for(int i=0;i<arr.length;i++) {
			int num = arr[i];
			if(set.add(num)==true) {
				set.add(num);
			}
		}
		List<Integer> list =new ArrayList<Integer>(set);
		
		System.out.println("The thirs largest number is:-"+list.get(2));
	}
}
