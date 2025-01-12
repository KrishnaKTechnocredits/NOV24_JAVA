package krishna;

import java.util.Scanner;
//print count of divisible numbers
public class Assignment15 {

	void findFirstDivisibleNumbers(int startIndex, int endIndex) {
		int count =0;
		for(int i = startIndex; i <= endIndex;i++) {
			if(i%3==0 && i%4==0) {
				System.out.println(i + " is divisible by 3 & 4");
				count++;
				if(count ==3) {
					break;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter start index");
		int startIndex = sc.nextInt();
		
		System.out.println("please enter end index");
		int endIndex = sc.nextInt();
		
		new Assignment15().findFirstDivisibleNumbers(startIndex, endIndex);
		
	}
}
