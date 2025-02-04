package AssignmentDemoCode;

import java.util.Scanner;

public class Assignment102 {

	int getReverseNumber(int num) {
		int revNumber = 0;
		while (num != 0) {
			int digit = num%10;
			revNumber = revNumber*10+digit;
			num = num/10;
		}
		return revNumber;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("please enter number for reverse");
		int num = scanner.nextInt();
		System.out.println(num+" reverse number is - "+ new Assignment102().getReverseNumber(num));
		
	}
}
