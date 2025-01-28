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
//}

package komal.Collection.List;

import java.util.ArrayList;
import java.util.Arrays;

public class Assignment80 {
	void getIndex(ArrayList<Integer> input, int num) {
		ArrayList<Integer> duplicateIndexArray = new ArrayList<>();
		for (int i = 0; i < input.size(); i++) {
			int currentNum = input.get(i);
			if (currentNum == num) {
				duplicateIndexArray.add(i);
			}
		}
		System.out.println(num + " isduplicate at index " + duplicateIndexArray);
	}

	void getDuplicateValue(ArrayList<Integer> input) {
		ArrayList<Integer> duplicateArray = new ArrayList<>();
		for (int i = 0; i < input.size(); i++) {
			int currentNumber = input.get(i);
			while (input.indexOf(currentNumber) != i && !duplicateArray.contains(currentNumber)) {
				duplicateArray.add(currentNumber);
			}
		}
		System.out.println("Dupicates are => " + duplicateArray);
		for (int i = 0; i < duplicateArray.size(); i++) {
			int num = duplicateArray.get(i);
			getIndex(input, num);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment80 a80 = new Assignment80();
		Integer[] input = { 10, 99, 10, 10, 77, 55, 46, 99, 99 };
		ArrayList<Integer> al = new ArrayList<>(Arrays.asList(input));
		a80.getDuplicateValue(al);
	}

}
