package MousamiB;

import MousamiB.Calculations;

public class Calculations {
		int num1 = 10;
		int num2 = 2;
		
		void addition(){
			int output = num1 + num2;
			System.out.println("Sum of "+num1+" & "+num2+" is  "+output);
		}
		
		void substraction(){
			int output = num1 - num2;
			System.out.println("Subtraction of "+num1+" & "+num2+" is  "+output);
		}
		
		void multiplication(){
			int output = num1 * num2;
			System.out.println("Multiplication of "+num1+" & "+num2+" is  "+output);
		}
		
		void division(){
			int output = num1 / num2;
			System.out.println("Sum of "+num1+" & "+num2+" is  "+output);
		}
		
		public static void main(String[] args){
			Calculations cal = new Calculations();
			cal.addition();
			cal.substraction();
			cal.multiplication();
			cal.division();
		}
}
