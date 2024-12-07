package reshma;

public class Assignment28_PrintCTAandATC {
	void printAsciiToChar(int ascii) {
		char ch=(char)ascii;
		System.out.println(ascii+ " - " +ch);
	}
	
	void printCharToAscii(char ch) {
		int ascii=ch;
		System.out.println( ch + " - " +ascii);
	}
	
	public static void main(String []args) {
		Assignment28_PrintCTAandATC assignment28=new Assignment28_PrintCTAandATC();
		System.out.println("Ascii value is represented by char is");
		for(int asciinum=65;asciinum<=100;asciinum++) {
			assignment28.printAsciiToChar(asciinum);
		}
		
		System.out.println("Ascii value of char is");
		for(char ch='A';ch<='Z';ch++) {
			assignment28.printCharToAscii(ch);
		}
	}
}
