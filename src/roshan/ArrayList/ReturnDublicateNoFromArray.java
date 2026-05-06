package roshan.ArrayList;

import java.util.*;

public class ReturnDublicateNoFromArray {
	List<Integer> findDublicateNo (Integer [] arr){ //note dont use int use Intiger
		List<Integer> orignalList = Arrays.asList(arr);
		List<Integer> dublicateNo = new ArrayList <>();
		

		//for (int i=0; i<orignalList.size();i++) {
		  //int element = orignalList.get(i); //not require for enhance for loop
		  for(int element : orignalList) {	//can be use for top to bottom ittration			
			int index = orignalList.indexOf(element); //note call on orignal list not on element
			int lastIndex = orignalList.lastIndexOf(element);
			if(index != lastIndex && !dublicateNo.contains(element)) {
				dublicateNo.add(element);
			}
			
		}
		return dublicateNo;
	}
 public static void main(String[] args) {
	Integer [] arr = {10,44,55,22,44,11,77,88,99,11}; //note dont use int use Intiger
	ReturnDublicateNoFromArray returndublicatenofromarray = new ReturnDublicateNoFromArray();
	List<Integer> outPut = returndublicatenofromarray.findDublicateNo(arr);
	System.out.println(outPut);
}
}


/*
 * Assignment - 82 : 12th Jan Return the list of duplicate numbers from given
 * Array. [IMP]
 * 
 * int[] arr = {10,44,55,22,44,11,77,88,99,11}; output : [44, 11]
 */
