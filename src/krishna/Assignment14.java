package krishna;

import java.util.Scanner;
//find smallest and biggest divisible numbers
public class Assignment14 {

	void findDivisibleNumberInGivenRange(int startIndex , int endIndex) {
		int sumOfDivisibleNumbers = 0;
		int count = 0;
		for(int i= startIndex;i<=endIndex;i++) {
			if(i%3==0 && i%5 ==0) {
				System.out.println(i + " is divisible by 3 & 5");
				count++;
				sumOfDivisibleNumbers += i;
			}
		}
		System.out.println(sumOfDivisibleNumbers + " is the sum of numbers which is divisible by 3 & 5");
		System.out.println(count + " is the count of numbers which is divisible by 3 & 5");
	}
	
	void findSmallestNumberInGivenRange(int startIndex, int endIndex) {
		int smallestNumber =0;
		for(int i = startIndex; i <= endIndex;i++) {
			if(i%3==0 & i%5==0) {
				smallestNumber = i;
				break;
			}
		}
		System.out.println(smallestNumber + " is the smallest number which is divisible by 3 & 5");
	}
	
	void findBiggestNumberInGivenRange(int startIndex, int endIndex) {
		int biggestNumber =0;
		for(int i = startIndex; i <= endIndex;i++) {
			if(i%3==0 & i%5==0) {
				biggestNumber = i;
			}
		}
		System.out.println(biggestNumber + " is the biggest number which is divisible by 3 & 5");
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter start index");
		int startIndex = sc.nextInt();
		
		System.out.println("please enter start index");
		int endIndex = sc.nextInt();
		
		//new Assignment14().findDivisibleNumberInGivenRange(startIndex, endIndex);
		//new Assignment14().findSmallestNumberInGivenRange(startIndex, endIndex);
		new Assignment14().findBiggestNumberInGivenRange(startIndex, endIndex);
		
	}
}
