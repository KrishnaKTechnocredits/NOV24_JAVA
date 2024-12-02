package siddharth;

public class Assignment26 {

	void getAsciiValue(char ch) {
		System.out.println("Input is : " + ch);
		int num = ch;
		System.out.println("Output is : " + num);
	}

	public static void main(String[] args) {
		Assignment26 assignment26 = new Assignment26();
		assignment26.getAsciiValue('A');
		assignment26.getAsciiValue('x');
		assignment26.getAsciiValue(' ');
		assignment26.getAsciiValue('.');

	}
}
