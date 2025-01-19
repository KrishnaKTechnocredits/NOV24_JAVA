package ashwini.asciiAssignment;

public class AsciiAssignment26 {
	void charToAscii(char ch) {
		int ascii =ch;
		System.out.println("Ascii value for "+ch+" is "+ ascii);	}
    
	public static void main(String[] args) {
		 AsciiAssignment26 assn26= new  AsciiAssignment26();
		assn26.charToAscii('A');
		assn26.charToAscii('x');
		assn26.charToAscii(' ');
		assn26.charToAscii('.');
	}

}
