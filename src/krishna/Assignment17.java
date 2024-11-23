package krishna;

import java.util.Scanner;
//find last divisible number
public class Assignment17 {
	
	void findLastDivisibleNumbers(int startIndex, int endIndex) {
		int sumOfNumbers = 0;
		int average = 0;
		int count =0;
		for(int i = endIndex; i >= startIndex;i--) {
			if(i%5==0) {
				System.out.println(i + " is divisible by 5");
				count++;
				sumOfNumbers += i;
				if(count ==3) {
					break;
				}
			}
		}
		average = sumOfNumbers*count;
		System.out.println(average + " is the average of numbers in a given range which is divisible by 5");
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter start index");
		int startIndex = sc.nextInt();
		
		System.out.println("please enter end index");
		int endIndex = sc.nextInt();
		
		new Assignment17().findLastDivisibleNumbers(startIndex, endIndex);
		
	}
}
