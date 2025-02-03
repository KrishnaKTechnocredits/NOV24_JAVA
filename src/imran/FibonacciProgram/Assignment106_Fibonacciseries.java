/*
 Assignment 106: Print Fibonacci Series
📥 Input: 10
📤 Output: 0 1 1 2 3 5 8 13 21 34
 */
package imran.FibonacciProgram;

import java.util.Scanner;

public class Assignment106_Fibonacciseries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Please enter total number of digit to be in Fibonacci series as an index value");
		int index = sc.nextInt();
		System.out.println("The Result fibonacci series is");
		int firstnum =0, secondnum=1, fibonum;
		System.out.println(firstnum);
		System.out.println(secondnum);
		for(int i=0;i<index-2;i++)
		{
			fibonum = firstnum + secondnum;
			System.out.println(fibonum);
			firstnum = secondnum;
			secondnum = fibonum;
		}
		sc.close();
	}
}
