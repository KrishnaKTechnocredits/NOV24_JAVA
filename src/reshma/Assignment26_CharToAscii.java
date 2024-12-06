package reshma;

public class Assignment26_CharToAscii {
	/*void printCharToAscii(char ch) {
	int ascii=ch;
	System.out.println("Ascii vaiue of char " + ch + " is: " +ascii);
}

public static void main(String[]args) {
	Assignment26_CharToascii assignment26=new Assignment26_CharToascii();
	assignment26.printCharToAscii('A');
	assignment26.printCharToAscii('x');
	assignment26.printCharToAscii(' ');
	assignment26.printCharToAscii('.');
	}*/
	
//with return type
int printCharToAscii(char ch) {
	int ascii=ch;
	return ascii;
}

public static void main(String[]args) {
	Assignment26_CharToAscii assignment26=new Assignment26_CharToAscii();
	char ch='A';
	int asciiValue=assignment26.printCharToAscii(ch);
	System.out.println("Ascii value of char " +ch+ " is " +asciiValue);
	
	ch='x';
	asciiValue=assignment26.printCharToAscii(ch);
	System.out.println("Ascii value of char " +ch+ " is " +asciiValue);
	
	ch=' ';
	asciiValue=assignment26.printCharToAscii(ch);
	System.out.println("Ascii value of char " +ch+ " is " +asciiValue);
	
	ch='.';
	asciiValue=assignment26.printCharToAscii(ch);
	System.out.println("Ascii value of char " +ch+ " is " +asciiValue);
}
}
