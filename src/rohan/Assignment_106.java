/*
 * Assignment - 106 : 2st Feb'2025
Print Fibonacci series for first nth number.
Input : 10
output : 0 1 1 2 3 5 8 13 21 34
 */
package rohan;
import java.util.*;
public class Assignment_106 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number::");
		int input = sc.nextInt();
		int first = 0;
		int sec = 1;
		int next = 0;
		System.out.print("Fibonacci series:: "+first+" "+sec);
		for(int i=2;i<input;i++) {
			next  = first + sec;
			System.out.print(" "+next);
			first = sec ;
			sec = next ;
		}
	}

}
