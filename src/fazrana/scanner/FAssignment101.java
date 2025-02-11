//Assignment - 101 : 1st Feb'2025
//On user defined numbers, find out the second largetest number. 
//Hint : Use scanner.

package fazrana.scanner;

import java.util.Scanner;
import java.util.*;

public class FAssignment101 {
	void getSecondLargestNumber() {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("provide count of given number");
		int length=scanner.nextInt();
		Set<Integer> set= new TreeSet<Integer>();
		
		for(int i=0;i<length;i++) {
			System.out.println("Input number");
			int num=scanner.nextInt();
			set.add(num);
		}
		scanner.close();
		List<Integer> list= new ArrayList<Integer>(set);
		System.out.println(list);
		int secondLargestNumer=list.get(list.size()-2);
		
		System.out.println(secondLargestNumer);
	}
	
	public static void main(String[] args) {
		FAssignment101 fassignment101=new FAssignment101();
		fassignment101.getSecondLargestNumber();
	}
}
