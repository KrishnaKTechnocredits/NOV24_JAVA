/*🔹 Assignment 106: Print Fibonacci Series
📥 Input: 10
📤 Output: 0 1 1 2 3 5 8 13 21 34

*/

package pramod.collection;

import java.util.Scanner;

public class Assignment106 {
	
	void printFibonacciSeries(int num) {
		int first=0;
		int second = 1;
		System.out.print("Fibonacci series is: "+ first+" " + second);
		
		for(int i=2; i<num;i++) {
			int sum= first+second;
			first=second;
			second = sum;
			System.out.print(" "+sum);
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Enter the number to print fibonacci Series:");
		Scanner sc= new Scanner(System.in);
		int num=sc.nextInt();
		while(num<2) {
			System.out.println("Please enter valid number more than 1: ");
			num= sc.nextInt();
		}	
		
		new Assignment106().printFibonacciSeries(num);
		sc.close();
	}
}
