package siddharth;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Assignment - 80 : 11th Jan
Find out all the duplicate elements from given arrayList and print them with their index.

input : [10, 99, 10, 10, 77, 55, 46, 99,99]
output : 10 is duplicate, at index [0, 2,3] 
         99 is duplicate , at index [1,7,8].
 */
public class Assignment80 {
	
	List<Integer> getArrayListOfIndex(List<Integer> al,int input){
		ArrayList<Integer> allIndex = new ArrayList<Integer>();
		for(int i=0;i<al.size();i++) {
			if(al.get(i)==input) {
				allIndex.add(i);
			}
		}
		return allIndex;
	}
	
	void getDuplicateElements(Integer[] arr ){
		List<Integer> al=Arrays.asList(arr);
		
		for(int i=0;i<al.size();i++) {
			List<Integer> allIndex=getArrayListOfIndex(al,al.get(i));
			while(al.indexOf(al.get(i))!=al.lastIndexOf(al.get(i)) && i==al.indexOf(al.get(i))) { //controlled duplicate prints by comparing i with 1st index of the element
				System.out.println(al.get(i)+" is duplicate, at index "+allIndex);
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		Integer[] input={10, 99, 10, 10, 77, 55, 46, 99};
		Assignment80 assignment80 = new Assignment80();
		assignment80.getDuplicateElements(input);
	}
}

