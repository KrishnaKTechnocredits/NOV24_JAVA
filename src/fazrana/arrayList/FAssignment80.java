//Assignment - 80 : 11th Jan
//Find out all the duplicate elements from given arrayList and print them with their index.
//
//input : [10, 99, 10, 10, 77, 55, 46, 99,99]
//output : 10 is duplicate, at index [0, 2,3] 
//         99 is duplicate , at index [1,7,8].
//
//List<Integer> getArrayListOfIndex(ArrayList<Integer> al, int num){
//	ArrayList<Integer> allIndex = new ArrayList<Integer>();
//	for(int index = 0; index<al.size();index++){
//		if(al.get(index) == num){
//			allIndex(index);
//		}
//	}
//	return allIndex;

package fazrana.arrayList;

import java.util.*;

public class FAssignment80 {
	boolean isDuplicate(int num, Integer[] array) {
		boolean output = false;
		List<Integer> input = Arrays.asList(array);
		if (input.lastIndexOf(num) != input.indexOf(num)) {
			output = true;
		}
		return output;
	}

	List<Integer> printIndex(int num, Integer[] array) {
		List<Integer> input = Arrays.asList(array);
		List<Integer> output = new ArrayList<Integer>();
		for (int i = 0; i < input.size(); i++) {
			if (input.get(i) == num) {
				output.add(i);
			}
		}
		return output;
	}

	void getArrayListOfIndex(Integer[] array) {
		List<Integer> input = Arrays.asList(array);
		for (int i = 0; i < input.size(); i++) {
			int value = input.get(i);
			if (isDuplicate(value, array) && i == input.indexOf(value)) {
				System.out.println("Output: "+value + " is duplicated,at index " + printIndex(value, array));
			}
		}
	}

	public static void main(String[] args) {
		Integer[] input = { 10, 99, 10, 10, 77, 55, 46, 99, 99 };
		System.out.println("Input: " + Arrays.toString(input));
		FAssignment80 fassignment80 = new FAssignment80();
		fassignment80.getArrayListOfIndex(input);
	}
}
