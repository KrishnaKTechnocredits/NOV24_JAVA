package imran.ReverseProgram;

import java.util.Scanner;

public class Example1_ReverseString {

	void getReversed(String data)
	{
		String revWord = "";
		for(int i = 0; i<data.length();i++)
		{
			char ch = data.charAt(i);
			revWord = ch + revWord;
		}
		System.out.println(" The Reversed Strings is "+ revWord);
	}
	
	public static void main(String[] args) {
		Example1_ReverseString example1 = new Example1_ReverseString();
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter String to be Reversed");
		String str  = sc.nextLine();
		example1.getReversed(str);
		sc.close();
	}
}
