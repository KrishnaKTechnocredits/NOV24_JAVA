package siddharth;

public class Assignment27 {
	
	void getChar(int ascii) {
		System.out.println("Input is : " + ascii);
		char ch = (char)ascii;
		System.out.println("Output is : " + ch);
	}

	public static void main(String[] args) {
		Assignment27 assignment27 = new Assignment27();
		assignment27.getChar(65);
		assignment27.getChar(90);
		assignment27.getChar(55);
		
	}
}