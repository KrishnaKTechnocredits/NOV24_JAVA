package swapnil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Assignment91 {
	void uniqueNum(Integer[] arr){
		
		Set<Integer> setOfNum = new TreeSet<Integer>(Arrays.asList(arr)); 
		
		//List<Integer> list = new ArrayList<Integer>(setOfNames);
		
		System.out.println(setOfNum);
		
		
		
	}
	public static void main(String[] args) {
		Integer[] arr = {66,33,44,12,99,22,33,33,66};
		Assignment91 a = new Assignment91();
		a.uniqueNum(arr);
	}
}
