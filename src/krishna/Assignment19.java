package krishna;

import java.util.Scanner;
//get reverse string
public class Assignment19 {

	String getReverseOutput(String input) {
		String output = "";
		for(int index = input.length()-1;index>=0;index--) {
			output += input.charAt(index);
		}
		
		return output ;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter a string");
		String str = sc.next();
		
		System.out.println(new Assignment19().getReverseOutput(str));
	}
}
