package ashwini.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 Assignment - 80 : 11th Jan
Find out all the duplicate elements from given arrayList and print them with their index.

input : [10, 99, 10, 10, 77, 55, 46, 99,99]
output : 10 is duplicate, at index [0, 2,3] 
         99 is duplicate , at index [1,7,8].

 */
public class Assignment80 {
	List<Integer> getArrayListOfIndex(ArrayList<Integer> al, int num) {
		List<Integer> allIndex = new ArrayList<Integer>();
		for (int i = 0; i < al.size(); i++) {
			if (al.get(i) == num) {
				allIndex.add(i);
			}
		}
		return allIndex;
	}

	void getDuplicateNum(ArrayList<Integer> al) {
		Integer num = 0;
		for (int i = 0; i < al.size(); i++) {
			num = al.get(i);
			int index = al.indexOf(num);
			int lastIndex = al.lastIndexOf(num);
			if (index != lastIndex && i == index) {
				num = al.get(index);
				List<Integer> output = getArrayListOfIndex(al, num);
				System.out.println(num + " is duplicate,at index " + output);
			}
		}
	}

	public static void main(String[] args) {
		Assignment80 a80 = new Assignment80();
		Integer[] arr = { 10, 99, 10, 10, 77, 55, 46, 99, 99 };
		ArrayList<Integer> al = new ArrayList<Integer>(Arrays.asList(arr));
		a80.getDuplicateNum(al);
	}
}
