package ravindra;

public class AsciiValueChar {
	char asciValue(int a) {
		char c=(char)a;
		return c;
	}
	
public static void main(String []args) {
	AsciiValueChar asciiValueChar=new AsciiValueChar();
	char ascci_1=asciiValueChar.asciValue(65);
	System.out.println(ascci_1);
	
	char ascci_2=asciiValueChar.asciValue(90);
	System.out.println(ascci_2);
	
	char ascci_3=asciiValueChar.asciValue(55);
	System.out.println(ascci_3);
}
}
