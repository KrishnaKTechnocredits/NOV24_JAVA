/*
Find out the 3rd largest number from given list.

Input : [55,44,55,12,99,99,36,24,8,23]
output : 44

*/

package pramod.collection;
import java.util.*;
class Challenge1{

	public static void main(String[] args){
		List<Integer> list =new ArrayList<Integer>();
		list.add(55);
		list.add(44);
		list.add(55);
		list.add(12);
		list.add(99);
		list.add(99);
		list.add(36);
		list.add(24);
		list.add(8);
		list.add(23);
		System.out.println("Given list is : "+list);
		Set<Integer> hs =new  TreeSet<Integer>(list);
		List<Integer> list1 =new ArrayList<Integer>(hs);
		System.out.println("Third highest number is: "+list1.get(hs.size()-3));
	}
}