/*Find out all the duplicate elements from given arrayList.

input : [10, 99, 10, 10, 77, 55, 46, 99]'
output : 10 is duplicate, at index 0 and 3 
         99 is duplicate , at index 1 and 7.*/

package sindhu.ArrayList;

import java.util.*;

public class Assignment79 {
	public static void main(String[] args) {
		List<Integer> al = Arrays.asList(10, 99, 10, 10, 77, 55, 46, 99);
		for(int i=0; i<al.size(); i++) {
			int num = al.get(i);
			
			if(al.indexOf(num)!=al.lastIndexOf(num)&& i== al.indexOf(num)) {
				System.out.println(num+" is duplicate, at index "+al.indexOf(num)+" and "+al.lastIndexOf(num));
			}
			
		}
	}
}
