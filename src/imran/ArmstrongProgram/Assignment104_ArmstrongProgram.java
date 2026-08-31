/*
 Assignment 104: Check for Armstrong Number
📥 Input: 153
✅ 153 is an Armstrong number

📥 Input: 123
❌ 123 is not an Armstrong number
 */
package imran.ArmstrongProgram;

import java.util.Scanner;

public class Assignment104_ArmstrongProgram {

	void checkArmstrong(int data)
	{
		int num = data;
		int sum =0;
		while(num!=0)
		{
			int numdata = num%10;
			num = num/10;
			sum = getCube(numdata) + sum;
		}
		
		if(sum == data)
		{
			System.out.println("The given number is " + data + " And its sum of digit is "+ sum + ". Hence it is Armstrong Digit.");
		}
		else
		{
			System.out.println("The given number is " + data + " And its sum of digit is "+ sum + ". Hence it is not an Armstrong Digit.");
		}
	}
	 
	int getCube(int data)
	{
		data = data* data* data;
		return data;
	}
	
	public static void main(String[] args) {
		int num = 153;
		Assignment104_ArmstrongProgram assignment104 = new Assignment104_ArmstrongProgram();
		assignment104.checkArmstrong(num);
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter Digit to check Armstrong ");
		int data = sc.nextInt();
		assignment104.checkArmstrong(data);
		sc.close();
	}
}
