/*Write a method which returns ascii value of given character. 

input : 'A'
output : 65

input : 'x'
output : 120

input : ' '
output : 32

input : '.'
output : 46*/

package sindhu.AsciiPractice;

public class Assignment26 {
	
	void getAsciiValue(char ch) {
		int asciiVal = ch;
		System.out.println("The Ascii value of character "+ch+" is "+asciiVal);
	}
	
	
	public static void main(String[] args) {
		Assignment26 assign26 = new Assignment26();
		char ch = 'A';
		assign26.getAsciiValue(ch);
		 
		ch = 'x';
		assign26.getAsciiValue(ch);
		
		ch = ' ';
		assign26.getAsciiValue(ch);
		
		ch = '.';
		assign26.getAsciiValue(ch);
	}
}
