package Assignments1to10;

import java.util.Scanner;

public class Assignment10_MonthPrint {
	
	void printMonths(int num) {
		if(num ==1 || num <= 3) {
			System.out.println("it's quater1");
			if(num ==1) {
				System.out.println("it's january");
			} else if (num == 2) {
				System.out.println("it's february");
			} else {
				System.out.println("it's march");
			}
		}else if(num ==4 || num <= 6) {
			System.out.println("it's quater2");
			if(num ==4) {
				System.out.println("it's april");
			} else if (num == 5) {
				System.out.println("it's may");
			} else {
				System.out.println("it's june");
			}
		}else if(num ==7 || num <= 9) {
			System.out.println("it's quater3");
			if(num ==7) {
				System.out.println("it's july");
			} else if (num == 8) {
				System.out.println("it's augest");
			} else {
				System.out.println("it's september");
			}
		}else if(num ==10 || num <= 12) {
			System.out.println("it's quater4");
			if(num ==10) {
				System.out.println("it's october");
			} else if (num == 11) {
				System.out.println("it's november");
			} else {
				System.out.println("it's december");
			}
		} else if (num <=0) {
			System.out.println("number should be greater than 0");
		} else if (num > 12){
			System.out.println("number shouldn't greater than 12");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter month index");
		int num = sc.nextInt();
		
		new Assignment10_MonthPrint().printMonths(num);
	}
}
