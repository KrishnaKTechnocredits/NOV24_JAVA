package krishna;

import java.util.Scanner;

public class Assignmnet32 {
	
	int getCharFreq(String str , char ch) {
		int count = 0;
		for(int i = 0;i<str.length();i++) {
			if(str.charAt(i) == ch) {
				count++;
			}
		}
		return count;
	}
	
	void getCharFreq(String str) {
		for(int i = 0;i<str.length();i++) {
			System.out.println("character "+ str.charAt(i)+ " frequency is "+ getCharFreq(str, str.charAt(i)));
		}
	}
	
	void getCharFreqOptimized(String str) {
		for(int i = 0;i<str.length();i++) {
			if(str.indexOf(str.charAt(i))== i) {
				System.out.println("character "+ str.charAt(i)+ " frequency is "+ getCharFreq(str, str.charAt(i)));
			}
		}
	}
	
	public static void main(String[] args) {
		Assignmnet32 demo = new Assignmnet32();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter string");
		String str = sc.nextLine();
		
		demo.getCharFreqOptimized(str);
		System.out.println();
		demo.getCharFreq(str);
		
	}
}
