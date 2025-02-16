package rohan;
import java.util.*;

public class Assignment_102 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:-");
		int num = sc.nextInt();
		sc.close();
		int reverse = 0;
		while(num !=0) {
			int digit = num%10;
			reverse = reverse*10+digit;
			num /=10;
		}
		System.out.println("Reversed nuumber is = "+reverse);
	}
}
