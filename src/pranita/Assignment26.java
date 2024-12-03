package pranita;

class Assignment26{
	
	void charToAscii(char ch){
		int ascii = ch;
		System.out.println("Ascii value of " + ch + " is :" +ascii);
	
	}
	
	public static void main(String [] args){
		Assignment26 assignment26 = new Assignment26();
		assignment26.charToAscii('A');
		assignment26.charToAscii('x');
		assignment26.charToAscii(' ');
		assignment26.charToAscii('.');
	}
}