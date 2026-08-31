package siddharth;
/*
Assignment 104: Check for Armstrong Number
Input: 153
153 is an Armstrong number

Input: 123
123 is not an Armstrong number

Hint: An Armstrong number is one where the sum of each digit raised to the power of the number of digits equals the original number.
 */
public class Assignment104 {
		
	void checkArmstrong(int input) {
		System.out.println("Input : "+input);
		int originalInput = input;
		int lastNum;
		int sum=0;
		while(input>0) {
			lastNum = input%10; //gives last digit
			sum = sum+(lastNum*lastNum*lastNum);
			input=input/10;
		}
		if(sum==originalInput) {
			System.out.println(originalInput+" is an Armstrong number");
		}else {
			System.out.println(originalInput+" is not an Armstrong number");
		}
		System.out.println("=================================");
	}
	
	public static void main(String[] args) {
		int input1 = 153;
		int input2 = 123;
		
		Assignment104 assignment104 = new Assignment104();
		assignment104.checkArmstrong(input1);
		assignment104.checkArmstrong(input2);

	}
}
