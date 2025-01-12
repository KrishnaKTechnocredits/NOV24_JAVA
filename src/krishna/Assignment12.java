package krishna;

import java.util.Scanner;

//find even number in the given range
public class Assignment12 {

	void findEvenNumbersInGivenRange(int startIndex , int endIndex) {
		for(int i = startIndex; i <=endIndex;i++) {
			if(i%2==0) {
				System.out.println(i + " is even number");
			}
		}
	}
	
	void optimizedFindEvenNumbersInAGivenRange(int startIndex , int endIndex) {
		int sumOfNumbers = 0;
		int count = 0;
		for(int i = startIndex; i <=endIndex;i++) {
			if(i%2==0) {
				System.out.println(i + " is even number");
				count++;
				sumOfNumbers += i; 
			}
		}
		System.out.println(sumOfNumbers + " is the sum of given numbers in the range");
		System.out.println(count + " is the count of total even numbers which is present in the given range");
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter the start index");
		int startIndex = sc.nextInt();
		
		System.out.println("please enter the end index");
		int endIndex = sc.nextInt();
		
		new Assignment12().optimizedFindEvenNumbersInAGivenRange(startIndex, endIndex);
	}
}
