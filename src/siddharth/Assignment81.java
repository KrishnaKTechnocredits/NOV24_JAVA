package siddharth;
/*
Assignment - 81 : 12th Jan
Return the unique list of numbers from given Array. [IMP]

int[] arr = {10,44,55,22,44,11,77,88,99,11};


List<Integer> getUniqueNumberList(int[] input){
	List<Integer> listOfNumbers = new ArrayList<Integer>();
}

output : [10,44,55,22,11,77,88,99]
Hint : contains method of ArrayList.
 */
import java.util.ArrayList;
import java.util.List;

public class Assignment81 {

	List<Integer> getUniqueNumbers(int[] arr) {
		List<Integer> listOfNumbers = new ArrayList<Integer>();
		for(int i=0;i<arr.length;i++) {
			int num=arr[i];
			if(!listOfNumbers.contains(num)) {
				listOfNumbers.add(num);
			}
		}
		return listOfNumbers;
	}

	public static void main(String[] args) {
		int[] input= {10,44,55,22,44,11,77,88,99,11};
		Assignment81 assignment81 = new Assignment81();
		List<Integer>ans = assignment81.getUniqueNumbers(input);
		System.out.println(ans);
	}
}