package prem;

public class Assignment29 {

	
	void charToAscii2() {
		for(char ch = 'A'; ch <='Z';ch++) {	
			int ascii =ch;
			System.out.println(ch +" ->" + ascii);
		}
	}	
	
	void charToAscii22(){
		for(char ch = 'a'; ch <='z';ch++) {	
			int ascii =ch;
			System.out.println(ch +" ->" + ascii);
		}
	}	
	
		void asciiToChar2(){
			for(int digit = 65; digit <=100 ;digit++) {	
				char ascii =(char)digit;
			    System.out.println("Ascii value for " +digit +" is " + ascii);
			}
		}	
		
	public static void main(String[] args) {
		Assignment29 assign29 = new Assignment29();
		assign29.charToAscii2();
		assign29.charToAscii22();
		assign29.asciiToChar2();
	}	
}	
