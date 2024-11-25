package krishna;

import java.util.Scanner;

// get digit count in given string
public class Assignment22 {
	
	boolean isDigit(char ch) {
		boolean flag = false;
		if(Character.isDigit(ch)) {
			flag = true;
		}else {
			flag = false;
		}
		return flag;
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter string");
		String str = sc.next();
		int count = 0;
		boolean flag = false;
		for(int i = 0;i<str.length();i++) {
			flag = new Assignment22().isDigit(str.charAt(i));
			if(flag == true) {
				count++;
			}
			
		}
		System.out.println("Count of digits in the given string is "+count);
	}
}
