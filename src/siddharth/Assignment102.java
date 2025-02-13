package siddharth;

import java.util.Scanner;

/*
Assignment 102: Reverse a Number Without Using Strings
Input: 321
Output: 123
 */
public class Assignment102 {
	
	int getRevNumber(int input){
		int revNum=0;
			while(input>0) {
				int digit = input%10; //input%10 gives the last digit
				revNum = revNum*10 + digit; //Sets the last digit
				input = input/10; //This eliminates the last digit from input
			}
		return revNum;
	}
	
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter your Number to reverse :");
		 int input = sc.nextInt();
		 sc.close();
		 Assignment102 assignment102 = new Assignment102();
		 int ans = assignment102.getRevNumber(input);
		 System.out.println(ans);
	}
}
