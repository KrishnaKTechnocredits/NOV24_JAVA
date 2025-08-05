package Assignments_Collections_Framework_Map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Assignment101 {
	
	int getSecondLargestNumber(int[] arr) {
		List<Integer> listOfNumbers = new ArrayList<Integer>();
		for(int num:arr) {
			listOfNumbers.add(num);
		}
		Collections.sort(listOfNumbers);
		return listOfNumbers.get(listOfNumbers.size()-2);
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter size for array");
		int arrSize = sc.nextInt();
		int[] arr = new int[arrSize];
		for(int i = 0;i<arrSize;i++) {
			System.out.println("please enter array index value");
			arr[i] = sc.nextInt(); 
		}
		sc.close();
		System.out.println(new Assignment101().getSecondLargestNumber(arr));
	}
}
