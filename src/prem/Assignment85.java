package prem;

import java.util.*;

public class Assignment85 {
	
	public static void main(String[] args) {
		
		Integer[] input = {10, 20, 30, 40};
		ArrayList<Integer> originalList1 = new ArrayList<Integer>(Arrays.asList(input));
		Integer[] input1 = {20,30,60,70,80,90,100,101,44,55,66,77};
		ArrayList<Integer> originalList2= new ArrayList<Integer>(Arrays.asList(input1));
	
		originalList2.removeAll(originalList1);
		originalList1.addAll(originalList2);
		System.out.println(originalList1);
	}

}
