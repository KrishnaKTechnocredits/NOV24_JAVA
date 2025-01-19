package anuja.collection;
/*
 * Find out all the duplicate elements from given arrayList.
 * 
 * input : [10, 99, 10, 10, 10, 55, 46, 99]' output : 10 is duplicate, at index
 * 0 and 3 99 is duplicate , at index 1 and 7.
 */
import java.util.*;

public class Assignment79 {
    public static void main(String[] args) {
    	Assignment79 assignment79 = new Assignment79();
    	int [] arr = {10, 99, 10, 10, 77, 55, 46, 99};
    	ArrayList<Integer> numList = new ArrayList<>();
    	for(int i = 0 ; i<arr.length ; i++) {
    		numList.add(arr[i]);
    	} // we have created arraylist using array.
    	
    	assignment79.findDuplicateAndIndex(numList);
    }	//main method end
    	

	private void findDuplicateAndIndex(ArrayList<Integer> numList) {
		for(int i = 0 ; i<numList.size() ; i++) {
			if(numList.indexOf(numList.get(i)) != numList.lastIndexOf(numList.get(i)) && i==numList.indexOf(numList.get(i))) {
				//if same then they are not duplicate and we only want to print if i is my 1st occurance of duplcate 
				System.out.println(numList.get(i) +" is duplicate, at index " +numList.indexOf(numList.get(i))+","+numList.lastIndexOf(numList.get(i))+"\n");
			}
		}
	}
}


