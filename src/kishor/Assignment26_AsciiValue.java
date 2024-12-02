package kishor;

public class Assignment26_AsciiValue {
	
	void displayAsciiValue(char ch) {
		int num=ch; //character value assign to integer-it should print ascii value for that character
		System.out.println("The Ascii value for given character is:- "+num);
	}
	
	public static void main(String[] args) {
		Assignment26_AsciiValue assignment26 = new Assignment26_AsciiValue();
		assignment26.displayAsciiValue('A');
		assignment26.displayAsciiValue('x');
		assignment26.displayAsciiValue(' ');
		assignment26.displayAsciiValue('.');
	}
}
