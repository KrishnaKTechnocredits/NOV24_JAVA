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

	void getDuplicateValue(ArrayList<Integer> input) {

		for (int i = 0; i < input.size(); i++) {
			int currentNumber = input.get(i);
//			System.out.println(input.indexOf(i) + "h" + input.lastIndexOf(i));
			while (input.indexOf(currentNumber) != input.lastIndexOf(currentNumber)) {
				System.out.print(input.get(i) + "hiii");
			}

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
