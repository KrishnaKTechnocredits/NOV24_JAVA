package anuja.anuja_interview;

import java.util.Scanner;

//check for armstrong, addition of all digit cube is same num ex=153, 123
public class Assignment104Armstrong {
	public static void main(String[] args) {
		Assignment104Armstrong obj = new Assignment104Armstrong();
		int num = 123;
		int num2 = 153;
		int num4 = 9474; // 4 digit num required multiplication 4 times.
		obj.checkForArmstringGeneric(num4);//valid num with 4 digits
		obj.checkForArmstrong(num2); //valid num with 3digits
		obj.checkForArmstrong(num); //invalid num

	}

	public void checkForArmstrong(int num) {//only work for 3 digits
		System.out.println("Input is : " + num);
		int inputNum = num;
		int armStrongNm = 0;

		while (inputNum > 0) {
			int digit = inputNum % 10;
			armStrongNm = armStrongNm + (digit * digit * digit);
			inputNum = inputNum / 10;

		}
		boolean flag = armStrongNm == num;
		handleFlag(flag);
	}

	public void checkForArmstringGeneric(int num) {
		System.out.println("Input is : " + num);
		int inputNum = num;
		double armStrongNm = 0;
		String str = "";
		str = str + num;
		int numLength = str.length();
		System.out.println("Number of digits present in a given nu is: " + numLength);
		
		while (inputNum > 0) {
			int digit = inputNum % 10;
			armStrongNm = armStrongNm + Math.pow(digit, numLength);//length required 
			inputNum = inputNum / 10;

		}

		boolean flag = (armStrongNm == num);
		handleFlag(flag);
	}

	public void handleFlag(boolean flag) {
		if (flag) {
			System.out.println("given num is an Armstrong number.");
		} else {
			System.out.println("given num is not Armstrong number.");

		}
	}

}
