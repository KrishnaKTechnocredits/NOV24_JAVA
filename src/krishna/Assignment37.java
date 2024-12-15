package krishna;

import java.util.Scanner;

public class Assignment37 {
	
	void printCharFreq(String str) {
		for(int i = 0;i<str.length();i++) {
			int count = 0;
			if(str.indexOf(str.charAt(i))== i) {
				for(int j = 0;j<str.length();j++) {
					if(str.charAt(i) == str.charAt(j)) {
						count++;
					}
				}
				System.out.println( " freq of character "+ str.charAt(i) + " in given string is : " + count );
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter string");
		String str = sc.nextLine();
		
		new Assignment37().printCharFreq(str);
	}
}
