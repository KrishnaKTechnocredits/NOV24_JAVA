package krishna;

import java.util.Scanner;

public class Assignment30 {
	
	void getSum(String str) {
		int sumOfEvenNumbers = 0;
		int sumOfOddNumbers = 0;
		for(int i = 0;i<str.length();i++) {
			if(Character.isDigit(str.charAt(i))) {
				if(str.charAt(i)%2==0) {
					sumOfEvenNumbers += Character.getNumericValue(str.charAt(i));
				}else
					sumOfOddNumbers += Character.getNumericValue(str.charAt(i));
			}
		}
		System.out.println("sum of even numbers : " + sumOfEvenNumbers);
		System.out.println("sum of odd numbers : " + sumOfOddNumbers);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter string");
		String str = sc.nextLine();
		
		new Assignment30().getSum(str);
		
	}
	
}
