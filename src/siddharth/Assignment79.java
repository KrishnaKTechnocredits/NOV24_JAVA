package siddharth;

import java.util.Arrays;
import java.util.List;

/*
Assignment - 79 : 11th Jan
Find out all the duplicate elements from given arrayList.

input : [10, 99, 10, 10, 77, 55, 46, 99]'
output : 10 is duplicate, at index 0 and 3 
         99 is duplicate , at index 1 and 7. 
 */
public class Assignment79 {
	
	void getDuplicateElements(Integer[] arr ){
		List<Integer> al=Arrays.asList(arr);
		for(int i=0;i<al.size();i++) {
			while(al.indexOf(al.get(i))!=al.lastIndexOf(al.get(i)) && i==al.indexOf(al.get(i))) { //controlled duplicate prints by comparing i with 1st index of the element
				System.out.println(al.get(i)+" is duplicate, at index "+al.indexOf(al.get(i))+" and "+al.lastIndexOf(al.get(i)));
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		Integer[] input={10, 99, 10, 10, 77, 55, 46, 99};
		Assignment79 assignment79 = new Assignment79();
		assignment79.getDuplicateElements(input);
	}
}
