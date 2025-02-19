/*
 Assignment 102: Reverse a Number Without Using Strings
📥 Input: 321
📤 Output: 123
 */
package imran.ReverseProgram;

import java.util.Scanner;

public class Assignment102_ReverseNumber {

	void getReversed(int data)
	{
		int revNum =0;
		while(data!=0)
		{
			revNum = revNum*10 + data%10;
			data = data/10;
		}
		System.out.println("The Reversed Number is " + revNum);
	}
	public static void main(String[] args) {
		
		Assignment102_ReverseNumber assignment102_1 = new Assignment102_ReverseNumber();
		int num1 = 321;
		System.out.println("The Given number is " + num1);
		assignment102_1.getReversed(num1);
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter Number to be Reversed");
		int num = sc.nextInt();
		assignment102_1.getReversed(num);
		sc.close();
	}
}
