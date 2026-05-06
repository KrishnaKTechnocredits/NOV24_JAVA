/*
Challenge - 2
Find first Unique number from given list. 

input : [66,12,69,12,77,66,69,5,8,14]
output : First unique number is 77
*/

package pramod.collection;
import java.util.*;
class Challenge2{

	public static void main(String[] args){
		List<Integer> list = new ArrayList<Integer>();
		list.add(66);
		list.add(12);
		list.add(69);
		list.add(12);
		list.add(77);
		list.add(66);
		list.add(69);
		list.add(5);
		list.add(8);
		list.add(14);
		System.out.println("Given list is: "+ list);
		
		for (int i =0; i<list.size();i++){
			int num = list.get(i);
			int currentIndex = list.indexOf(num);
			int lastIndex = list.lastIndexOf(num);
			if(currentIndex==lastIndex){
				System.out.println("First Unique number is: "+ list.get(i));
				break;
			}
		}
	}
}