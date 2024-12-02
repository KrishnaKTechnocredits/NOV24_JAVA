package ravindra;

public class AsciiValue {
	int charecter(char cha) {
		int integer=cha;
		return integer;
	}
	
	public static void main(String []args) {
		AsciiValue asciiValue= new AsciiValue();
		int char_A = asciiValue.charecter('A');
		System.out.println(char_A);
		
		int char_x = asciiValue.charecter('x');
		System.out.println(char_x);
		
		int char_ = asciiValue.charecter(' ');
		System.out.println(char_);
		
		int chardot = asciiValue.charecter('.');
		System.out.println(chardot);
	}
}