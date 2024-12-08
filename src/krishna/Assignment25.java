package krishna;

import java.util.Scanner;

public class Assignment25 {
	
	int getSumOfNumbers(String str) {
		int sum = 0;
		for(int i = 0;i<str.length();i++) {
			if(Character.isDigit(str.charAt(i))) {
				sum += Character.getNumericValue(str.charAt(i));
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter string");
		String str = sc.nextLine();
		
		System.out.println(new Assignment25().getSumOfNumbers(str));
	}
}
