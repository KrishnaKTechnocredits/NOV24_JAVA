package Assignments;

import java.util.Scanner;

public class Assignment18 {

	int getLastDivisibleNumber(int startIndex , int endIndex) {
		int lastNumber =0;
		for(int i = startIndex;i<=endIndex;i++) {
			if(i%5==0) {
				lastNumber = i;
			}
		}
		return lastNumber;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter start index");
		int startIndex = sc.nextInt();
		
		System.out.println("please enter end index");
		int endIndex = sc.nextInt();
		
		int returnValue = new Assignment18().getLastDivisibleNumber(startIndex, endIndex);
		System.out.println(returnValue + " is the last value which is divisible by 5");
		
	}
}
