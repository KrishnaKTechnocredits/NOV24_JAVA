//Find out all the duplicate elements from given arrayList.
//input : [10, 99, 10, 10, 77, 55, 46, 99]'
//output : 10 is duplicate, at index 0 and 3 
  //       99 is duplicate , at index 1 and 7.


package titiksha.Collections.Arraylist;

import java.util.List;
import java.util.Arrays;

public class Duplicateintegerwithindex {
	void getduplicatevalue(Integer[] arr) {
		System.out.println("Inputlist: " + Arrays.toString(arr));
		List<Integer> inputlist = Arrays.asList(arr);
		for (int i = 0; i < inputlist.size(); i++) {
			int num = inputlist.get(i);
			int index = inputlist.indexOf(num);
			int lastindex = inputlist.lastIndexOf(num);
			if (index != lastindex && i == index) {
				System.out.println(num + " is duplicate,at index " + index + " and " + lastindex);
			}
		}
	}

	public static void main(String[] args) {
		Duplicateintegerwithindex duplicateintegerwithindex = new Duplicateintegerwithindex();
		Integer[] arr = { 10, 99, 10, 10, 77, 55, 46, 99 };
		duplicateintegerwithindex.getduplicatevalue(arr);

	}
}
