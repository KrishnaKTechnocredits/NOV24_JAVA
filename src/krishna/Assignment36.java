package krishna;

import java.util.Scanner;

public class Assignment36 {
	
	void processData(int startRange , int endRange , int rangeForInnerLoop ,  int endRangeForLoop){
		for(int i = startRange ;i<=endRange;i++) {
			for(int j = rangeForInnerLoop;j<=endRangeForLoop;j++) {
				System.out.println(i + "*" + j+ " = " + i*j);
			}
			System.out.println("-------------------------------");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter start range for outer for loop");
		int num1 = sc.nextInt();
		
		System.out.println("please enter end range for outer for loop");
		int num2 = sc.nextInt();
		
		System.out.println("please enter start range for inner for loop");
		int num3 = sc.nextInt();
		
		System.out.println("please enter end range for inner for loop");
		int num4 = sc.nextInt();
		
		new Assignment36().processData(num1, num2, num3, num4);
	}
}
