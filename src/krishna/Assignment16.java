package krishna;

import java.util.Scanner;
//find average of divisible numbers
public class Assignment16 {
	
	void findAverageOfDivisibleNumbers(int startIndex, int endIndex) {
		int sumOfNumbers = 0;
		int average = 0;
		int count =0;
		for(int i = startIndex; i <= endIndex;i++) {
			if(i%5==0 && i%7==0) {
				System.out.println(i + " is divisible by 5 & 7");
				count++;
				sumOfNumbers += i;
				if(count ==3) {
					break;
				}
			}
		}
		average = sumOfNumbers*count;
		System.out.println(average + " is the average of numbers in a given range which is divisible by 5 & 7");
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter start index");
		int startIndex = sc.nextInt();
		
		System.out.println("please enter end index");
		int endIndex = sc.nextInt();
		
		new Assignment16().findAverageOfDivisibleNumbers(startIndex, endIndex);
		
	}
}
