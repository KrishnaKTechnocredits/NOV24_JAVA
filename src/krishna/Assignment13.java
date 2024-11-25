package krishna;

import java.util.Scanner;
//find divisible numbers
public class Assignment13 {

	void findDivisibleNumberInGivenRange(int startIndex , int endIndex) {
		for(int i= startIndex;i<=endIndex;i++) {
			if(i%3==0 && i%5 ==0) {
				System.out.println(i + " is divisible by 3 & 5");
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter start index");
		int startIndex = sc.nextInt();
		
		System.out.println("please enter end index");
		int endIndex = sc.nextInt();
		
		new Assignment13().findDivisibleNumberInGivenRange(startIndex, endIndex);
		
	}
}
