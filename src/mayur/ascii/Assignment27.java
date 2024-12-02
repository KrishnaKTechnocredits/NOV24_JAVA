/*
 * Assignment - 27 : 2nd Dec'2024 [10 mins]

Write a method which returns character of given ascii value.

input : 65
output : A

input : 90
output : Z

input : 55
output : 8 
 */

package mayur.ascii;

public class Assignment27 {
	
	char getChar(int val) {
		System.out.println("Input ascii value  = "+val);
		char ch = (char) val;
		return ch;
	}
	
	public static void main(String[] args) {
		Assignment27 a27 = new Assignment27();
		System.out.println("Character for given ascii value is "+a27.getChar(65));
		System.out.println("Character for given ascii value is "+a27.getChar(90));
		System.out.println("Character for given ascii value is "+a27.getChar(55));
	}
}
