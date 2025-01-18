package ashwini.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

/*
 Assignment - 79 : 11th Jan
Find out all the duplicate elements from given arrayList.

input : [10, 99, 10, 10, 77, 55, 46, 99]
output : 10 is duplicate, at index 0 and 3 
         99 is duplicate , at index 1 and 7.


 */
public class Assignment79 {

	public static void main(String[] args) {
		Integer[] arr = { 10, 99, 10, 10, 77, 55, 46, 99 };
		ArrayList<Integer> al = new ArrayList<Integer>(Arrays.asList(arr));
		for (int i = 0; i < al.size(); i++) {
			Integer num = al.get(i);
			int index = al.indexOf(num);
			int lastIndex = al.lastIndexOf(num);
			if (index != lastIndex && i == index) {
				System.out.println(num + " is duplicate,at index " + index + " and " + lastIndex);
			}
		}

	}

}
