/*
Challenge - 3
Find all the missing numbers between 1 to 10 from given List.

input : [9,7,6,2,1,5,3,10]
output : [4,8]
*/

package pramod.collection;
import java.util.*;
class Challenge3{

	public static void main(String[] args){
		Integer[] input ={9,7,6,2,1,5,3,10};
		List<Integer> list = new ArrayList<Integer>();
		for(int num : input){
			list.add(num);
		}
		System.out.println("Given list is : "+ list);
		List<Integer> newList = new ArrayList<Integer>();
		for(int i=1; i<=10;i++){
			if(!list.contains(i)){
				newList.add(i);
			}
		}
		System.out.println("Missing numbers are : "+ newList);
	}
}