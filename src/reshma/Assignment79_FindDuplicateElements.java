package reshma;
/* Find out all the duplicate elements from given arrayList.
  Input : [10, 99, 10, 10, 77, 55, 46, 99]
  Output : 10 is duplicate, at index 0 and 3 99 is duplicate , at index 1 and 7. */

import java.util.ArrayList;
import java.util.List;

public class Assignment79_FindDuplicateElements {
	void printDuplicateElements(List<Integer> input) {
		for (int i = 0; i < input.size(); i++) {
			int num = input.get(i);
			int indexOfNum = input.indexOf(num);
			int lastIndexOfNum = input.lastIndexOf(num);
			if (indexOfNum != lastIndexOfNum && i == indexOfNum) {
				System.out.println(+num + " is dupliacte,at index " + indexOfNum + " and  " + lastIndexOfNum);
			}
		}
	}

	public static void main(String[] args) {
		List<Integer> input = new ArrayList<Integer>();
		input.add(10);
		input.add(99);
		input.add(10);
		input.add(10);
		input.add(77);
		input.add(55);
		input.add(46);
		input.add(99);
		
		Assignment79_FindDuplicateElements a79 = new Assignment79_FindDuplicateElements();
		System.out.println("Output : ");
		a79.printDuplicateElements(input);
		}
}
