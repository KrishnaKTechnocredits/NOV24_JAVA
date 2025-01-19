package reshma;

public class Assignment27_AsciiToChar {
	void printAsciiToChar(int ascii) {
		char ch=(char)ascii;
		System.out.println(ascii+ " is represented by char " +ch);
	}
	
	public static void main(String []args) {
		Assignment27_AsciiToChar assignment27=new Assignment27_AsciiToChar();
		assignment27.printAsciiToChar(65);
		assignment27.printAsciiToChar(90);
		assignment27.printAsciiToChar(55);
		}
}
