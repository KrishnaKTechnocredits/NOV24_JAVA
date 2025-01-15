/*Remove duplicate from 2 list, and return all the unique elements from both list. 

input : [10, 20, 30, 40]
        [20,30,60,70,80,90,100,101,44,55,66,77]
output : [10,20,30,40,60,70,80,90,100,101,44,55,66,77]		

al2.removeAll(al1);
al1.addAll(al2);*/

package sindhu.ArrayList;

import java.util.*;

public class Assignment85 {
	public static void main(String[] args) {
		Integer[] input1 = {10, 20, 30, 40};
	    Integer[] input2 = {20, 30, 60, 70, 80, 90, 100, 101, 44, 55, 66, 77};
		Assignment85 a85 = new Assignment85();
		List<Integer> al1 = new ArrayList<>(Arrays.asList(input1));
		System.out.println("Input ArrayList 1: "+ al1);
		List<Integer> al2 = new ArrayList<>(Arrays.asList(input2));
		System.out.println("Input ArrayList 2: "+ al2);
		List<Integer> outAl = a85.getUnionArrayList(al1,al2);
		System.out.println("Output ArrayList without duplicates: "+ outAl);
	}
	
	public List<Integer> getUnionArrayList(List<Integer> al1, List<Integer> al2){
		List<Integer> UnionList = new ArrayList<>();
		al1.addAll(al2);
		System.out.println("Union of ArrayList 1 and 2: " +al1);
		for(int i=0; i<al1.size(); i++) {
			int num1 = al1.get(i);
			
			if(al1.indexOf(num1)== al1.lastIndexOf(num1)) {
				UnionList.add(al1.get(i));
			}else if(al1.indexOf(num1)!= al1.lastIndexOf(num1) && i == al1.indexOf(num1)) {
				UnionList.add(al1.get(i));
			}
		}
		return UnionList;
	}
	
}
