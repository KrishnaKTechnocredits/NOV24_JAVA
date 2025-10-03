package roshan.ArrayList;

import java.util.*;

public class FindDublicateAndReturWithIndex {
		void ReturnDublicateWithIndex(List <Integer>al){
			List<Integer> FOccurance = new ArrayList<Integer>();

		for(int i=0;i < al.size();i++){ 
			int element = al.get(i);
			int indexofnum = al.indexOf(element);
			int lastIndexofnum = al.lastIndexOf(element);
			if(indexofnum!=lastIndexofnum && indexofnum == i ) { 
				//note not removing dublicate index comaring like >> 0 != 3 && 0 == 0 →
				//where indexofnum & lastIndexofnum will remain sameonly i change
				// checking if indexOfNum and lastIndexOfNum are not equals which means number
				// is duplicate and i == indexOfNum ensures that for duplicate number, we print
				// the statement only once

				FOccurance = getArrayListOfIndex(al,element);
				System.out.println(element + " on index " +FOccurance);
			}
			
		}
		}
		
		List <Integer>getArrayListOfIndex(List <Integer>al,int element){
			List<Integer> all = new ArrayList<Integer>();

			for(int i=0;i < al.size();i++){
				int element2 = al.get(i);
				if(element2==element) {
					all.add(i);
				}
				
				
				/**
				 * Assignment - 80 : 11th Jan
				 * 
				 * Find out all the duplicate elements from given arrayList and print them with
				 * their index.
				 * 
				 * Input : [10, 99, 10, 10, 77, 55, 46, 99,99]
				 * 
				 * Output : 10 is duplicate, at index [0, 2,3] 99 is duplicate , at index
				 * [1,7,8].
				 */


			}

			return all;
		}
		
	public static void main(String[] args) {
		List <Integer> al = new ArrayList<>();
		al.add(10);
		al.add(99);
		al.add(10);
		al.add(10);
		al.add(77);
		al.add(55);
		al.add(46);
		al.add(99);
		al.add(99);
		
		FindDublicateAndReturWithIndex findDublicateandreturn = new FindDublicateAndReturWithIndex();
		findDublicateandreturn.ReturnDublicateWithIndex(al);
		
		
		
	}

}
