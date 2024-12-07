package krishna;

import java.util.Scanner;

public class Assignement28 {
	
	void getCharacters(int startIndex,int endIndex) {
		for(int i = startIndex;i<=endIndex;i++) {
			System.out.println("Character of given ascii value , "+ i+ " is :  "  + (char) i);
		}
	}
	
	int getAsciiValue(char ch) {
		return ch;
	}

	public static void main(String[] args) {
		Assignement28 demo = new Assignement28();
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter start index");
		int startIndex = sc.nextInt();
		System.out.println("please enter end index");
		int endIndex = sc.nextInt();
		System.out.println("Characters");
		demo.getCharacters(startIndex, endIndex);
		
		System.out.println("Ascii Value");
		for(char ch = 'A';ch<='Z';ch++) {
			System.out.println("Ascii Value of given character ,"+ ch + " is : "+ demo.getAsciiValue(ch));
		}
		
	}
}
