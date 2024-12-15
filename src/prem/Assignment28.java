package prem;

public class Assignment28 {
	
	int charToAscii1(char ch) {
		int ascii =ch;
		return ascii;
	}	
	
	int asciiToChar1(int digit) {
		char ascii =(char)digit;
		return ascii;
	}	
		
	public static void main(String[] args) {
		Assignment28 assign28 = new Assignment28();
		
		for(char ch = 'A'; ch <='Z';ch++) {	
			int ans =assign28.charToAscii1(ch);
		    System.out.println(ch +" ->" + ans);
	    }
		
		for(char digit = 65; digit <=100 ;digit++) {	
			int ans =assign28.asciiToChar1(digit);
		    System.out.println("Ascii value for " +ans +" is " + digit);
		}   
	}	
}		
