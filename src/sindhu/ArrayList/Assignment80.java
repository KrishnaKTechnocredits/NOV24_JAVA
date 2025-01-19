/*Find out all the duplicate elements from given arrayList and print them with their index.

input : [10, 99, 10, 10, 77, 55, 46, 99,99]
output : 10 is duplicate, at index [0, 2,3] 
         99 is duplicate , at index [1,7,8].*/

package sindhu.ArrayList;

import java.util.*;

public class Assignment80 {
	
	public static List<Integer> getAllIndex(List<Integer> al, int num){
		List<Integer> AllIndex = new ArrayList<Integer>();
		for(int j=0; j<al.size(); j++) {
			if(num ==al.get(j)) {
				AllIndex.add(j);
			}
		}
		return AllIndex;
	}
	
	public static void main(String[] args) {
		List<Integer> al = Arrays.asList(10, 99, 10, 10, 77, 55, 46, 99,99);
		
		for(int i=0; i<al.size(); i++) {
			int num = al.get(i);
			
			if(al.indexOf(num)!=al.lastIndexOf(num)&& i== al.indexOf(num)) {
				List<Integer> AllIndex = getAllIndex(al, num);
				System.out.println(num+" is duplicate, at index "+AllIndex);
			}
		}
	}
}
