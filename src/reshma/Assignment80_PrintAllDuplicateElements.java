package reshma;

import java.util.ArrayList;
import java.util.List;

public class Assignment80_PrintAllDuplicateElements {
	List<Integer> getDuplicateElement(ArrayList<Integer> a1, int num) {
		List<Integer> output = new ArrayList<Integer>();
		for (int i = 0; i < a1.size(); i++) {
			if (a1.get(i) == num) {
				output.add(i);
			}
		}
		return output;
	}

	void printDuplicateAllElements(ArrayList<Integer> input) {
		for (int i = 0; i < input.size(); i++) {
			int num = input.get(i);
			int indexOfNum = input.indexOf(num);
			int lastIndexOfNum = input.lastIndexOf(num);
			if (indexOfNum != lastIndexOfNum && i == indexOfNum) {
				System.out.println(num + " is dupliacte, at index " + getDuplicateElement(input, num));
			}
		}
	}

	public static void main(String[] args) {
		ArrayList<Integer> input = new ArrayList<Integer>();
		input.add(10);
		input.add(99);
		input.add(10);
		input.add(10);
		input.add(77);
		input.add(55);
		input.add(46);
		input.add(99);
		input.add(99);

		Assignment80_PrintAllDuplicateElements a80 = new Assignment80_PrintAllDuplicateElements();
		System.out.println("Output : ");
		a80.printDuplicateAllElements(input);
		}
}
