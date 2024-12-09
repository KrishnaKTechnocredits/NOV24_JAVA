package prajaktaP.AscciDemo;

public class Assignment26 {

	int charToAscii(char ch) {
		int ascii = ch;
		return ascii;
	}
	
	public static void main (String[] args) {
		Assignment26 assignment26 = new Assignment26();
		
		char ch = 'A';
		int asciiValue = assignment26.charToAscii(ch);
		System.out.println(" Ascii Value of " + ch + " is " + asciiValue);
		
		 ch = 'x';
		 asciiValue = assignment26.charToAscii(ch);
		System.out.println(" Ascii Value of " + ch + " is " + asciiValue);
		
		 ch = ' ';
		 asciiValue = assignment26.charToAscii(ch);
		System.out.println(" Ascii Value of " + ch + " is " + asciiValue);
		
		ch = '.';
		 asciiValue = assignment26.charToAscii(ch);
		System.out.println(" Ascii Value of " + ch + " is " + asciiValue);
		
	}
}
