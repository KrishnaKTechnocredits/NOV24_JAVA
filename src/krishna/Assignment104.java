package AssignmentDemoCode;

import java.util.Scanner;

public class Assignment104 {
	
	boolean getArmStrongNumber(int num) {
		int armStrongNum = 0;
		int temp = num;
		while(num !=0) {
			int digit = num%10;
			armStrongNum = armStrongNum + (digit*digit*digit);
			num = num/10;
		}
		if(temp== armStrongNum ) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter number ");
		int num = sc.nextInt();
		
		if(new Assignment104().getArmStrongNumber(num)) {
			System.out.println(num + " is armstrong");
		}else
			System.out.println(num + " is not armstrong");
	}
}
