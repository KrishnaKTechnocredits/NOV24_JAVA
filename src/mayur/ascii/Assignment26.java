/*
 * Assignment - 26 : 2nd Dec'2024 [10 mins]

Write a method which returns ascii value of given character. 

input : 'A'
output : 65

input : 'x'
output : 120

input : ' '
output : 32

input : '.'
output : 46
 */

package mayur.ascii;

public class Assignment26 {
	
	int getAscii(char ch) {
		System.out.println("Input char = "+ch);
		int a = ch;
		return a;
	}
	
	public static void main(String[] args) {
		Assignment26 assign26 = new Assignment26();
		System.out.println("Ascii value for given input is "+assign26.getAscii('A'));
		System.out.println("Ascii value for given input is "+assign26.getAscii('x'));
		System.out.println("Ascii value for given input is "+assign26.getAscii(' '));
		System.out.println("Ascii value for given input is "+assign26.getAscii('.'));
		
	}
}
