package AssignmentDemoCode;

import java.util.Scanner;

public class Assignment106 {

	void printFibonacciSeries(int num) {
		int num1 = 0;
		System.out.print(num1 + " ");
		int num2 = 1;
		System.out.print(num2 + " ");
		int sum = num1+num2;
		for(int i = 3;i<=num;i++) {
			System.out.print(sum + " ");
			num1 = num2;
			num2 = sum;
			sum = num1 + num2;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter number");
		int num = sc.nextInt();
		
		new Assignment106().printFibonacciSeries(num);
	}
}
