package anuja.string;

/*Write a method which returns character of given ascii value.

input : 65
output : A

input : 90
output : Z

input : 55
output : 8 */

public class Assignment27 {
	
	public static void main(String[] args) {
		Assignment27 assignment27 = new Assignment27();
		
		int ascii1 = 65;
		char result1 = assignment27.getCharFromAscii(ascii1);
		System.out.println("Charachater of given Ascii num: " + ascii1 + " is -> " +result1 + ". \n");
		
		int ascii2 = 90;
		char result2 = assignment27.getCharFromAscii(ascii2);
		System.out.println("Charachater of given Ascii num: " + ascii2 + " is -> " +result2 + ". \n");
		
		int ascii3 = 55;
		char result3 = assignment27.getCharFromAscii(ascii3);
		System.out.println("Charachater of given Ascii num: " + ascii3 + " is -> " +result3 + ". \n");
			
		}

	public char getCharFromAscii(int ascii) {
		 
		 char ch = (char)ascii;
		
		return ch;		
	}
}
